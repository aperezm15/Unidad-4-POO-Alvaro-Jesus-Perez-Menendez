/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller3.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Coche {
    String marca;
    String modelo;
    static int contadorCoches;

    public Coche() {
        contadorCoches++; //Incrementa cada vez que se crea un objeto.
    }
    
    public static void mostrarContador(){
        System.out.println("Contador de coches: "+contadorCoches);
    }
}
