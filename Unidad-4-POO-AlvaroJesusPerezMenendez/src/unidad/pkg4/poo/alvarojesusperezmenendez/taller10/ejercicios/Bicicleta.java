/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller10.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Bicicleta extends Vehiculo {
    private boolean marcha;

    public Bicicleta(String marca, boolean marcha) {
        super(marca);
        this.marcha = marcha;
    }
    
    public void moverse (){
        super.moverse();
        System.out.println("la bicleta tiene marchas: "+marcha);
    }
    
    
    
}
