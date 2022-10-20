import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    /*
     * Crea un programa en Java que lea dos números desde la entrada estándar y
     * visualice su suma.
     * Controlar que lo introducido por teclado sean dos números enteros, en caso
     * contrario el programa debe
     * finalizar con valor 1 e indicar el error por la salida de error standard.
     */

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {

            int numero1 = Integer.parseInt(solicitarNumero());
            int numero2 = Integer.parseInt(solicitarNumero());
                      
            System.out.println("El resultado es: " + sumarNumeros(numero1, numero2));
            //scanner.close();

            System.exit(0);

        } catch (InputMismatchException | ArrayIndexOutOfBoundsException exception) {
            System.out.println("error: " + exception.getMessage());
            //scanner.close();
            System.exit(1);

        }

    }

    private static String solicitarNumero() {

        //System.out.println("Introduce un numero: ");

        return scanner.nextLine();
    }

    private static int sumarNumeros(int numero1, int numero2) {

        return numero1 + numero2;

    }

}
