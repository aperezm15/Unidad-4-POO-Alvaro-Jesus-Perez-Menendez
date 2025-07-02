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
public class TestTaller7Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vamos a crear un objeto
        CuentaBancaria cuenta1 = new CuentaBancaria(1000001, 500000, "Ahorro");
        //Intentaremos acedder directamente a numeroCuenta
        //Esto nos dara error ya que el atributo numeroCuenta es private, por lo cual hay que acceder con Set
        /*
        cuenta1.numeroCuenta = 1000002;
        */
        cuenta1.setNumeroCuenta(1000002); //Forma correcta, ya que el atributo es private
        
        // usamos el metodo de mostrarDetalle
        cuenta1.mostrarDetalle();
    }
    
}
