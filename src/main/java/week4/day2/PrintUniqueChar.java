package week4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueChar {

	public static void main(String[] args) {

		// You are provided with a string variable: companyName = "google"
		String companyName = "google";

		// Create a Set to store unique characters
		// Set<Character> name = new HashSet<Character>(); //random order
		// Set<Character> name = new TreeSet<Character>(); // ASCII order
		Set<Character> name = new LinkedHashSet<Character>(); // Insertion Order

		// Loop through each character in the input string.
		// Use appropriate method to add characters to the Set.
		for (int i = 0; i < companyName.length(); i++) {

			name.add(companyName.charAt(i));

		}
		System.out.println(name);

	}

}
