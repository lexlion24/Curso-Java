package ejercicios;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreFactura = "";
        double precioA = 0.00;
        double precioB = 0.00;
        try {
            System.out.println("Introduce el nombre de la factura: ");
            nombreFactura=scanner.nextLine();

            System.out.println("Introduce un precio: ");
            precioA=scanner.nextDouble();

            System.out.println("Introduce otro precio: ");
            precioB=scanner.nextDouble();
            scanner.nextLine();


        } catch (Exception e){
            System.out.println("Alguno de los valores introducidos es erroneo");
            main(args);
            System.exit(0);
        }

        double totalBruto = precioA + precioB;
        double impuestos= totalBruto * 0.19;
        double totalNeto = totalBruto + impuestos;
        // esto es mejor guardarlo en una variable
        System.out.println("La factura " + nombreFactura + " tiene un total bruto de " + totalBruto +
                " con un impuesto de " + impuestos + " y el monto después de impuesto es de " + totalNeto);

    }
}
