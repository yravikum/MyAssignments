package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		// Define String 1
		String text1 = "stops";

		// Define String 2
		String text2 = "potss";

		// Compare if length of String 1 and String 2 is equal
		if (text1.length() == text2.length()) {

			// converting string 1 to char & sorting it out
			char[] text1Array = text1.toCharArray();
			Arrays.sort(text1Array);
			// System.out.println(text1Array);

			// converting string 2 into char & sorting it out
			char[] text2Array = text2.toCharArray();
			Arrays.sort(text2Array);
			// System.out.println(text2Array);

			// using if condition comparing if sorted char are same in both the strings
			if (Arrays.equals(text1Array, text2Array)) {
				System.out.println("Given Words are an Anagram");

			} else {
				System.out.println("Given Words are not an Anagram");

			}

		} else {

			System.out.println("Length mistaches for the given text1 : " + text1 + " " + " & text2 : " + text2
					+ " therefore the strings are not an Anagram");
		}

	}

}
