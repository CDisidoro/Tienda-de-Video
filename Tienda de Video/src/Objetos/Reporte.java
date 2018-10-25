/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Camilo D'isidoro
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Conector.PostgreSQL;
import java.io.File;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.Exporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

public class Reporte {
    PostgreSQL pos = null;
    Statement stmt = null;
    PreparedStatement prpInser = null;
    String EMPTY = new String();//para que se limpie cuando se va ingresar un daro y el cursor quede vacio

    public int reportePez(){
        int exito = 0;
        LinkedList <Pez> listaPez = new LinkedList();//ya tenemos la lista, yuju
        pos = new PostgreSQL();
        
        String sql="SELECT pez.idpez,pez.nombrepez,pez.colorpez,pez.pesopez,especie.nombreesp,tanque.nombretan FROM pez,especie,tanque WHERE pez.idesp = especie.idesp AND pez.idtan = tanque.idtan;";
                ResultSet resultado = PostgreSQL.consultar(sql);
                try{
                    while(resultado.next()){
                        listaPez.add(new Pez(Integer.parseInt(resultado.getString("idpez")),resultado.getString("nombrepez"),resultado.getString("colorpez"),Integer.parseInt(resultado.getString("pesopez")),resultado.getString("nombretan"),resultado.getString("nombreesp")));
                    }
                }catch(Exception e){
                    System.out.println(e);
                }
            try{
                JasperReport reporte = (JasperReport) JRLoader.loadObject(new File("src/reports/peces.jasper"));//para cargar el jasper(plantilla) y da la ubicacion
                JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(listaPez));//para la lista la ponga en la plantilla
                Exporter exporter = new JRPdfExporter();//para el archivo en blanco
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));//para poner la plantilla con esos datos en el archivo en blanco
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput("src/Recursos/reporte_Peces.pdf"));//da la extension pdf
                exporter.exportReport();//para crear el pdf
                exito=1;
            }catch (JRException e) {
               System.out.println(e.getMessage());
            }
            return exito;
        }    
   
        public int reporteTanque(){
        int exito = 0;
        LinkedList <Tanque> listaTanque = new LinkedList();//ya tenemos la lista, yuju
        pos = new PostgreSQL();
        
        String sql="SELECT * FROM tanque;";
                ResultSet resultado = PostgreSQL.consultar(sql);
                try{
                    while(resultado.next()){
                        listaTanque.add(new Tanque(Integer.parseInt(resultado.getString("idtan")),resultado.getString("nombretan"),resultado.getString("colortan"),Integer.parseInt(resultado.getString("volumentan"))));
                    }
                }catch(Exception e){
                    System.out.println(e);
                }
            try{
                JasperReport reporte = (JasperReport) JRLoader.loadObject(new File("src/reports/tanques.jasper"));//para cargar el jasper(plantilla) y da la ubicacion
                JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(listaTanque));//para la lista la ponga en la plantilla
                Exporter exporter = new JRPdfExporter();//para el archivo en blanco
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));//para poner la plantilla con esos datos en el archivo en blanco
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput("src/Recursos/Reporte_Tanques.pdf"));//da la extension pdf
                exporter.exportReport();//para crear el pdf
                exito=1;
            }catch (JRException e) {
               System.out.println(e.getMessage());
            }
            return exito;
        }
        
        public int reporteEspecie(){
        int exito = 0;
        LinkedList <Especie> listaEspecie = new LinkedList();//ya tenemos la lista, yuju
        pos = new PostgreSQL();
        
        String sql="SELECT * FROM especie;";
                ResultSet resultado = PostgreSQL.consultar(sql);
                try{
                    while(resultado.next()){
                        listaEspecie.add(new Especie(Integer.parseInt(resultado.getString("idesp")),resultado.getString("nombreesp"),resultado.getString("alimentoesp")));
                    }
                }catch(Exception e){
                    System.out.println(e);
                }
            try{
                JasperReport reporte = (JasperReport) JRLoader.loadObject(new File("src/reports/especies.jasper"));//para cargar el jasper(plantilla) y da la ubicacion
                JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(listaEspecie));//para la lista la ponga en la plantilla
                Exporter exporter = new JRPdfExporter();//para el archivo en blanco
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));//para poner la plantilla con esos datos en el archivo en blanco
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput("src/Recursos/reporte_Especies.pdf"));//da la extension pdf
                exporter.exportReport();//para crear el pdf
                exito=1;
            }catch (JRException e) {
               System.out.println(e.getMessage());
            }
            return exito;
        }
        
        public int reporteEvento(){
        int exito = 0;
        LinkedList <Evento> listaEvento = new LinkedList();//ya tenemos la lista, yuju
        pos = new PostgreSQL();
        
        String sql="SELECT evento.idevt,pez.nombrepez,evento.estadoevt,evento.fechaevt FROM evento,pez WHERE evento.idpez=pez.idpez;";
                ResultSet resultado = PostgreSQL.consultar(sql);
                try{
                    while(resultado.next()){
                        listaEvento.add(new Evento(Integer.parseInt(resultado.getString("idevt")),resultado.getString("nombrepez"),resultado.getString("estadoevt"),resultado.getString("fechaevt")));
                    }
                exito=1;
                }catch(Exception e){
                    System.out.println(e);
                }
            try{
                JasperReport reporte = (JasperReport) JRLoader.loadObject(new File("src/reports/eventos.jasper"));//para cargar el jasper(plantilla) y da la ubicacion
                JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(listaEvento));//para la lista la ponga en la plantilla
                Exporter exporter = new JRPdfExporter();//para el archivo en blanco
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));//para poner la plantilla con esos datos en el archivo en blanco
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput("src/Recursos/reporte_Eventos.pdf"));//da la extension pdf
                exporter.exportReport();//para crear el pdf
            }catch (JRException e) {
               System.out.println(e.getMessage());
            }
            return exito;
        }
}   

