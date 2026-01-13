
package unidad.pkg4.poo.alvarojesusperezmenendez.taller1.ejercicios;

public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    

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

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
    
    
}
