package tp2;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumaPares = 0;
        int numero;

        System.out.print("Ingrese un número (0 para terminar o ver el resultado): ");
        numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
            System.out.print("Ingrese un número (0 para terminar o ver el resultado): ");
            numero = scanner.nextInt();
        }

        System.out.println("La suma de los números pares es: " + sumaPares);

        scanner.close();
    }
}
