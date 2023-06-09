import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entradaDato=new Scanner(System.in);
        double precioProducto, porcentajeDescuento, precioFinalConDescuento;

        System.out.println("Ingresa el precio del producto: ");
        precioProducto= entradaDato.nextInt();

        System.out.println("Ingresa el porcentaje de descuento: ");
        porcentajeDescuento= entradaDato.nextInt();

        precioFinalConDescuento=(precioProducto-(precioProducto * porcentajeDescuento)/100);

        System.out.println("Para un Precio de Producto de $" + precioProducto+ " con un descuento de "
                + porcentajeDescuento + "% el Precio final con descuento es de $" + precioFinalConDescuento);

    }
}
