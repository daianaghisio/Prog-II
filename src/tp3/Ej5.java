package tp3;

public class Ej5 {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Aurora", 50);
        nave.despegar();
        nave.avanzar(80);        // intenta avanzar sin combustible suficiente
        nave.recargarCombustible(40);
        nave.avanzar(30);        // avanza correctamente
        nave.mostrarEstado();    // estado final
    }
}

class NaveEspacial {
    private final String nombre;
    private int combustible;
    private static final int MAX_COMBUSTIBLE = 100;
    private static final int COMBUSTIBLE_SUFICIENTE = 70;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial < 0) {
            this.combustible = 0;
        } else if (combustibleInicial > MAX_COMBUSTIBLE) {
            this.combustible = MAX_COMBUSTIBLE;
        } else {
            this.combustible = combustibleInicial;
        }
    }

    public void despegar() {
        if (combustible >= COMBUSTIBLE_SUFICIENTE) {
            System.out.println(nombre + " despegó.");
        } else {
            System.out.println("No hay combustible suficiente para despegar.");
        }
    }

    public void avanzar(int distancia) {
        if (distancia <= 0) {
            System.out.println("Distancia inválida.");
            return;
        }
        if (combustible >= distancia) {
            combustible -= distancia; // consume 1 unidad por 1 de distancia
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad de recarga inválida.");
            return;
        }
        int antes = combustible;
        combustible = Math.min(combustible + cantidad, MAX_COMBUSTIBLE);
        System.out.println("Se cargaron " + (combustible - antes) + " unidades (tope " + MAX_COMBUSTIBLE + ").");
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
}
