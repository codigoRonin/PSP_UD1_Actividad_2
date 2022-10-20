import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            int number2 = scanner.nextInt();
            number += number2;
            System.out.println("La suma de los numero es " + number);
        } catch (InputMismatchException  e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }

}
