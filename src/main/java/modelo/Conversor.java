/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kelvin
 */
public class Conversor {
    // ATRIBUTOS
    private double quantReal;
    private double CAMBIODOLAR = 5;
    private double CAMBIOEURO = 6;
    private double valor;
    // CONSTRUTOR
    public Conversor(){    }
    
    // METODOS
    public double converter(double r, String moeda){
        quantReal = r;
        switch (moeda){
            case "dolar":
                valor = quantReal*getCAMBIODOLAR();
                break;
            case "euro":
                valor = quantReal*getCAMBIODOLAR();
                break;
        }
        return valor;
    }

    /**
     * @return the CAMBIODOLAR
     */
    public double getCAMBIODOLAR() {
        return CAMBIODOLAR;
    }

    /**
     * @param CAMBIODOLAR the CAMBIODOLAR to set
     */
    public void setCAMBIODOLAR(double CAMBIODOLAR) {
        this.CAMBIODOLAR = CAMBIODOLAR;
    }
}