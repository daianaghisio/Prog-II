package tp3;

public class Ej3 {

    public static void main(String[] args) {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);

        System.out.println("Libro creado:");
        System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " (" + libro.getAnioPublicacion() + ")");

        // Intentar modificar con un valor inválido
        libro.setAnioPublicacion(1400); // fuera de rango
        System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " (" + libro.getAnioPublicacion() + ")");

        // Modificar con un valor válido
        libro.setAnioPublicacion(2010);
        System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " (" + libro.getAnioPublicacion() + ")");
    }
}

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setter con validación
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion >= 1500 && anioPublicacion <= 2025) { //Desde la primera imprenta hasta ahora
            this.anioPublicacion = anioPublicacion;
            System.out.println("Se intenta actualizar con un año válido: " + anioPublicacion);
        } else {
            System.out.println("Se intenta actualizar con un año inválido: " + anioPublicacion + ". Se mantiene el valor anterior: " + this.anioPublicacion);
        }
    }
}
