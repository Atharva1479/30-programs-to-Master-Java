//19. Generate a random number between 2 and 8

import java.util.Random;

public class Nineteen_RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(7) + 2;

        System.out.println("Random number between 2 and 8: " + randomNumber);
    }
}

/*import java.util.Random;

public class GenerateRandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(8 - 2 + 1) + 2;
        System.out.println(randomNumber);
    }
}
 */
