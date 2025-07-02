/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller7.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Utilidades {
    //Tenemos los atributos en publico
    public int a;
    public int b;
    
    //Hacemos un constructor por default, porque enrealidad queremos ingresar los datos nosotros mismos
    //asi que no queremos crear un objeto donde se tenga que poner valores en codigo.
    public Utilidades() {
        a = 0;
        b = 0;
    }
    
    //Como habiamos dicho que teniamos los atributos en publico, no tenemos que ingresar con set para modificar
    //Simplemete directo. Esto lo hago con el fin de mostrar el acceso public del que trata el taller.
    
    

    //Creamos un metodo que nos de print de los numeros ingresados y el resultado en su
    //respectiva operacion matematica.
    public void mostrarDetalle () {
        System.out.println("Tenemos dos numeros ingresados: "+a+" y "+b+".");
        System.out.println("la suma de "+a+" + "+b+" = "+(a+b));
        System.out.println("la resta de "+a+" + "+b+" = "+(a-b));
        System.out.println("la multiplicacion de "+a+" + "+b+" = "+(a*b));
        System.out.println("la division de "+a+" + "+b+" = "+(a/b));
    }
    
}
