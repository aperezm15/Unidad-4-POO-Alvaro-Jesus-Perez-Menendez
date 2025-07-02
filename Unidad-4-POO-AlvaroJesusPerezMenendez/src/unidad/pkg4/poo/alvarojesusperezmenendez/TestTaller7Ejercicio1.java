/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez;
import unidad.pkg4.poo.alvarojesusperezmenendez.taller7.ejercicios.*;

/**
 *
 * @author Mitzuke
 */
public class TestTaller7Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vamos a crear un objeto
        Empleado empleado1 = new Empleado ("Bella", 1000000);
        System.out.println(empleado1.toString());
        System.out.println("-------------------------------------------------");
        System.out.println("vamos a actualizar el nombre del objeto creado");
        //Dado que el ejercicio nos dice que el atributo nombre es publico, lo intenteramos editar directamente
        //El cual como vemos, si nos deja, ya que es publico y no es neceasrio un set
        empleado1.nombre = "Bella Botello";
        System.out.println("Nombre actualizado");
        //En cambio el atributo salario, no nos dejara ya que no es publico
        /*
        empleado1.salario = 1200000;
        */
        System.out.println("Vamos a actualizar el salario");
        //Por lo cual hay que usar el set de salario para poder modificarlo
        empleado1.setSalario(1200000);
        System.out.println("Salario actualizado");
        System.out.println("Mostrando informacion de objeto actualizado");
        System.out.println(empleado1.toString());
    }
    
}
