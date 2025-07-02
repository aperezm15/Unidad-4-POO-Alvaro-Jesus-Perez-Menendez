/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller8.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
        
    }
    
    
    public void MostrarInformacion () {
        System.out.println("La marca del vehiculo es: "+super.marca);
        System.out.println("La velocidad Maxima es: "+super.velocidadMaxima);
        System.out.println("El numero de puertas del vehiculo es: "+numeroDePuertas);
        
        
    }
    
}
