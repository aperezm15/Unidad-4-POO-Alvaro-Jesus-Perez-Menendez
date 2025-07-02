/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller10.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }
    
    @Override
    public void presentarse () {
        System.out.println("Datos de profesor");
        super.presentarse();
        System.out.println("Asignatura: "+asignatura);
    }
    
}
