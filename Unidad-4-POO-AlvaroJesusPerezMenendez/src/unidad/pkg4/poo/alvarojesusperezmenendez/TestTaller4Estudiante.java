/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez;
import unidad.pkg4.poo.alvarojesusperezmenendez.taller4.ejercicios.*;

/**
 *
 * @author Mitzuke
 */
public class TestTaller4Estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Primero creemos un objeto
        Estudiante estudiante1 = new Estudiante("Bella", 18, 3);
        //Probamos los getters de la clase para extraer los datos del objeto.
        System.out.println("Hemos creado un estudiante con el nombre "+estudiante1.getNombre()+ " con "
        +estudiante1.getEdad()+" años, y una nota promedio de "+estudiante1.getNotaPromedio()+".");
        //Y probamos ahora los setters para modificar los datos de este objeto
        estudiante1.setEdad(19);
        estudiante1.setNotaPromedio(4.5);
        System.out.println("La estudiante "+estudiante1.getNombre()+" ha cumplido "+estudiante1.getEdad()+" años y"
                + " su Nota promedio ha subido a "+estudiante1.getNotaPromedio());
        
        //Crearemos otro objeto de Estudiante con valores invalidos.
        Estudiante estudiante2 = new Estudiante("", 101, 6);
        System.out.println("Hemos creado un estudiante 2 sin nombre, con 101 años de edad y una nota promedio de 6 " + estudiante2);
    }
    
    //Tengo un pequeño error
    
}
