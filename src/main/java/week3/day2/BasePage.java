package week3.day2;

public class BasePage {

	// Demonstrating Method Overriding in Java - - BasePage and LoginPage Class

	public void findElement() {
		System.out.println("findElement() invoked from BasePage");

	}

	public void clickElement() {

		System.out.println("clickElement() invoked from BasePage");

	}

	public void enterText() {
		System.out.println("enterText() invoked from BasePage");

	}

	public void performCommonTasks() {
		System.out.println("performCommonTasks() invoked from BasePage");
	}

	public static void main(String[] args) {
		BasePage options = new BasePage();
		options.findElement();
		options.clickElement();
		options.enterText();
		options.performCommonTasks();
	}

}
