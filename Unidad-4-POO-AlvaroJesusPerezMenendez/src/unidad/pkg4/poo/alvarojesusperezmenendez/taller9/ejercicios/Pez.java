/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller9.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }
    
    @Override
    public void mostrarEspecie (){
        super.mostrarEspecie();
        System.out.println("Tipo de agua: "+tipoDeAgua);
    }
    
}
