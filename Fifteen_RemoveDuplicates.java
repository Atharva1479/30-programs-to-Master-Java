//15. Remove duplicates from a list of numbers

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {
        ArrayList<String> pets = new ArrayList<>();

        pets.add("cat");
        pets.add("dog");
        pets.add("cat");
        pets.add("hamster");

        System.out.println(pets);

        Set<String> hashSet = new LinkedHashSet(pets);
        ArrayList<String> removedDuplicates = new ArrayList(hashSet);

        System.out.println(removedDuplicates);
    }
}


/*import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Fifteen_RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(5);

        List<Integer> uniqueNumbers = removeDuplicates(numbers);

        System.out.println("Original list: " + numbers);
        System.out.println("List with duplicates removed: " + uniqueNumbers);
    }

    private static List<Integer> removeDuplicates(List<Integer> numbers) {
        Set<Integer> uniqueSet = new HashSet<>(numbers);
        return new ArrayList<>(uniqueSet);
    }
}*/

// Java Program to Remove Duplicate Elements
// From the Array using Set

/*import java.util.*;

class GFG {

	// Function to remove duplicate from array
	public static void removeDuplicates(int[] a)
	{
		LinkedHashSet<Integer> set
			= new LinkedHashSet<Integer>();

		// adding elements to LinkedHashSet
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);

		// Print the elements of LinkedHashSet
		System.out.print(set);
	}

	// Driver code
	public static void main(String[] args)
	{
		int a[] = {5,2,6,8,6,7,5,2,8};
	
		// Function call
		removeDuplicates(a);
	}
}*/
