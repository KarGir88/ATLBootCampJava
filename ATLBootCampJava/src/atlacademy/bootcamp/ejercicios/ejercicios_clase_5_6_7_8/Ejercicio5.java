package atlacademy.bootcamp.ejercicios.ejercicios_clase_5_6_7_8;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entradaDato=new Scanner(System.in);
        Integer numero, numeroAleatorio;

        System.out.println("Ingresa un numero entre 1 y 100 y veamos si es el mismo que ha generado la computadora: ");
        numero= entradaDato.nextInt();

        numeroAleatorio=(int)(Math.random()*100);

        if(numero==numeroAleatorio){
            System.out.println("Adivinazte!!");
        }else{
            System.out.println("Ohh! No adivinazte esta vez!! ");
        }
    }
}
