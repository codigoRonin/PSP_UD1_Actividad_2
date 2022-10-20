import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Ejercicio4 {

    public static void main(String[] args) {

        File file = new File(".\\bin");
        Process proceso;
        ProcessBuilder processBuilder = new ProcessBuilder("java","Ejercicio3");
        processBuilder.directory(file);

        try {

            proceso = processBuilder.start();
            OutputStream outputStream = proceso.getOutputStream();

            outputStream.write("Hola\n".getBytes());
            outputStream.write("adios\n".getBytes());
            outputStream.write("perro\n".getBytes());
            outputStream.write("gato\n".getBytes());
            outputStream.write("*".getBytes());

            outputStream.close();
            int caracterUnicode;

            InputStream inputStream = proceso.getInputStream();

            while ((caracterUnicode = inputStream.read())!= -1) {
                System.out.print((char)caracterUnicode);
            }

        } catch (IOException exception) {
            
           System.out.println(exception.getMessage());
        }



    }

}
