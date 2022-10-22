import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            
            int number = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println(number + number2);
            number += number2;
            scanner.close();
            System.out.println("La suma de los numero es " + number);
        } catch (InputMismatchException  e) {
            
            System.out.println(e.getMessage());
            System.exit(1);
            scanner.close();
        }
        

    }

}
