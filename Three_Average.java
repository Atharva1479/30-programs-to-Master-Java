//3. Calculate the average of 10 numbers

/*import java.util.Scanner;

public class Three_Average {

    public static void main(String args[]) {

        int n = 10;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        float average = (float) sum / n;

        System.out.println("Average: " + average);
    }
}*/

/*import java.util.Scanner;

public class Three_Average {

    public static void main(String args[]) {

        int n = 10;
        int sum = n * (n + 1) / 2;
        float average = (float) sum / n;

        System.out.println("Average: " + average);
    }
}*/

import java.util.Scanner;

public class Three_Average {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting range: ");
        int start = sc.nextInt();

        System.out.println("Enter the ending range: ");
        int end = sc.nextInt();

        int sum = 0;
        int count = end - start + 1;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        float average = (float) sum / count;

        System.out.println("Average: " + average);
    }
}
