import java.util.Scanner;

public class BuscadorPaisesGoogle_Clase_6 {

    public static void main(String[] args){
        Scanner entradaTeclado = new Scanner(System.in);
        String pais;

        System.out.println("Ingrese el pais que desea buscar: ");
        pais= entradaTeclado.nextLine();

        System.out.println("Presiona el link para ubicar en el Google Maps " + pais + " https://www.google.com/maps/search/"+pais);

    }
}
