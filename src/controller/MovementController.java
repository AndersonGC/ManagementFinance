package controller;

import java.util.Vector;
import model.Movement;
import repository.MovementRepository;

public class MovementController {
    
    private final MovementRepository movRepository = new MovementRepository();

    public void registerMovement(Movement newMovement) {
        
        movRepository.insertMovement(newMovement);
    }

    public void removeMovement(Movement deletedMovement) {
        this.movRepository.removeMovement(deletedMovement.getId());
    }

    public Vector<Movement> allEntry() {
        Vector<Movement> entryData = this.movRepository.searchAll();
        return entryData;
    }
    
    public Double updateResult() {
        Double entrada = 0D, saida = 0D, result = 0D;
        
        for(int i = 0; i < getListMovement().size(); i++) {
            if(getListMovement().get(i).getTransactionType() == true) {
                entrada += getListMovement().get(i).getValue();
            } else {
                saida += getListMovement().get(i).getValue();
            }
        }
        result = entrada - saida;
        return result;
    }
    
    public Double updateEntry() {
        Double result = 0D;
        
        for(int i = 0; i < getListMovement().size(); i++) {
            if(getListMovement().get(i).getTransactionType() == true) {
                result += getListMovement().get(i).getValue();
            }
        }
        return result;
    }
        
    public Double updateExit() {
        Double result = 0D;
        
        for(int i = 0; i < getListMovement().size(); i++) {
            if(getListMovement().get(i).getTransactionType() == false) {
                result += getListMovement().get(i).getValue();
            } 
        }
        
        return result;
    }
    
    public Vector<Movement> getListMovement() {
        Vector<Movement> movements = movRepository.searchAll();
        
        return movements;
    }
}
