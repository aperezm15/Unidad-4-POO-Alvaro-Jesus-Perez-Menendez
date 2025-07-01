/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller2.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Estudiante {
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante() {
        this("Desconocido",0);
    }
    
    public void mostrarEstudiante() {
        System.out.println("El nombre del estudiante es: "+nombre);
        System.out.println("La edad del estudiante es: "+edad);
    }
}

