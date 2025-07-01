/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller5.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class TestTaller5Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Intentamos acceder a los atritubos lo cual nos dejara, ya que tenemos getter y setters
        Persona persona1 = new Persona("bella botello", 18);
//        System.out.println(persona1.nombre); //<<<< aqui no nos dejara directamente porque esta en privado
        System.out.println(persona1.edad); //Como vemos este si nos deja porque esta en default.
        
        
        /*
        Teniendo en cuenta esto, los atributos private son excelentes para tener mejor manejabilidad al momento
        de tener seguridad con nuestros datos, mientras que default no tendremos esa seguridad que nos brida
        el private, haciendo que cualquier clase runeable pueda entrar a ella desde el mismo paquete.
        */
    }
    
}
