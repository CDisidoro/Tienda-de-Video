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
public class Pez {
    private int idpez;
    private String nombrepez;
    private String colorpez;
    private int pesopez;
    private String nombreesp;
    private String nombretan;
  
    public Pez(int id_pez, String nombre_pez, String color_pez, int peso_pez, String nombretan, String nombreesp ){
        this.idpez = id_pez;
        this.nombrepez = nombre_pez;
        this.colorpez = color_pez;
        this.pesopez = peso_pez;
        this.nombreesp = nombreesp;
        this.nombretan = nombretan;
    }

    /**
     * @return the idpez
     */
    public int getIdpez() {
        return idpez;
    }

    /**
     * @param idpez the idpez to set
     */
    public void setIdpez(int idpez) {
        this.idpez = idpez;
    }

    /**
     * @return the nombrepez
     */
    public String getNombrepez() {
        return nombrepez;
    }

    /**
     * @param nombrepez the nombrepez to set
     */
    public void setNombrepez(String nombrepez) {
        this.nombrepez = nombrepez;
    }

    /**
     * @return the colorpez
     */
    public String getColorpez() {
        return colorpez;
    }

    /**
     * @param colorpez the colorpez to set
     */
    public void setColorpez(String colorpez) {
        this.colorpez = colorpez;
    }

    /**
     * @return the pesopez
     */
    public int getPesopez() {
        return pesopez;
    }

    /**
     * @param pesopez the pesopez to set
     */
    public void setPesopez(int pesopez) {
        this.pesopez = pesopez;
    }

    /**
     * @return the nombreesp
     */
    public String getNombreesp() {
        return nombreesp;
    }

    /**
     * @param idesp the nombreesp to set
     */
    public void setNombreesp(String idesp) {
        this.nombreesp = idesp;
    }

    /**
     * @return the nombretan
     */
    public String getNombretan() {
        return nombretan;
    }

    /**
     * @param idtan the nombretan to set
     */
    public void setNombretan(String idtan) {
        this.nombretan = idtan;
    }
}
