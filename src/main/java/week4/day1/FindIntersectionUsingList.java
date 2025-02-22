package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {

		// Declare an array for {3, 2, 11, 4, 6, 7}
		List<Integer> array1 = new ArrayList<Integer>();
		array1.add(0, 3);
		array1.add(1, 2);
		array1.add(2, 11);
		array1.add(3, 4);
		array1.add(4, 6);
		array1.add(5, 7);
		System.out.println("Array List 1 is : " + array1);

		// Declare another array for {1, 2, 8, 4, 9, 7}
		List<Integer> array2 = new ArrayList<Integer>();
		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);
		System.out.println("Array List 2 is : " + array2);

		// Sorting Array1 and Array2 - not really needed just to understand the concept
		// of sorting in collections doing this
		Collections.sort(array1);
		System.out.println("Array List 1 after sorting is : " + array1);

		Collections.sort(array2);
		System.out.println("Array List 1 after sorting is : " + array2);

		System.out.print("Numbers identical in both the arrays are : ");

		for (int i = 0; i < array1.size(); i++) {

			for (int j = 0; j < array2.size(); j++) {

				if (array1.get(i) == array2.get(j)) {

					System.out.print(array1.get(i) + ", ");
				}

			}

		}

	}

}
