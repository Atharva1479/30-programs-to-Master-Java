//20. Generate a random English letter

import java.util.Random;

public class Twenty_RandomLetter {
    public static void main(String[] args) {
        Random random = new Random();
        char randomLetter = (char) (random.nextInt(26) + 'a');

        System.out.println("Random English letter: " + randomLetter);
    }
}
