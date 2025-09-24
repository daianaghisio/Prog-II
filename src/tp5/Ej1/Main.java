package tp5.ej1;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Daiana Ghisio", "38723464");
        Foto foto = new Foto("Daiana.jpg", "JPG");
        Pasaporte pasaporte = new Pasaporte("P12345", "2025-09-24", foto, titular);

        System.out.println(pasaporte);
        System.out.println(foto);
        System.out.println(titular);
    }
}
