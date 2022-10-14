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
            sumarNumeros(solicitarNumero(),solicitarNumero());
            
        } catch (InputMismatchException exception) {
            System.out.println("Error: debes introducir un número entero");
            System.exit(1);

        }
      
    }

    private static int solicitarNumero(){
        System.out.println("Introduce un numero");
        return scanner.nextInt();
    }
    
    private static void sumarNumeros(int numero1, int numero2){

        System.out.println("El resultado es: " + (numero1+numero2));
    }

}
