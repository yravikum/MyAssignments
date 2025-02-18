package week3.day1;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {

		int a[] = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(a);

		int b[] = { 1, 2, 8, 4, 9, 7 };
		Arrays.sort(b);

		System.out.println("Matching Numbers in both the arrays are: ");

		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");

				}
			}

		}

	}

}
