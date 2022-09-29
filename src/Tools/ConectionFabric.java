package Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFabric {

    private static Connection conexaoBD;

    public Connection getInstance() {
        
        if (conexaoBD == null) {
            try {
                conexaoBD = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/postgres",
                        "postgres", "root");
            } catch (SQLException ex) {
                System.err.println("Ao endereco do banco e a senha e usuario");
            }
        }

        return conexaoBD;
    }

}
