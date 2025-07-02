/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller8.ejercicios;

/**
 *
 * @author Mitzuke
 */
//Si hacemos esto, no nos dejara, dado que, en Java no se puede aplicar la herencia multiple.

//public class Clase extends Vehiculo, Empleado {
//    
//}

public class Clase extends Vehiculo {
    
    public Clase(String marca, int velocidadMaxima) {
        super(marca, velocidadMaxima);
              
    }
    //HAciendo lo del ejercicio 4 me dejara acceder porque desde el principio lo puse en protected
    //Pero si lo pongo en private, este no me dejara, me saldra un error de compilacion el cual me dira
    //que el atributo es privado
        public void mostrarMarca(){
            System.out.println(marca);
        }
}
