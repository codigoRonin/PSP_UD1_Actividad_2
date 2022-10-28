import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String cadena = stdin.nextLine();
        stdin.close();
        if (cadena.length() < 1) {
            System.err.println("La cadena no contiene nada");
            System.exit(-1);
        }

        cadena = cadena.toLowerCase().replace("á", "a")
                .replace("é", "e").replace("í", "i")
                .replace("ó", "o").replace("ú", "u")
                .replaceAll("[^a-z0-9]", "");

        String invertida = new StringBuilder(cadena).reverse().toString();

        System.out.println(cadena.equals(invertida) ? "Es un palindromo" : "No es un palindromo");

    }
}
