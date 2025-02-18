package week3.day2;

public class LoginPage extends BasePage {

	// Demonstrating Method Overriding in Java - BasePage and LoginPage Class

	@Override
	public void performCommonTasks() {
		System.out.println("performCommonTasks() invoked from LoginPage");

	}

	public static void main(String[] args) {

		LoginPage options = new LoginPage();

		options.findElement();
		options.clickElement();
		options.enterText();
		options.performCommonTasks(); // performCommonTasks() gets overridden
	}

}
