/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller6.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Gerente extends Empleado {
    String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;                              
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("nombre: "+super.nombre);
        System.out.println("salario: "+super.salario);
        System.out.println("departamento: "+departamento);
    }
    
    
    
}
