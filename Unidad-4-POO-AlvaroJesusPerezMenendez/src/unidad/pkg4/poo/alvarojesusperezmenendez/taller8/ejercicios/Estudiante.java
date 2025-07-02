/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller8.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }
    
    @Override
    public void mostrarDetalle (){
        super.mostrarDetalle();
        System.out.println(", Matricula: "+matricula);
        
        
    }
    
    
}
