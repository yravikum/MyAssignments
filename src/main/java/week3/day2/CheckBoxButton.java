package week3.day2;

public class CheckBoxButton extends Button {

	public void clickCheckButton() {
		System.out.println(
				"ClickCheckButton() invoked from subclass - CheckBoxButton & extends Button class which indeed extends WebElement base class ");
	}

	public static void main(String[] args) {
		CheckBoxButton options = new CheckBoxButton();
		options.clickCheckButton(); // from CheckBoxButton sub class
		options.submit(); // from Button sub class
		options.click(); // from WebElemnts base class
		options.setText("Hello World"); // from WebElemnts base class

	}

}
