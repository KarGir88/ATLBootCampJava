package atlacademy.bootcamp.ejercicios.ejercicios_clase_5_6_7_8;

import java.util.Scanner;

public class Ejercicio_1_2_3_Clase_7 {

    public static void main(String[] args) {
        // Crear un arreglo para almacenar los números
        int[] numeros = new int[5];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los números
        System.out.println("Ingresa 5 números:");

        // Leer los números ingresados por el usuario y almacenarlos en el arreglo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números ingresados utilizando un bucle for-each
        System.out.println("Los números ingresados son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Encontrar el número mayor y el número menor
        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];
        int suma = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
            suma += numeros[i];
        }

        // Calcular el promedio
        double promedio = suma / 5.0;

        // Mostrar el número mayor, el número menor y el promedio
        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);
        System.out.println("El promedio es: " + promedio);
    }
}


