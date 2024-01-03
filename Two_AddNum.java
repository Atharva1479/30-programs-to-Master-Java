//2. Add two numbers entered by the user

import java.util.Scanner;

public class Two_AddNum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Addition: " + sum);
    }
}