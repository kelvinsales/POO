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
    private double cambioDolar = 5;
    private double cambioEuro = 6;
    private double valor;
    // CONSTRUTOR
    public Conversor(){    }
    
    // METODOS
    public double converter(double r, String moeda){
        quantReal = r;
        switch (moeda){
            case "dolar":
                valor = quantReal*cambioDolar;
                break;
            case "euro":
                valor = quantReal*cambioEuro;
                break;
        }
        return valor;
    }
}