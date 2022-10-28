import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String aux = "";
        String concat = "";
        do {
            aux = stdin.nextLine();
            concat += aux;
        } while (!aux.equals("*"));
        stdin.close();
        System.out.println(concat.toUpperCase());
    }

}
