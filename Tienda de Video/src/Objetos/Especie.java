/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
public class Especie {
    private int idesp;
    private String nombreesp,alimentoesp;
    
    public Especie(int idesp,String nombreesp,String alimentoesp){
        this.idesp = idesp;
        this.nombreesp = nombreesp;
        this.alimentoesp = alimentoesp;
    }

    /**
     * @return the idesp
     */
    public int getIdesp() {
        return idesp;
    }

    /**
     * @param idesp the idesp to set
     */
    public void setIdesp(int idesp) {
        this.idesp = idesp;
    }

    /**
     * @return the nombreesp
     */
    public String getNombreesp() {
        return nombreesp;
    }

    /**
     * @param nombreesp the nombreesp to set
     */
    public void setNombreesp(String nombreesp) {
        this.nombreesp = nombreesp;
    }

    /**
     * @return the alimentoesp
     */
    public String getAlimentoesp() {
        return alimentoesp;
    }

    /**
     * @param alimentoesp the alimentoesp to set
     */
    public void setAlimentoesp(String alimentoesp) {
        this.alimentoesp = alimentoesp;
    }
}
