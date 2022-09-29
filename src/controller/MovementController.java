package controller;

import DAO.MovementDAO;
import Tools.ConectionFabric;
import java.awt.Label;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.Classification;
import model.Movement;
import view.MainFrame;

public class MovementController {

    private final MainFrame view;
    private final MovementDAO movementDAO = new MovementDAO();
    private double result = 0;
    
    
    public MovementController(MainFrame view) {
        this.view = view;

    }

    public Classification returnClassification(Object classification) {
        return (Classification)view.getClassificationCombo().getSelectedItem();
    }

    public void registerMovement() {

        String name = view.getNameTxt().getText();
        Classification classification = (Classification)view.getClassificationCombo().getSelectedItem();
        Double value = Double.valueOf(view.getValueTxt().getText());
        String entryDay = view.getDateTxt().getText();
        Date registrationDay = new Date();
        int transactionType = view.getEntryCheck().isSelected() ?  1 : 0;
        
        Movement mov = new Movement(name, classification, value, entryDay, registrationDay, transactionType);
        System.out.println(mov.toString());

        //movementDAO.insert(new Movement(name, classification, value, entryDay, registrationDay, transactionType));

    }

    //Atualiza o valor do resultado (Ganhos - Gastos)
    public void updateResult() {
        result = 0;//Implemntar o metodo de pesquisa no banco, que retorna o valor de gastos - ganho;
        view.getResultadoTxt().setText("R$ " + result);
    }

    public void updateEntry() {
        result = 0;//Implemntar o metodo de pesquisa no banco, que retorna o valor total do ganho;
        view.getEntradaTxt().setText("R$ " + result);
    }

    public void updateExit() {
        result = 0;//Implemntar o metodo de pesquisa no banco, que retorna o valor total dos gastos;
        view.getSaidaTxt().setText("R$ " + result);
    }

    public void removeMovement(int selectedRow) {

    }

    public void updateTable() {

        ArrayList<Movement> movements = movementDAO.selectAll();

        DefaultTableModel tableModel = (DefaultTableModel) view.getEntryTable().getModel();
        tableModel.setNumRows(0);

        for (Movement movement : movements) {
            tableModel.addRow(new Object[]{
                movement.getName(),
                movement.getClassification(),
                movement.getValue(),
                movement.getEntryDay(),
                movement.getRegistrationDay()
            });
        }

    }

}
