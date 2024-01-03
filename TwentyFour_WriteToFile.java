//24. Write Hello World in a file

import java.io.FileWriter;
import java.io.IOException;

public class TwentyFour_WriteToFile {
    public static void main(String[] args) {
        String message = "Hello World";

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(message);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
