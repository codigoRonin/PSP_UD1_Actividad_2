import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejercicio2 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio1");
        pb.directory(new File("./bin"));

        try {
            Process p = pb.start();
            OutputStream os = p.getOutputStream();
            os.write("9\n".getBytes());
            os.write("6".getBytes());
            os.flush();
            os.close();
            InputStream is = p.getInputStream();
            int c = 0;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();

            int valorSalida = p.waitFor();
            if (valorSalida != 0) {
                is = p.getErrorStream();
                c = 0;
                while ((c = is.read()) != -1) {
                    System.out.print((char) c);
                }
                is.close();
            }
            System.out.println("El valor de salida es: " + valorSalida);
        } catch (IOException e) {

            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
