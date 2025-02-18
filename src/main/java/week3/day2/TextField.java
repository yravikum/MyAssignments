package week3.day2;

public class TextField extends WebElement {

	public void getText() {
		System.out.println("getText() invoked from sub class - TextField & extends WebElement base class");
	}

	public static void main(String[] args) {

		TextField options = new TextField();
		options.getText(); //from TextField sub class 
		options.click(); //from WebElemnts base class
		options.setText("Hi"); //from WebElements base class 

	}

}
