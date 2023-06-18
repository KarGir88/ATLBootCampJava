public class GeneradorContraseñasFunciones_Clase_8 {
    //Generar contraseñas
    public static void main(String[]args){
        String nuevoPassword = generarPassword();
        System.out.println(nuevoPassword);

    }
    private static String generarPassword(){
        double aleatorio= Math.random()*1000000;
        long numeroAleatorio= Math.round(aleatorio);

        String password="abcd"+numeroAleatorio;
        return password;
    }
}

