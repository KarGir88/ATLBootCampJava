package atlacademy.bootcamp.ejercicios.ejercicios_clase_5_6_7_8;

public class PantalonCamisaFunciones_Clase_8 {

    public static void main (String[]args){
        calcularPrecioFinal("Pantalon",40,20);
        calcularPrecioFinal("Camisa",30,15);

    }
    public static void calcularPrecioFinal(String producto,double precio, double porcentaje_desc){
        double precio_final=precio-(porcentaje_desc * precio)/100;
        System.out.println("El precio del "+ producto+ " es: $"+precio_final);
    }
}
