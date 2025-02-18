package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int num[] = { 1, 4, 3, 2, 8, 6, 7};

		Arrays.sort(num);

		int n = num.length;

		int total = (n * (n + 1)) / 2;

		int sum = 0;

		for (int i = 0; i < n - 1; i++) {
			sum += num[i];
		}

		System.out.println("Missing Number in the Array is : " + (total - sum));

	}

}
