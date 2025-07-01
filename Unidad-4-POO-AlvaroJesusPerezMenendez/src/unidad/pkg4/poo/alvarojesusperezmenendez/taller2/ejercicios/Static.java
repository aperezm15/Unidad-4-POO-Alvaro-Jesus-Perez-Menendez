/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller2.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Static {
    String info1;
    String info2;

    public Static(String info1, String info2) {
        this.info1 = info1;
        this.info2 = info2;
    }
    
    static void mostrarInformacion(){
        System.out.println("La informacion 1 es: "+info1);
        System.out.println("La informacion 2 es: "+info2);
    }
    
}
