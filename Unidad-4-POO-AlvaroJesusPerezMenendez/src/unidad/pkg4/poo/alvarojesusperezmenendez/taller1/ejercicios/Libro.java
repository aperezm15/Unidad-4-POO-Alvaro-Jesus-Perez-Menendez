
package unidad.pkg4.poo.alvarojesusperezmenendez.taller1.ejercicios;

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
    
    
    
    public void mostrarInformacion(){
        System.out.println("Titulo: "+ titulo + ", Autor: " + autor + ", Numero de Paginas: " + numeroPaginas + ".");
        
    }
    
}
