package week3.day2;

public class RadioButton extends Button {

	public void selectRadioButton() {
		System.out.println(
				"selectRadioButton method invoked from subclass - RadioButton & extends Button class which indeed extends WebElement base class");
	}

	public static void main(String[] args) {

		RadioButton options = new RadioButton();
		options.selectRadioButton(); // from RadioButton sub class
		options.submit(); // from Button sub class
		options.click(); // from WebElemnts base class
		options.setText("All in Good Time"); // from WebElemnts base class

	}

}
