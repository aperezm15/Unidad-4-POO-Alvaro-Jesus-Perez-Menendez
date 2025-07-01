/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller1.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    public Libro() {
        titulo = "Desconodico";
        autor = "Desconocido";
        numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    
    
    public void mostrarDetalle(){
        System.out.println("Titulo: "+ titulo + ", Autor: " + autor + ", Numero de Paginas: " + numeroPaginas + ".");
    }
    
}
