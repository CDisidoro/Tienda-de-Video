/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.de.video;
import Conector.*;
import java.util.Scanner;
/**
 *
 * @author Camilo D'isidoro
 */
public class TiendaDeVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuario,contrasena;
        PostgreSQL test = new PostgreSQL();
        System.out.println("Digite el usuario para acceder al servidor");
        usuario = entrada.nextLine();
        System.out.println("Digite la contraseña para acceder al servidor");
        contrasena= entrada.nextLine();
        test.test(usuario,contrasena);
    }
    
}
