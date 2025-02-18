package week3.day2;

public class Elements extends Button {

	public static void main(String[] args) {

		// This class extends Button so ideally can invoke button class methods and
		// WebElement base class methods

		Elements options = new Elements();
		options.submit(); // from Button sub class
		options.click(); // from WebElement base class
		options.setText("Successful"); // from WebElement base class

	}

}
