/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez;
import java.util.Scanner;
import unidad.pkg4.poo.alvarojesusperezmenendez.taller1.ejercicios.*;

/**
 *
 * @author Mitzuke
 */
public class MainTaller1 {

    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creamos objetos de Libros con los contrustores que se crearon.
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupery", 94);
        Libro libro2 = new Libro();
        
        //Creamos objetos de CuentaBancaria con los contructores que se crearon.
        CuentaBancaria cuenta1 = new CuentaBancaria(991584958, 252000, "Ahorro");
        CuentaBancaria cuenta2 = new CuentaBancaria(952684688, "Ahorro");
        CuentaBancaria cuenta3 = new CuentaBancaria();
        
        //Creamos objetos de Estudiante con los contructores que se crearon.
        Estudiante estudiante1 = new Estudiante("Bella Botero", 18, "II Semestre");
        Estudiante estudiante2 = new Estudiante("Alvaro Jesus", 26);
        Estudiante estudiante3 = new Estudiante();
        
        //Ya que creamos los setters, los utilizaremos para poner en consola, datos de los contructores vacios.
        System.out.println("Vamos a crear un libro!!");
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese el Titulo del libro: ");
        libro2.setTitulo(scanner.nextLine());
        System.out.println("Ingrese el Autor del libro: ");
        libro2.setAutor(scanner.nextLine());
        System.out.println("Ingrese el numero de paginas del libro: ");
        libro2.setNumeroPaginas(Integer.parseInt(scanner.nextLine()));
        System.out.println("Libro creado");
        System.out.println("-------------------------------------------------");
        
        
        System.out.println("Vamos a crear una cuenta bancaria!!");
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese su numero de cuenta: ");
        cuenta3.setNumeroCuenta(Integer.parseInt(scanner.nextLine()));
        System.out.println("Ingrese su saldo: ");
        cuenta3.setSaldo(Double.parseDouble(scanner.nextLine()));
        System.out.println("Ingrese su tipo de cuenta");
        cuenta3.setTipoCuenta(scanner.nextLine());
        System.out.println("Cuenta bancaria creada");
        System.out.println("-------------------------------------------------");
        
        System.out.println("Vamos a crear un Estudiante!!");
        System.out.println("-------------------------------------------------");
        System.out.println("Ingresa el nombre del estudiante");
        estudiante3.setNombre(scanner.nextLine());
        System.out.println("Ingresa la edad del estudiante");
        estudiante3.setEdad(Integer.parseInt(scanner.nextLine()));
        System.out.println("Ingrese el curso del estudiante");
        estudiante3.setCurso(scanner.nextLine());
        System.out.println("Estudiante creado");
        System.out.println("-------------------------------------------------");
        System.out.println("/n");
        //Usamos el metodo toString para mostrar la informacion
        System.out.println("=================================================");
        System.out.println("Lista de libros creados");
        System.out.println(libro1.toString());
        System.out.println("-------------------------------------------------");
        System.out.println(libro2.toString());
        System.out.println("=================================================");
        System.out.println("/n");
        System.out.println("=================================================");
        System.out.println("Lista de cuentas bancarias creadas");
        System.out.println(cuenta1.toString());
        System.out.println("-------------------------------------------------");
        System.out.println(cuenta2.toString());
        System.out.println("-------------------------------------------------");
        System.out.println(cuenta3.toString());
        System.out.println("=================================================");
        System.out.println("/n");
        System.out.println("=================================================");
        System.out.println("Lista de estudiantes creados");
        System.out.println(estudiante1.toString());
        System.out.println("-------------------------------------------------");
        System.out.println(estudiante2.toString());
        System.out.println("-------------------------------------------------");
        System.out.println(estudiante3.toString());
        System.out.println("=================================================");
        
        scanner.close();
        
    }
    
}
