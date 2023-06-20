package atlacademy.bootcamp.ejercicios.ejercicios_clase_5_6_7_8;

public class AreaCuadradoFunciones_Clase_8 {
    //Hacer una funcion que calcule el area de un cuadrado. Al llamarla debe devolver el area del cuadrado
    public static void main(String[]args){

        float sumatoria=0;

        sumatoria += getAreaCuadrado(10,10);
        sumatoria += getAreaCuadrado(20,20);
        System.out.println("Sumatoria todal: "+ sumatoria);
    }
    private static float getAreaCuadrado(float ancho, float alto){
        float area=ancho*alto;
        System.out.println(area);
        return area;
    }

}
