//16. Write a function that triples its input

public class Sixteen_TripleInput {
    public static void main(String[] args) {
        int number = 5;
        int triple = tripleInput(number);
        System.out.println("Triple of " + number + " is: " + triple);
    }

    private static int tripleInput(int number) {
        return number * 3;
    }
}

/*public class Sixteen_TripleInput {
    public static void main(String[] args) {
        String text = "Hello";
        String tripleText = tripleInput(text);
        System.out.println("Triple of \"" + text + "\" is: " + tripleText);
    }

    private static String tripleInput(String text) {
        return text + text + text;
    }
}
 */