package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElements {

	public static void main(String[] args) {

		// Declare an array {1, 2, 3, 4, 10, 6, 8}

		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(10);
		array.add(6);
		array.add(8);

		System.out.println("Array List before sorting is : " + array);

		// Sort the Array
		Collections.sort(array);
		System.out.println("Array List after sorting is : " + array);

		// get the value of the last item in the list
		int size = array.size();
		Integer lastValue = array.get(size - 1);

		// Print the missing numbers
		System.out.print("Missing Numbers in the array list are : ");
		for (int i = 1; i < lastValue; i++) {

			if (!array.contains(i)) {

				System.out.print(i + ", ");

			}

		}

	}

}
