//5. Specify the 2nd largest number between 20 numbers

import java.util.Scanner;

public class Five_2ndLargest {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting range: ");
        int start = sc.nextInt();

        System.out.println("Enter the ending range: ");
        int end = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            System.out.println("Enter number " + i + ":");
            int num = sc.nextInt();

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest number between the range " + start + " & " + end + " is " + secondLargest);
    }
}
