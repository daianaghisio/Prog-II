package tp3;

public class Ej4 {
    public static void main(String[] args) {
        Gallina g1 = new Gallina(1, 2); // id=1, edad=2 años
        Gallina g2 = new Gallina(2, 1); // id=2, edad=1 año
        
        // Mostrar estados
        g1.mostrarEstado();
        g2.mostrarEstado();

        // Simular acciones
        g1.ponerHuevo();
        g1.envejecer();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        // Mostrar estados
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}

class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo.");
    }

    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha envejecido. Edad actual: " + edad);
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + 
                           " | Edad: " + edad + " años" + 
                           " | Huevos puestos: " + huevosPuestos);
    }
}
