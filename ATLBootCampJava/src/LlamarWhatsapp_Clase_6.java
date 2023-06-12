import java.util.Scanner;

public class LlamarWhatsapp_Clase_6 {
    public static void main(String[] args){
        Scanner entradaTeclado = new Scanner(System.in);
        String numeroWhatsapp;

        System.out.println("Ingrese el numero para llamar por Whatsapp: ");
        numeroWhatsapp= entradaTeclado.nextLine();

        System.out.println("Presiona el link para llamar por Whatsapp al numero " + numeroWhatsapp + " https://api.whatsapp.com/send?phone="+ numeroWhatsapp);

    }
}
