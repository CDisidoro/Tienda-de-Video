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
                stmt = (Statement) conexion.createStatement();
            } catch (SQLException ex) {
            }
            return conexito;
        }
        
        public static void logout(){
            try{
                conexion.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        
        public static int actualizar(String sql){
            int exito = 0;
            try{
                stmt.executeUpdate(sql);
                exito = 1;
            }catch(SQLException e){
                System.out.println(e);
            }
            return exito;
        }
        
        public static ResultSet consultar(String sql){
            ResultSet resultado = null;
            try{
                resultado = stmt.executeQuery(sql);
            }catch(SQLException e){
                System.out.println(e);
            }
            return resultado;
        }
        
        public static void imprimir(ResultSet resultado){
            try{
                int filas=0;
                int columnas = resultado.getMetaData().getColumnCount();
                columnas++;
                while(resultado.next()){
                    String dato = "";
                    for(int i=1;i<columnas;i++){
                        dato = dato + "  " + ((resultado.getObject(i) == null) ? "" : resultado.getObject(i).toString());
                    }
                    System.out.println(dato);
                filas++;
                }
                System.out.println(filas);
            }catch(SQLException e){
                System.out.println(e);
            }
        }
}
