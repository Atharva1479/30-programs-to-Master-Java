//18. Write a function that takes a list of words and returns all the words that end with 'e'

/*import java.util.Scanner;

public class Eighteen_WordsEndingWithE {
    public static String[] findWordsEndingWithE(String[] words) {
        int count = 0;

        // Count the number of words ending with 'e'
        for (String word : words) {
            if (word.toLowerCase().endsWith("e")) {
                count++;
            }
        }

        // Create an array to store the words ending with 'e'
        String[] endingWithE = new String[count];
        int index = 0;

        // Store the words ending with 'e' in the array
        for (String word : words) {
            if (word.toLowerCase().endsWith("e")) {
                endingWithE[index] = word;
                index++;
            }
        }

        return endingWithE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words you want to enter: ");
        int num = sc.nextInt();
        sc.nextLine();

        String[] wordArray = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            wordArray[i] = sc.nextLine();
        }

        String[] wordsEndingWithE = findWordsEndingWithE(wordArray);

        System.out.println("Words ending with 'e':");
        for (String word : wordsEndingWithE) {
            System.out.println(word);
        }
    }
}*/

import java.util.ArrayList;
import java.util.List;

public class Eighteen_WordsEndingWithE {

    // Function to filter words ending with 'e'
    public static List<String> wordsEndingWithE(List<String> wordList) {

        // Create a new list to store the result
        List<String> result = new ArrayList<>();
        
        // Iterate through the input word list
        for (String word : wordList) {

            // Check if the current word ends with 'e'
            if (word.endsWith("e")) {
                // If it does, add it to the result list
                result.add(word);
            }
        }
        
        // Return the list of words ending with 'e'
        return result;
    }

    public static void main(String[] args) {

        // Create a list of words
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("strawberry");
        words.add("pear");
        
        // Call the function to get words ending with 'e'
        List<String> wordsEndingWithE = wordsEndingWithE(words);
        
        // Print the result
        System.out.println("Words ending with 'e': " + wordsEndingWithE);
    }
}







        
        

