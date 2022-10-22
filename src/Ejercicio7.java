import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Ejercicio7 {
    public static void main(String[] args) {

       
        File directorio = new File(".\\bin");
        ProcessBuilder processBuilder = new ProcessBuilder("java","Ejercicio5");
        processBuilder.directory(directorio);
        
        File fEntrada = new File("resources/ficheroEjer7.bat");
        File fSalida = new File("resources/salidaEjer7.txt");
        File fError =  new File("resources/errorEjer7.txt");

        processBuilder.redirectInput(fEntrada);
        processBuilder.redirectOutput(fSalida);
        processBuilder.redirectError(fError);
    
        Process proceso = null;

        try {

            proceso = processBuilder.start();
            
            
            //Hacemos otro inputStream para leer en caso de que salga el error
            try {
                int valorSalida = proceso.waitFor();
                System.out.println(valorSalida);
                if (valorSalida != 0) {
                    InputStream errorSalida = proceso.getErrorStream();

                    BufferedReader bufferError = new BufferedReader(new InputStreamReader(errorSalida));
                    String linea;
                    while ((linea = bufferError.readLine()) != null) {
                        System.out.println("Error: " + linea);

                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}