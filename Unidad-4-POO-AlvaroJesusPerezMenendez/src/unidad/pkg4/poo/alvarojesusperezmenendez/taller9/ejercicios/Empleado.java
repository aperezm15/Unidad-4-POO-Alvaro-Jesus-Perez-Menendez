/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller9.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Empleado extends Persona {
    private String departamento;
    
    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }
    
    @Override
    public void mostrarDetalles (){
        super.mostrarDetalles();
        System.out.println("el departamento es: "+departamento);
    }
    
    
}
