package atlacademy.bootcamp.ejercicios.poo_clase_9_ej1;

import java.time.LocalDate;


public class Persona {

    private String id;
    private String nombre;
    private Integer edad;
    private LocalDate fechaNacimiento;
    private String dni;

    public Persona() {
        this.id="";
        this.nombre="";
        this.edad=0;
        this.fechaNacimiento=null;
        this.dni="";
    }
    public String getId(){

        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public LocalDate getFechaNacimiento(){

        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getDni(){
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void mostrarDatos(){
        System.out.println("Id: "+id);
        System.out.println("Nombre "+nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Fecha de nacimiento: "+ fechaNacimiento);
        System.out.println("DNI: "+ dni);
    }
    public boolean mayorEdad(){
        return edad>=18;
    }
}
