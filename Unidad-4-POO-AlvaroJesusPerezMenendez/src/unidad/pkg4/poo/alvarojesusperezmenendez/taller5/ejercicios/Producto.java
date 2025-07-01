/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller5.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Producto {
    String nombre;
    Double precio;
    int stock;

    public Producto(String nombre, Double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Stock: "+stock);
    }
    
}
