package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {

		// Instantiation of ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// maximize the browser
		driver.manage().window().maximize();

		// Enter the Username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// click the login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click the "crm/sfa" link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		// Click on the Leads Button
		driver.findElement(By.linkText("Leads")).click();

		// Click on Create Lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		// Enter the CompanyName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");

		// Enter the FirstName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vineeth");

		// Enter the LastName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Malhotra");

		// Enter the FirstName (Local) Field Using Xpath //
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Vineeth");

		// Enter the LastName (Local) Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("Malhotra");

		// Enter the Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium Instructor");

		// Enter the Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Instructor for Feb 22025");

		// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vineeth.malhotra@testleaf.comm");

		// Select State/Province as NewYork Using Visible Text
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateProvinceDD = new Select(stateProvince);
		stateProvinceDD.selectByVisibleText("New York");

		// Click on the Create Button
		driver.findElement(By.name("submitButton")).click();

		// Click on the edit button
		driver.findElement(By.linkText("Edit")).click();

		// Clear the Description Field
		driver.findElement(By.id("updateLeadForm_description")).clear();

		// Fill the Important Note Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Belongs to Training batch 001");

		// Click on the update button
		driver.findElement(By.xpath("//input[@value='Update']")).click();

		// Get the Title of the Resulting Page
		System.out.println(" Page Title is : " + driver.getTitle());

		// logout
		driver.findElement(By.linkText("Logout"));

		// Close the browser window.
		driver.close();

	}

}