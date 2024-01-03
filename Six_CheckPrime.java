//6. Print the prime numbers less than 1000

import java.util.*;

public class Six_CheckPrime {
    public static void main(String args[]) {

        int limit = 1000;

        for (int num = 2; num < limit; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}