import java.io.File;
import java.io.IOException;

public class Ejercicio7 {
    public static void main(String[] args) {
		ProcessBuilder pb= new ProcessBuilder("java", "Ejercicio5");
		pb.directory(new File("./bin"));
		pb.redirectInput(new File("./resources/Input07.txt"));
		pb.redirectError(new File("./resources/Error07.txt"));
		pb.redirectOutput(new File("./resources/Output07.txt"));
		try {
			pb.start();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
}
