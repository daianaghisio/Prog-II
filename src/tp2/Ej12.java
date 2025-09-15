package tp2;

public class Ej12 {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        // Modificar precio en índice 2
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirRecursivo(precios, 0);
    }

    // Impresión recursiva del array
    private static void imprimirRecursivo(double[] arr, int i) {
        if (i == arr.length) return;          // caso base
        System.out.println("Precio: $" + arr[i]);
        imprimirRecursivo(arr, i + 1);        // paso recursivo
    }
}
