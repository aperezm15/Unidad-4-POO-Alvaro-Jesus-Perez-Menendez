/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller2.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void mostrarProducto(){
        System.out.println("El producto: "+ nombre+ ", tiene un precio de: "+ precio);
    }
    
}
