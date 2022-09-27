
package DAO;

import java.util.ArrayList;
import java.util.Date;
import model.Classification;
import model.Movement;

public class MovementDAO {
        public static ArrayList<Movement> movement;
        
        public ArrayList<Movement> selectAll(){
        
        movement = new ArrayList<>();
        
        Date reg = new Date();
        
        Movement movement1 = new Movement("Ricardo", Classification.CASA, 10.0, "30/05/2010", reg);
        Movement movement2 = new Movement("Anderson", Classification.CASA, 10.0, "30/05/2010", reg);
        Movement movement3 = new Movement("João", Classification.CASA, 10.0, "30/05/2010",reg);
        Movement movement4 = new Movement("Julio", Classification.CASA, 10.0, "30/05/2010", reg);
        Movement movement5 = new Movement("Pedro", Classification.CASA, 10.0, "30/05/2010", reg);
        Movement movement6 = new Movement("Marcio", Classification.CASA, 10., "30/05/2010", reg);
        Movement movement7 = new Movement("Alex", Classification.CASA, 10.0, "30/05/2010", reg);
        
        movement.add(movement1);
        movement.add(movement2);
        movement.add(movement3);
        movement.add(movement4);
        movement.add(movement5);
        movement.add(movement6);
        movement.add(movement7);
        
        
        return movement;
    }

}
