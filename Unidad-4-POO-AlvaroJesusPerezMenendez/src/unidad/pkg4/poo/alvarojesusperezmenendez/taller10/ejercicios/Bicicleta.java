/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller10.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Bicicleta extends Vehiculo {
    private boolean marcha;

    public Bicicleta(String marca, boolean marcha) {
        super(marca);
        this.marcha = marcha;
    }
    //No utilizar Override, no va a dar un error y dejara que corra el programa
    //Pero es mala practica, porque al momento de dar errores, este se independizara
    //y se activara como un metodo a parte, ademas es mas sencillo identificar el problema
    //teniendo el Override.
    @Override
    public void moverse (){
        //esta es la firma de la clase base, el cual si no esta puesta, no hace gracia a usar el override
        //dado que el override significa que vamos a utilizar algo de la clase base.
        super.moverse();
        System.out.println("la bicleta tiene marchas: "+marcha);
    }
    
    
    
}
