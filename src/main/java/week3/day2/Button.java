package week3.day2;

public class Button extends WebElement {

	public void submit() {
		System.out.println("submit() invoked from sub class - Button & extends WebElemnts base class");
	}

	public static void main(String[] args) {

		Button options = new Button();
		options.submit(); // from Button sub-class
		options.click(); // from WebElements base class
		options.setText("Hello"); // from WebElements base class

	}

}
