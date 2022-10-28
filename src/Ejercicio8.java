import java.io.File;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio8");
        pb.directory(new File("./bin"));
        pb.redirectInput(new File("./resources/Input08.txt"));
        pb.redirectOutput(new File("./resources/Output08.txt"));
        try {
            pb.start();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
