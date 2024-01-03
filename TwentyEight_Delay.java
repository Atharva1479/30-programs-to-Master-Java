//28. Make a 5 second delay in your code    

public class TwentyEight_Delay {
    public static void main(String[] args) {
        try {
            Thread.sleep(5000); // 5000 milliseconds = 5 seconds
            System.out.println("Delay complete.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*public class TwentyEight_Delay {
    public static void main(String[] args) {
        try {
            Thread.sleep(5000); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display table of 5
        for (int i = 1; i <= 10; i++) {
            int result = 5 * i;
            System.out.println("5 * " + i + " = " + result);
        }
    }
}
 */