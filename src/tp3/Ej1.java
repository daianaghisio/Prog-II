package tp3;

public class Ej1 {

    public static void main(String[] args) {
        Estudiante e = new Estudiante("Ana", "Pérez", "2do", 72.5);

        e.mostrarInfo();
        e.subirCalificacion(9.0);
        e.mostrarInfo();
        e.bajarCalificacion(18.5);
        e.mostrarInfo();
    }
}

class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println(apellido + ", " + nombre + " | Curso: " + curso + " | Calificación: " + calificacion);
    }

     public void subirCalificacion(double puntos) {
        calificacion = calificacion + puntos;
        if(calificacion > 100){
            calificacion = 100;
        }
    }

    public void bajarCalificacion(double puntos) {
        calificacion = calificacion - puntos;
        if(calificacion < 0){
            calificacion = 0;
        }
    }
   
}
