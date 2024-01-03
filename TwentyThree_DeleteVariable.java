//23. Delete a variable of your program

public class TwentyThree_DeleteVariable {
    public static void main(String[] args) {
        // Declare and initialize a variable
        String message = "Hello, World!";
        System.out.println("Original message: " + message);

        // Set the variable to null
        message = null;

        // Attempt to access the variable after setting it to null
        System.out.println("Modified message: " + message);
    }
}


/*public class TwentyThree_DeleteVariable {
    public static void main(String[] args) {
        // Declare and initialize a variable
        int number = 10;
        System.out.println("Original number: " + number);

        // Use a placeholder value to signify deletion
        number = -1;

        // Attempt to use the variable after using a placeholder value
        System.out.println("Modified number: " + number);
    }
}
 */

 /*public class TwentyThree_DeleteVariable {
    public static void main(String[] args) {
        // Declare and initialize a variable
        boolean flag = true;
        System.out.println("Original flag: " + flag);

        // Set the variable to a special value to indicate deletion
        flag = false;

        // Attempt to use the variable after setting a special value
        System.out.println("Modified flag: " + flag);
    }
}
 */