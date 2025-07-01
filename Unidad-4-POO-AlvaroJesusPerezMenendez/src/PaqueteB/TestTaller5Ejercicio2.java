/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PaqueteB;
import unidad.pkg4.poo.alvarojesusperezmenendez.taller5.ejercicios.*;
/**
 *
 * @author Mitzuke
 */
public class TestTaller5Ejercicio2 {

    /*
     No he visto el error de compilacion estando desde un paquete diferente, y teniendo de default las propiedades de 
    moto y vehiculo
    
    Ahora bien, si tratamos de ver directamente o modificar una propiedad no nos va a dejar sin tener Getter y setters.
     */
    public static void main(String[] args) {
       Moto moto1 = new Moto("Suzuki gixxer 150", 137);
//        System.out.println(moto1.tipo);
//        System.out.println(moto1.velocidad);
        moto1.mostrarInfo();
    }
    
}
