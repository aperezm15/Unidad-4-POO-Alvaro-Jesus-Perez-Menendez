/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez;

import unidad.pkg4.poo.alvarojesusperezmenendez.taller10.ejercicios.*;

/**
 *
 * @author Mitzuke
 */
public class TestTaller10Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Bella",18,"Semestre 2");
        Profesor profesor1 = new Profesor("Jhon Arrieta",0,"Programacion Orientada a objetos");
        estudiante1.presentarse();
        System.out.println("\n");
        profesor1.presentarse();
        
    }
    
}
