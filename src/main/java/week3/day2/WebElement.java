package week3.day2;

public class WebElement {

	public void click() {
		System.out.println("click() invoked from Base Class - WebElement");
	}

	public void setText(String text) {
		System.out.println("setText() invoked from Base Class - WebElement");
		System.out.println(text);
	}

	public static void main(String[] args) {
		WebElement options = new WebElement();

		options.click();
		options.setText("hola");

	}

}
