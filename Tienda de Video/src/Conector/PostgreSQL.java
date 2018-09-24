/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conector;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Camilo D'isidoro
 */
public class PostgreSQL {
    String driver = "org.postgresql.Driver";
        public void test(String usuario, String clave){
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
                boolean valido = conexion.isValid(5000);
                System.out.println(valido  ? "TEST OK" : "TEST FAIL");
            } catch (SQLException ex) {
                System.out.println("Error: "+ex);
            }
        }
}
