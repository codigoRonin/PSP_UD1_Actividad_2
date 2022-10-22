import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = "";
        String cadena2 = "";

        while(!cadena.contains("*")){
            cadena = scanner.nextLine();
            cadena2+=cadena;

        }
         String cadena3 = cadena2.replace(" ","");
        System.out.println(cadena3.toUpperCase().replace("*", ""));
    }

}
