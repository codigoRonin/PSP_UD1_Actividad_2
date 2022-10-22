import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Ejercicio2 {
    public static void main(String[] args) {

        File directorio = new File(".\\bin");
        ProcessBuilder processBuilder = new ProcessBuilder("java","Ejercicio1");
        processBuilder.directory(directorio);
        Process proceso = null;

        try {

            proceso = processBuilder.start();

              //Introducimos la informacion que el proceso va recibir
              OutputStream outPutStream = proceso.getOutputStream();
              outPutStream.write("15\n".getBytes());
              outPutStream.flush();
              outPutStream.write("10".getBytes());

              outPutStream.flush();
              outPutStream.close();
         
         
            //Creamos un inputStream para leer la salida 
            InputStream salida = proceso.getInputStream();
            int caracter;
            while ((caracter = salida.read()) != -1) {
                System.out.print((char) caracter);
            }
            salida.close();
            
            //Hacemos otro inputStream para leer en caso de que salga el error
            try {
                int valorSalida = proceso.waitFor();
                System.out.println("El valor de salida es");
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
