/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller6.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }
    
    protected void mostrarInfo() {
        System.out.println("tipo : "+tipo);
        System.out.println("marca : "+marca);
        
    }
}


