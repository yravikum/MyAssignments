package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String text = "changeme";

		char[] charText = text.toCharArray();

		for (int i = 0; i < charText.length; i++) {

			if ((i % 2) != 0) {

				charText[i] = Character.toUpperCase(charText[i]);

			}

		}
		System.out.println(charText);

	}

}
