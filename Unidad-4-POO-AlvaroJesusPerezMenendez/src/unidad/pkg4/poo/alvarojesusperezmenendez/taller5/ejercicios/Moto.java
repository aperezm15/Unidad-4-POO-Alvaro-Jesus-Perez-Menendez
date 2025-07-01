/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller5.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Moto extends Vehiculo {
    int velocidad;

    public Moto(String tipo, int velocidad) {
        super(tipo);
        this.velocidad = velocidad;
    }

public void mostrarInfo(){
    System.out.println("tipo de moto: "+super.tipo);
    System.out.println("velocidad maxima: "+velocidad);
}
    
    
    
}
