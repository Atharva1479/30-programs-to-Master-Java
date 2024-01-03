//8. Print the longest name between 10 names

import java.util.Scanner;

public class Eight_LongestName {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names you want to enter: ");
        int num = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the integer

        String longest = ""; // Initialize the longest name as an empty string

        for (int i = 1; i <= num; i++) {
            System.out.println("Enter name " + i + ": ");
            String name = sc.nextLine();

            if (name.length() > longest.length()) {
                longest = name;
            }
        }

        System.out.println("Longest name is: " + longest);
    }
}
