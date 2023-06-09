import java.util.Scanner;

public class Ejercicio1 {

        public static void main(String[] args) {

            Scanner entradaDato=new Scanner(System.in);
            Integer edadPerro, resultado;

            System.out.println("Ingresa la edad de tu perro, vamos a convertirla a edad humana: ");
            edadPerro= entradaDato.nextInt();
            resultado=edadPerro * 7;

            System.out.println("Tu perro en edad humana tiene "+ resultado + " años");

        }
    }

