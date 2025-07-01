/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez;
import unidad.pkg4.poo.alvarojesusperezmenendez.taller3.ejercicios.*;

/**
 *
 * @author Mitzuke
 */
public class TestMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultadoSumar = Matematicas.sumar(5,5);
        System.out.println("Resultado de sumar 5 + 5: "+ resultadoSumar);
        
        int resultadoRestar = Matematicas.restar(6, 5);
        System.out.println("Resultado de restar 6 - 5: "+ resultadoRestar);
        
        int resultadoMultiplicar = Matematicas.multiplicacion(5, 5);
        System.out.println("Resultado de multiplicar 5 * 5: "+ resultadoMultiplicar);
        
        int resultadoDividir = Matematicas.division(10, 5);
        System.out.println("Resultado de dividir 10 / 5: "+ resultadoDividir);
    }
    
}
