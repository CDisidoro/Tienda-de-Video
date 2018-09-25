package Conector;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PostgreSQL {
        static Connection conexion = null;
        static Statement stmt = null;
        public int loginDB(String usuario, String clave){
           String driver = "org.postgresql.Driver";
           int conexito = 0;
            //IMPORTA EL DRIVER POSTGRESQL
           try { 
                Class.forName(driver);
           } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
           }
           //CONECTAR A LA BASE DE DATOS
            try {
                conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Acuario",usuario, clave);
                conexito = 1;
            } catch (SQLException ex) {
            }
            return conexito;
        }
        public static Connection getCon(){
            return conexion;
        }
        public static Statement getState(){
            return stmt;
        }
}
