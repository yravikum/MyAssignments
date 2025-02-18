package week3.day2;

public class TestData {

	public void enterCredentials() {
		System.out.println("enterCredentials() invoked from super class - TestData");
	}

	public void navigateToHomePage() {
		System.out.println("navigateToHomePage() invoked from super class - TestData");
	}

	public static void main(String[] args) {

		TestData options = new TestData();
		options.enterCredentials(); // from super class - TestData
		options.navigateToHomePage(); // from super class - TestData

	}

}
