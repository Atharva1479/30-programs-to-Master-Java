//4. Determine if number is even or odd

import java.util.Scanner;

public class Four_EvenOdd {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}