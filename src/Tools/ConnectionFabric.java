package Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFabric {

    private static Connection conexaoBD;

    public static Connection getInstance() {
        
        if (conexaoBD == null) {
            try {
                conexaoBD = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/managementfinance",
                        "postgres", "root");
            } catch (SQLException ex) {
                System.err.println("Ao endereco do banco e a senha e usuario");
            }
        }

        return conexaoBD;
    }

}
