package week3.day2;

public class LoginTestData extends TestData {

	public void enterUsername() {
		System.out.println("enterUsername() invoked from sub class - LoginTestData");
	}

	public void enterPassword() {
		System.out.println("enterPassword() invoked from sub class- LoginTestData");
	}

	public static void main(String[] args) {

		LoginTestData options = new LoginTestData();
		options.enterUsername(); // from sub class LoginTestData
		options.enterPassword(); // from sub class LoginTestData
		options.enterCredentials(); // from super class TestData
		options.navigateToHomePage(); // from super class TestData

	}

}
