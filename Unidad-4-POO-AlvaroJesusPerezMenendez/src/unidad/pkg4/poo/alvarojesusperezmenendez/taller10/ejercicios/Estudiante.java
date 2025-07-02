/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller10.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }
    
    @Override
    public void presentarse (){
        System.out.println("Datos de estudiante");
        super.presentarse();
        System.out.println("Curso: "+curso);
    }
    
}
