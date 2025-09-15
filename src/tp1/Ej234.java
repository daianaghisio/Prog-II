
package tp1;
import java.util.Scanner;
/**
 *
 * @author Daiana Ghisio
 */
public class Ej234 {
 public static void main(String[] args) {
        //Ejercicio 2
        System.out.println("¡Hola, Java!");
        //Ejercicio 3
        String nombre = "Ana";
        int edad = 25;
        double altura = 1.68;
        boolean estudiante = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("¿Es estudiante?: " + estudiante);
        //Ejercicio 4
         Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre_ingreso = input.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad_ingreso = input.nextInt();

        System.out.println("Nombre: " + nombre_ingreso);
        System.out.println("Edad: " + edad_ingreso);

        input.close();
        
    }
    
}
