/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller3.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Clase {
    String atributo1;
    static int atributo2;
    double atributo3;
    
    
    /*Aqui podemos ver en este metodo que al ser static, tiene problemas al momento de usar un atributo que
    no es estatico, lo que nos dice es "non-static variable atributo cannot be referenced from static context,
    Para esto, desde mi logia, hay dos formas de arreglar esto, ya sea la opcion uno, que no es usar Static
    en el metodo, o, poner los atributos que se vayan a utilizar en el metodo en static
    */
    public static void metodoStaticError() {
//        System.out.println("Monstrar atributo 1: "+atributo1);
        
    }
    
    /* En este metodo utilizamos un atributo estatico en un metodo estatico el cual no nos dara error
    */
    public static void metodoStaticSinError() {
        System.out.println("mostrar atributo 2(static): "+atributo2);
    }
    
    /*En este otro metodo no estatico, ponemos 3 atributos, los cuales dos de ellos no son estaticos y uno si
    */
    
    public void metodoNoStatic() {
        System.out.println("Monstrar atributo 1: "+atributo1);;
        System.out.println("Monstrar atributo 2: "+atributo2);
        System.out.println("Monstrar atributo 3: "+atributo3);
    }
}
