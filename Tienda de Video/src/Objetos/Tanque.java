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
public class Tanque {
    private int idtan,volumentan;
    private String nombretan,colortan;

    public Tanque(int idtan,String nombretan, String colortan,int volumentan){
        this.idtan = idtan;
        this.nombretan = nombretan;
        this.colortan = colortan;
        this.volumentan = volumentan;
    }
    
    /**
     * @return the idtan
     */
    public int getIdtan() {
        return idtan;
    }

    /**
     * @param idtan the idtan to set
     */
    public void setIdtan(int idtan) {
        this.idtan = idtan;
    }

    /**
     * @return the volumentan
     */
    public int getVolumentan() {
        return volumentan;
    }

    /**
     * @param volumentan the volumentan to set
     */
    public void setVolumentan(int volumentan) {
        this.volumentan = volumentan;
    }

    /**
     * @return the nombretan
     */
    public String getNombretan() {
        return nombretan;
    }

    /**
     * @param nombretan the nombretan to set
     */
    public void setNombretan(String nombretan) {
        this.nombretan = nombretan;
    }

    /**
     * @return the colortan
     */
    public String getColortan() {
        return colortan;
    }

    /**
     * @param colortan the colortan to set
     */
    public void setColortan(String colortan) {
        this.colortan = colortan;
    }
}
