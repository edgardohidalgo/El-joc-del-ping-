
package JUEGO.src.bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexioOracle {
    private Connection conn = null;
    private String url ,user,pass;
    public conexioOracle() {
        conectar();
    }
    private void conectar() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            url = "jdbc:oracle:thin:@l";
            user = "";
            pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Se conecta con exito");
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos");;
        }
    }
    public void desconectar() {
        try{
            conn.close();
        }catch (Exception e) {
            System.out.println("Error al desconectar con la base de datos");;
        }

    }
}
