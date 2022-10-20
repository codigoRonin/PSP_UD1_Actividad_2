import java.util.Scanner;

public class Ejercicio3 {
    /**Crea un programa en Java que lea cadenas de texto a través de la entrada estándar 
     * hasta que el usuario introduzca un *. Después debe mostrar esas cadenas concatenadas y en mayúsculas.*/
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena = "";
        
        do {

            cadena = solicitarTexto();
            System.out.println("la cadena introducida es: "+cadena);
            
        } while (!cadena.equals("*"));

        System.out.println("end entries");
        scanner.close();
    }

    private static String solicitarTexto() {
        
        System.out.println("Introduce una frase: ");

        return scanner.nextLine();
    }
}
