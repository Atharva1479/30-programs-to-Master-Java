//22. Print the current date and time

import java.util.Date;

public class TwentyTwo_CurrentDateTime {
    public static void main(String[] args) {
        // Create a Date object with the current date and time
        Date currentDate = new Date();

        // Print the current date and time
        System.out.println("Current date and time: " + currentDate);

        // Get the current time in milliseconds
        long currentTimeMillis = currentDate.getTime();

        // Create a Date object from the current time in milliseconds
        Date currentTime = new Date(currentTimeMillis);

        // Print the current time
        System.out.println("Current time: " + currentTime);
    }
}
