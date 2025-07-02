/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez;
import unidad.pkg4.poo.alvarojesusperezmenendez.taller7.ejercicios.*;

import java.util.Scanner;

/**
 *
 * @author Mitzuke
 */
public class TestTaller7Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un scanner, ya que vamos a introducir datos en consola
        Scanner scanner = new Scanner(System.in);
        //Creamos un objeto con el constructor por default
        Utilidades prueba = new Utilidades();
        //Un mensaje de lo que hara nuestro main
        System.out.println("Se hara suma,resta,multiplicacion y division con dos numeros ingresados");
        //Indicamos con un mensaje que se tiene que introducir el primer numero
        System.out.println("Ingrese el primer numero: ");
        //Entramos directamente al atributo lo ponemos a que sea igual a la entrada de scanner
        prueba.a = (Integer.parseInt(scanner.nextLine()));
        //hacemos lo mismo que hicimos con el primer numero
        System.out.println("Ingrese el segundo numero: ");
        prueba.b = (Integer.parseInt(scanner.nextLine()));
        //Mostramos el metodo de mostrarDetalle, para ver las operaciones
        prueba.mostrarDetalle();
    }
    
}
