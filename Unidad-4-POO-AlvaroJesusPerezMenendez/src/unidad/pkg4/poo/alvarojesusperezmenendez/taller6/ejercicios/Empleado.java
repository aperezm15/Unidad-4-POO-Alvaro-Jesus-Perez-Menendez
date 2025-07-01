/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller6.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    
    
    protected void mostrarInformacion() {
        System.out.println("nombre: "+nombre);
        System.out.println("salario: "+salario);
    }
    
}
