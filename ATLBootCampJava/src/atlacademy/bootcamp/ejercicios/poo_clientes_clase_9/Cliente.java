package atlacademy.bootcamp.ejercicios.poo_clientes_clase_9;

import java.sql.SQLOutput;

public class Cliente {

    private String nombre;
    private String apellido;
    private Integer edad;

    public void mostrarDatos(){
        System.out.println("El nombre y apellido del cliente es: "+nombre+" "+apellido);
        System.out.println("La edad del cliente es: "+ edad);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String value){
        nombre=value;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String value){
        apellido=value;
    }

    public Integer getEdad(){
        return edad;
    }
    public void setEdad(Integer value){
        edad=value;
    }
}
