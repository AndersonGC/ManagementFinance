package controller;

import DAO.MovementDAO;
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

    public MovementController(MainFrame view) {
        this.view = view;
        
    }

    public Classification returnClassification(Object classification) {
        return (Classification) view.getClassificationCombo().getSelectedItem();
    }

    public void registerMovement() {

        String name = view.getNameTxt().getText();
        Classification classification = returnClassification(view.getClassificationCombo().getSelectedItem());
        Double value = Double.valueOf(view.getValueTxt().getText());
        String entryDay = view.getDateTxt().getText();
        Date registrationDay = new Date();

        movementDAO.insert(new Movement(name, classification, value, entryDay, registrationDay));
        
    }

    
    public void updateResult(){           
    }
    
    public void updateEntry(){          
    }
    
    public void updateExit(){           
    }
    
    public void removeMovement(){
    }
    
    public void updateTable() {
        
        ArrayList<Movement> movements = movementDAO.selectAll();
        
        DefaultTableModel tableModel = (DefaultTableModel)view.getEntryTable().getModel();
        tableModel.setNumRows(0);
        
                
        for (Movement movement : movements) {
            tableModel.addRow(new Object[]{
                movement.getName(),
                movement.getClassification().getValue(),
                movement.getValue(),
                movement.getEntryDay(),
                movement.getRegistrationDay()   
            });
        }

    }

}
