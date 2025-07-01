/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez;
import unidad.pkg4.poo.alvarojesusperezmenendez.taller4.ejercicios.*;

/**
 *
 * @author Mitzuke
 */
public class TestTaller4Coche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1 = new Coche("chevrolet", "2016",80);
        
        //aqui intentamos acceder directamente a las propiedades del coche, con los atributos de la clase
        //nos dara error, dado que estas propiedades estan privadas
        
        /*
        System.out.println("La marca del coche 1 es: "+coche1.marca);
        System.out.println("El modelo del coche 1 es: "+coche1.modelo);
        System.out.println("La velocidad maxima del coche 1 es: "+coche1.velocidadMaxima);
        */
        
        //Para esto necesitamos los getter y setters, que es la foma correcta, para tener acceso y modificar.
        System.out.println("La marca del coche 1 es: "+coche1.getMarca());
        System.out.println("El modelo del coche 1 es: "+coche1.getModelo());
        System.out.println("La velocidad maxima del coche 1 es: "+coche1.getVelocidadMaxima());
        
        //Usemos el metodo acelear
        coche1.acelerar(20);
        
        System.out.println("Coche actualizado.");
        System.out.println(coche1);
        
    }

   
    
}
