import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine().replace(" ", "");
        if(frase.isEmpty()){
            System.out.println("Frase vacia");
            System.exit(1);
        }
        String frase2 = "";
        for (int j = frase.length()-1; j >= 0; j--) {
           frase2 += frase.charAt(j);
        }
        if(frase.equalsIgnoreCase(frase2)){
            System.out.println("Es palindromo");
        }
    }
}
