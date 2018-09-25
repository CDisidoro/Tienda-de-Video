package Conector;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PostgreSQL {
    String driver = "org.postgresql.Driver";
    int conexito = 0;
        public int loginDB(String usuario, String clave){
            //IMPORTA EL DRIVER POSTGRESQL
           try { 
                Class.forName(driver);
           } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
           }
           //CONECTAR A LA BASE DE DATOS
           Connection conexion = null;
            try {
                conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tienda",usuario, clave);
                conexito = 1;
            } catch (SQLException ex) {
            }
            return conexito;
        }
}
