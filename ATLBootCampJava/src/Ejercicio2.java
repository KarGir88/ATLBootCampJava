import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entradaDato=new Scanner(System.in);
        double millas, resultadoKilometros;

        System.out.println("Ingresa una distancia en millas, vamos a convertirla en kilometros: ");
        millas= entradaDato.nextInt();
        resultadoKilometros=millas * 1.60934;

        System.out.println(millas + " millas equivale a "+ resultadoKilometros + " kilometros");

    }
}
