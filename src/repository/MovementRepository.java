package repository;

import Tools.ConnectionFabric;
import model.Movement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Timestamp;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import model.Classification;

public class MovementRepository {

    private Connection connection;

    public MovementRepository() {
        connection = ConnectionFabric.getInstance();
    }

    public boolean insertMovement(Movement newMovement) {

        try {
            PreparedStatement transaction = connection.prepareStatement("INSERT INTO movement("
                    + "name , value, classification, entry_day, registration_day, movement_type) VALUES(?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            transaction.setString(1, newMovement.getName());
            transaction.setDouble(2, newMovement.getValue());
            transaction.setString(3, newMovement.getClassification().toString());
            transaction.setTimestamp(4, new Timestamp(newMovement.getEntryDay().getTime()));
            transaction.setTimestamp(5, new Timestamp(newMovement.getRegistrationDay().getTime()));
            transaction.setBoolean(6, newMovement.getTransactionType());

            transaction.execute();

            ResultSet tuplaKey = transaction.getGeneratedKeys();

            if (tuplaKey.next()) {
                newMovement.setId(tuplaKey.getLong("id"));
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(MovementRepository.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return false;
        }
    }

    public Vector<Movement> searchAll() {
        Vector<Movement> movements = new Vector<>();
        try {
            PreparedStatement tran = connection.prepareCall("SELECT * FROM movement");
            ResultSet tuplas = tran.executeQuery();

            while (tuplas.next()) {
                Movement movementBD = new Movement(
                        tuplas.getString("name"),
                        Classification.getClassification(tuplas.getString("classification")),
                        tuplas.getDouble("value"),
                        new Date(tuplas.getTime("entry_day").getTime()),
                        new Date(tuplas.getTime("registration_day").getTime()),
                        tuplas.getBoolean("movement_type"),
                        tuplas.getLong("id")
                );
                movements.add(movementBD);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MovementRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        return movements;
    }

    public void removeMovement(long id) {
        try {
            PreparedStatement transaction = connection.prepareStatement("DELETE FROM movement WHERE id=?");
            transaction.setLong(1, id);
            transaction.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MovementRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
