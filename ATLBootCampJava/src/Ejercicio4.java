import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entradaDato=new Scanner(System.in);
        double totalCuentaRestaurante, porcentajePropina, montoPropina;

        System.out.println("Ingresa el monto total de la cuenta del restaurante: ");
        totalCuentaRestaurante= entradaDato.nextInt();

        System.out.println("Ingresa el porcentaje de propina que desea dejar: ");
        porcentajePropina= entradaDato.nextInt();

        montoPropina=(totalCuentaRestaurante * (porcentajePropina/100));

        System.out.println("El monto de la propina es $"+montoPropina);

    }
}
