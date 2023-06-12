
import java.util.Scanner;

public class BuscadorTwitter_Clase_6 {
    public static void main(String[] args){
        Scanner entradaTeclado = new Scanner(System.in);
        String palabra;

        System.out.println("Ingrese el nombre de una celebridad ( solo una palabra) para buscar en Twitter: ");
        palabra= entradaTeclado.nextLine();

        System.out.println("Presiona el link para buscar en Twitter " + palabra + " https://twitter.com/search?q="+ palabra);

    }
}
