package atlacademy.bootcamp.ejercicios.poo_clientes_clase_9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Cliente cliente1=cargarCliente();
        cliente1.mostrarDatos();
        Cliente cliente2=cargarCliente();
        cliente2.mostrarDatos();
        Cliente cliente3=cargarCliente();
        cliente3.mostrarDatos();

    }

    private static Cliente cargarCliente() {
        Scanner ingresoTeclado = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Ingrese nombre: ");
        //cliente.nombre = ingresoTeclado.nextLine();
        cliente.setNombre(ingresoTeclado.nextLine());

        System.out.println("Ingrese apellido: ");
       // cliente.apellido = ingresoTeclado.nextLine();
        cliente.setApellido(ingresoTeclado.nextLine());

        System.out.println("Ingrese edad: ");
       // cliente.edad = ingresoTeclado.nextInt();
        cliente.setEdad(ingresoTeclado.nextInt());

        System.out.println("El nombre es : " + cliente.getNombre());
        System.out.println("El apellido es: " + cliente.getApellido());
        System.out.println("La edad es: " + cliente.getEdad());

        return cliente;
    }
}
