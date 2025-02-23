package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {

		// Declare an array {3, 2, 11, 4, 6, 7}
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(11);
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		System.out.println("Array list before sorting is :" + numbers);

		// Sort the Array
		Collections.sort(numbers);
		System.out.println("Array list after sorting is :" + numbers);

		// find the 2nd largest number in the array
		int size = numbers.size();
		System.out.println("The 2nd Largest Number in the Array List is : " + numbers.get(size - 2));

	}

}
