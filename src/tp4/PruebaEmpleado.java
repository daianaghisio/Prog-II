package tp4;

public class PruebaEmpleado {
    public static void main(String[] args) {
       
        Empleado e1 = new Empleado(100, "Daiana Ghisio", "Desarrolladora", 300000);
        Empleado e2 = new Empleado("Aaron Hlapcich", "QA");

        e1.actualizarSalario(10.0);   // +10%
        e2.actualizarSalario(250000); // +250000

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
