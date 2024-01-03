//12. Check if a string contains only letters

import java.util.Arrays;

public class Twelve_CheckLetters {
    public static void main(String args[]) {
        String str = "HelloWorld";

        boolean containsOnlyLetters = str.matches("[a-zA-Z]+");

        if (containsOnlyLetters) {
            System.out.println("The string contains only letters.");
        } else {
            System.out.println("The string contains non-letter characters.");
        }
    }
}
