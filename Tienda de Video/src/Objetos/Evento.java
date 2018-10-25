/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import java.sql.Date;
/**
 *
 * @author Camilo D'isidoro
 */
public class Evento {
    private int idevt;
    private String nombrepez,estadoevt;
    private String fechaevt;

    public Evento(int idevt,String nombrepez,String estadoevt,String fechaevt){
        this.idevt = idevt;
        this.nombrepez = nombrepez;
        this.estadoevt = estadoevt;
        this.fechaevt = fechaevt;
    }
    /**
     * @return the idevt
     */
    public int getIdevt() {
        return idevt;
    }

    /**
     * @param idevt the idevt to set
     */
    public void setIdevt(int idevt) {
        this.idevt = idevt;
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
     * @return the estadoevt
     */
    public String getEstadoevt() {
        return estadoevt;
    }

    /**
     * @param estadoevt the estadoevt to set
     */
    public void setEstadoevt(String estadoevt) {
        this.estadoevt = estadoevt;
    }

    /**
     * @return the fechaevt
     */
    public String getFechaevt() {
        return fechaevt;
    }

    /**
     * @param fechaevt the fechaevt to set
     */
    public void setFechaevt(String fechaevt) {
        this.fechaevt = fechaevt;
    }
}
