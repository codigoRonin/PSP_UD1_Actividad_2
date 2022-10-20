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
        int numero1;
        int numero2;

        try {

            // if (args.length != 0) {
                numero1 = Integer.parseInt(args[0]);
                numero2 = Integer.parseInt(args[1]);
            // }else{
            //     numero1 = solicitarNumero();
            //     numero2 = solicitarNumero();
            // }            

            sumarNumeros(numero1, numero2);
            System.exit(0);

        } catch (InputMismatchException | ArrayIndexOutOfBoundsException exception) {
            System.out.println("error: "+exception.getMessage());
            System.exit(1);

        }

    }

    private static int solicitarNumero() {
        System.out.println("Introduce un numero");
        return scanner.nextInt();
    }

    private static void sumarNumeros(int numero1, int numero2) {

        System.out.println("El resultado es: " + (numero1 + numero2));
    }

}
