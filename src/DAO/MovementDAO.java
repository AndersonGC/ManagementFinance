package DAO;

import Tools.ConectionFabric;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Classification;
import model.Movement;

public class MovementDAO {

    public static ArrayList<Movement> movement;
    public Statement stmt;
    ConectionFabric conn = new ConectionFabric();

    public ArrayList<Movement> selectAll() {

        movement = new ArrayList<>();

        Date reg = new Date();

        Movement movement1 = new Movement("Ricardo", Classification.CASA, 10.0, "30/05/2010", reg, 1);
        Movement movement2 = new Movement("Anderson", Classification.CASA, 10.0, "30/05/2010", reg,0);
        Movement movement3 = new Movement("João", Classification.CASA, 10.0, "30/05/2010", reg,0);
        Movement movement4 = new Movement("Julio", Classification.CASA, 10.0, "30/05/2010", reg,1);
        Movement movement5 = new Movement("Pedro", Classification.CASA, 10.0, "30/05/2010", reg,0);
        Movement movement6 = new Movement("Marcio", Classification.CASA, 10., "30/05/2010", reg,1);
        Movement movement7 = new Movement("Alex", Classification.CASA, 10.0, "30/05/2010", reg,0);

        movement.add(movement1);
        movement.add(movement2);
        movement.add(movement3);
        movement.add(movement4);
        movement.add(movement5);
        movement.add(movement6);
        movement.add(movement7);

        return movement;
    }
/*
    public void insert(Movement moviment) {
        try {
            String query = "INSERT INTO public.movement"
                    + "(id, registrationday, entryday, name, classification, transactiontype, value) "
                    + " VALUES ('" + registrationday + "','" + entryday + "','" + name + "','" + classification + "','" + transacationType + "','" + value "')";
                    
                    
            conn.stmt = this.con.createStatement();
            conn.stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Movimentacao Inserida!");
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        return mov;

    }
*/
}
