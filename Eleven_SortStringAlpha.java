//11. Sort a list of strings alphabetically

import java.util.Arrays;

public class Eleven_SortStringAlpha {
    public static void main(String args[]) {
        String[] strings = {"apple", "banana", "orange", "grape"};

        Arrays.sort(strings);

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

/*

public class Eleven_SortStringAlpha {
    public static void main(String args[]) {
        String[] strings = {"apple", "banana", "orange", "grape"};

        // Sort the strings using manual sorting algorithm
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].compareToIgnoreCase(strings[j]) > 0) {
                    // Swap the strings
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
 */