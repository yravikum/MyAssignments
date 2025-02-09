package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadViaBasicLocators {

	public static void main(String[] args) {

		// Instantiation of ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Enter the Username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Enter Login Button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on Leads Tab
		driver.findElement(By.linkText("Leads")).click();

		// Click on Create Leads Link
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Enter Forename
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");

		// Enter Surname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murthy");

		// Enter Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");

		// Click the "Create Lead" button
		driver.findElement(By.name("submitButton")).click();

		// Verify that the Title is displayed correctly
		String title = driver.getTitle();

		String matchTitle = "View Lead | opentaps CRM";

		if (title.equals(matchTitle)) {

			System.out.println("Page Title is matched & the title is displayed as : " + title);

		} else {

			System.out.println("Incorrect Page Tile");
		}

		// Click Logout Button
		driver.findElement(By.linkText("Logout"));

		// close the Window
		driver.close();

	}

}
