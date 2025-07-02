/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller10.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }
    
    public void moverse () {
        System.out.println("El vehiculo es de marca: "+marca);
    }
    
}
