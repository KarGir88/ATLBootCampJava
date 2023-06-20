package atlacademy.bootcamp.ejercicios.poo_clase_9_ej2;

public class Cuenta {
    private String titular;
    private double cantidad;


    public Cuenta() {
        this.titular="";
        this.cantidad=0.0;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(Double cantidad){
        this.cantidad=cantidad;

    }
    public void mostrarDatosTitular(){
        System.out.println("Titular: "+titular);

    }
    public void mostrarDatosSaldos(){
        System.out.println("Cantidad: "+cantidad);
    }
    public void ingresarCantidad(double cantidad){
        if (cantidad >0){
            this.cantidad +=cantidad;
        }
    }
    public void retirarCantidad(double cantidad){
            this.cantidad -=cantidad;
    }
}
