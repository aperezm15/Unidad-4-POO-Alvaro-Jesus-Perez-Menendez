/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller6.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Moto extends Vehiculo {
    int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }
    
    public void mostrarDetalles () {
        mostrarInfo();
        System.out.println("Cilindrada : "+cilindrada);
    }
    
}
