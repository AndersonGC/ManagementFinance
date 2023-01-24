package view;

import controller.MovementController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import model.Classification;
import model.Movement;

public class Table extends AbstractTableModel{

    private Vector<Movement> dataTable;
    private SimpleDateFormat formatDate;
    private final String ColumName[] = {"Nome","Classe","Valor","D.Entr.","D.Cad"};
    private MovementController movementController;
    
    public Table(){
        this.movementController = new MovementController();
        
        updateMovement();
        this.formatDate = new SimpleDateFormat("dd/MM/yyyy");      
    }
    
    private void updateMovement(){
        this.dataTable = new Vector<>();
        this.dataTable.addAll(this.movementController.allEntry());
        
    }
    
    public Movement removeMovement(int index){      
        return this.dataTable.remove(index);
    }
    
    @Override
    public int getRowCount() {
        return this.dataTable.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Movement selectedMovement = this.dataTable.get(linha);
        
        switch(coluna){
            case 0: return selectedMovement.getName();
            case 1: return selectedMovement.getClassification();
            case 2: return selectedMovement.getValue();
            case 3: return formatDate.format(
                    selectedMovement.getEntryDay());
            case 4: return formatDate.format(
                    selectedMovement.getRegistrationDay());
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return ColumName[column];
    }
    
    public void updateNewMovement(Movement newMovement){
        this.dataTable.add(newMovement);
    }
    
}
