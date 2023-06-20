package atlacademy.bootcamp.ejercicios.ejercicios_clase_5_6_7_8;

import java.util.Scanner;

public class IngresarNumerosFunciones_Clase_8 {
    //Hacer un programa que permita cargar 5 numeros y mostrarlos

    public static void main(String[] args) {

        int[] numeros = new int[5];
        cargarNumeros(numeros);
        mostrarNumeros(numeros);
    }

    private static void cargarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int numero= pedirNumeroUsuario();
            numeros[i] = numero;
        }
    }

    private static void mostrarNumeros(int[] numeros) {
        System.out.println("Estos son los numeros que cargaste: ");
        for (int i = 0; i < 5; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println(numeros[i]);
        }
    }
    private static int pedirNumeroUsuario(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros: ");
        int numero = teclado.nextInt();
        return numero;
    }
}

