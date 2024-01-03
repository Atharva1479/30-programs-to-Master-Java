//26. Divide a number by zero without seeing an error

import java.util.Scanner;

public class TwentySix_DivideByZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            System.out.println(number / 0);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error.");
        }
    }
}
