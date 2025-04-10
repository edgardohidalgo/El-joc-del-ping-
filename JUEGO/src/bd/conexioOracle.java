
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
            url = "jdbc:oracle:thin:@localhost:1521:XE";
            user = "DM2425_PIN_GRUP07";
            pass = "AAHRT07";
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
