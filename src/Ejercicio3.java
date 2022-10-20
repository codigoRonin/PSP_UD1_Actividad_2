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
        System.out.println(cadena2.toUpperCase().replace("*", " "));
    }

}
