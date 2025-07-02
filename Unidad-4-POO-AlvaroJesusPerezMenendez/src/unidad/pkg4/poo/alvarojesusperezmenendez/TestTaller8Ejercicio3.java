/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez;
import unidad.pkg4.poo.alvarojesusperezmenendez.taller8.ejercicios.*;

/**
 *
 * @author Mitzuke
 */
public class TestTaller8Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Bella",18);
        Gerente gerente1 = new Gerente("Bella Botello",18,"Ingenieria");        
        System.out.println("Metodo de Objeto de clase Empleado");
        empleado1.mostrarDetalles();
        System.out.println("\n");
        System.out.println("Metodo sobrescrito de Objeto de clase Gerente");
        gerente1.mostrarDetalles();
    }
    
}
