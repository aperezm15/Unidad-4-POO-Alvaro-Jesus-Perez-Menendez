/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PaqueteB;
import unidad.pkg4.poo.alvarojesusperezmenendez.taller6.ejercicios.*;

/**
 *
 * @author Mitzuke
 */
public class TestTaller6Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moto moto1 = new Moto ("Naked", "Suzuki gixxer", 150);
        //Aqui podemos ver que intentamos acceder a los atributos de el objeto creado por moto pero a las
        //propiedades que tiene heredada de Vehiculo que son protected, y no nos dejara
        /*
        System.out.println(moto1.tipo); //Tipo Has protected access in Vehiculo
        System.out.println(moto1.marca); //Marca Has protected access in Vehiculo
        */
        //Aca no nos deja porque como esta en default, solo aceptara si esta en el mismo paqute.
        /*
        System.out.println(moto1.cilindrada);
        */ 
    }
    
}
