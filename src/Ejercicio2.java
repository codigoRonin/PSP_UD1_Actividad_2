import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejercicio2 {

    /**
     * Crea un programa en Java para ejecutar el Ejercicio1 y
     * utiliza el flujo de salida para introducir los valores de la entrada
     * estándar.
     * Realiza comprobaciones tanto con entradas correctas como con incorrectas.
     * Mostrar la salida del proceso y su valor de salida y, en su caso, el mensaje
     * de error.
     */
    public static void main(String[] args) {

        File file = new File(".\\bin");
        Process proceso = null;

        ProcessBuilder processBuilder = new ProcessBuilder("java", "Ejercicio1");

        processBuilder.directory(file);

        try {

            proceso = processBuilder.start();

            OutputStream outputStream = proceso.getOutputStream();

            outputStream.write("2\n".getBytes());
            outputStream.write("3".getBytes());  
            outputStream.flush();
            outputStream.close();            

            int caracterUnicode;

            InputStream inputStream = proceso.getInputStream();
    
            while ((caracterUnicode = inputStream.read()) != -1) {
                System.out.print((char) caracterUnicode);
            }

            inputStream.close();

            // InputStream errorStream = proceso.getErrorStream();

            // while ((caracterUnicode = inputStream.read()) != -1) {
            //     System.out.print((char) caracterUnicode);
            // }

            // errorStream.close();

            try {

                int valorSalida = proceso.waitFor();
                System.out.println("El valor de salida es: "+valorSalida);
            
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
                 

        } catch (IOException exception) {
            System.out.println("{program2 error: "+exception.getMessage()+"}");
        }

    }

    

    // private static void mostrarTerminal(Process proceso) throws IOException {
    //     int caracterUnicode;
    //     InputStream inputStream = proceso.getInputStream();

    //     while ((caracterUnicode = inputStream.read()) != -1) {
    //         System.out.print((char) caracterUnicode);
    //     }
    //     inputStream.close();
    // }

}
