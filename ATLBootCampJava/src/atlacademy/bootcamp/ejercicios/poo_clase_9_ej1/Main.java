package atlacademy.bootcamp.ejercicios.poo_clase_9_ej1;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Persona persona1= new Persona();
        persona1.setId("1");
        persona1.setNombre("Karina");
        persona1.setEdad(49);
        persona1.setDni("20201879");
        persona1.setFechaNacimiento(LocalDate.of(1974,01,26));

        persona1.mostrarDatos();

        if(persona1.mayorEdad()){
            System.out.println("Es mayor de Edad");
        }else{
            System.out.println("No es mayor de Edad");
        }
    }
}