package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {

		// Instantiation of ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://en-gb.facebook.com/");

		// Maximize the Browser Window
		driver.manage().window().maximize();

		// Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();

		// Enter the First name
		driver.findElement(By.name("firstname")).sendKeys("Demofbuser");

		// Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("A");

		// Enter the Date Of Birth
		// Enter Date
		WebElement date = driver.findElement(By.id("day"));
		Select dateDD = new Select(date);
		dateDD.selectByIndex(5); // Selecting by Index Value - Note. Index Starts from 0

		// Enter Month
		WebElement month = driver.findElement(By.id("month"));
		Select monthDD = new Select(month);
		monthDD.selectByValue("4"); // Selecting by Value

		// Enter Year
		WebElement year = driver.findElement(By.id("year"));
		Select yearDD = new Select(year);
		yearDD.selectByVisibleText("1980"); // Selecting by Visible Text

		// Selecting the Gender
		driver.findElement(By.xpath("(//input[@id=\"sex\"])[2]")).click();

		// Enter the Mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("test@tester.com");

		// Enter the New password
		driver.findElement(By.id("password_step_input")).sendKeys("P@$$Word!15");

		// Close the Window
		driver.close();

	}

}
