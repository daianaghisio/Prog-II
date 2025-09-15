package tp2;

import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine().trim();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        if (costoEnvio < 0) {
            System.out.println("Zona inválida. Debe ser 'Nacional' o 'Internacional'.");
            scanner.close();
            return;
        }

        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        scanner.close();
    }

    // a) costo de envío según zona y peso
    public static double calcularCostoEnvio(double peso, String zona) {
        String z = zona.toLowerCase();
        if (z.equals("nacional")) {
            return 5.0 * peso;
        } else if (z.equals("internacional")) {
            return 10.0 * peso;
        } else {
            return -1.0; // señal de error de zona inválida
        }
    }

    // b) total de compra = precio producto + costo envío
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
