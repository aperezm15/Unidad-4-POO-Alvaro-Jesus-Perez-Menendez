/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez;
import  unidad.pkg4.poo.alvarojesusperezmenendez.taller4.ejercicios.*;

/**
 *
 * @author Mitzuke
 */
public class TestTaller4Ejercicio3 {

    
    public static void main(String[] args) {
        Ejercicio3 prueba = new Ejercicio3("aleatorio");
        // Aqui intentamos acceder a la propiedad que esta privada, la cual no nos dejara, porque como lo dje antes
        // es privada
        /*
        System.out.println("queremos ver la propiedad privada de el objeto prueba: "+prueba.propiedad1);
        */
        
        //Sin los getter ni los setter, podremos ver un atributo especifico o modificarlo, esto en la proteccion
        //de datos nos sirve, para tener ciertos atributos que no queremos que por ejemplo
        //se puedan ver, pero no modificar.
    }
    
}
