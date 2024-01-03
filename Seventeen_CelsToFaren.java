//17. Write a function that converts C to F.

import java.util.*;

public class Seventeen_CelsToFaren {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Degree Celsius: ");
        float temp = sc.nextFloat();

        float farh = (temp * 9 / 5) + 32;
        System.out.println("Temperature in Degree  Fahrenheit: " + farh);

    }
}