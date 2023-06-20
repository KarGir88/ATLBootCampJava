package atlacademy.bootcamp.ejercicios.poo_clase_9_ej2;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1=new Cuenta();
        cuenta1.setTitular("Karina");
        cuenta1.setCantidad(100000.0);

        cuenta1.mostrarDatosTitular();
        cuenta1.ingresarCantidad(500000.0);
        cuenta1.mostrarDatosSaldos();
        cuenta1.retirarCantidad(2000000.0);
        cuenta1.mostrarDatosSaldos();
    }
}
