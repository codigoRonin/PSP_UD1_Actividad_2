import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
		int primerSumando=0;
		int segundoSumando=0;
		try {
			primerSumando = stdin.nextInt();
			segundoSumando = stdin.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Debes introducir valores enteros.");
			System.exit(1);
		}
		stdin.close();
		System.out.println("El resultado es "+ (primerSumando+segundoSumando));
        
    }
    
}
