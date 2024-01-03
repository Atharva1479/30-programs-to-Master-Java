//25. Check if a text file contains only letters

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TwentyFive_CheckTextFile {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";

        boolean containsOnlyLetters = checkTextFile(filePath);

        if (containsOnlyLetters) {
            System.out.println("The text file contains only letters.");
        } else {
            System.out.println("The text file contains non-letter characters.");
        }
    }

    private static boolean checkTextFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.matches("[a-zA-Z]+")) {
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }
}

/*import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CheckIfTextFileContainsOnlyLetters {

    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");
        Scanner scanner = new Scanner(file);

        String line;
        boolean allLetters = true;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (!Character.isLetter(line.charAt(i))) {
                    allLetters = false;
                    break;
                }
            }

            if (!allLetters) {
                break;
            }
        }

        if (allLetters) {
            System.out.println("The file contains only letters.");
        } else {
            System.out.println("The file contains non-letter characters.");
        }
    }
}
 */


