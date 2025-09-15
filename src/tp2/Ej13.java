package tp2;

public class Ej13 {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimir(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimir(precios, 0);
    }

    private static void imprimir(double[] arr, int i) {
        if (i >= arr.length) return;
        System.out.println("Precio: $" + arr[i]);
        imprimir(arr, i + 1);
    }
}
