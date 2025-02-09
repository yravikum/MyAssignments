package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadViaBasicXpath {

	public static void main(String[] args) {

		// Instantiation of ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Enter the Username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		

		// Enter the password
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		

		// Enter Login Button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); 
		

		// Click on CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click(); //Partial Text Based x-path
	

		// Click on Leads Tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		

		// Click on Create Leads Link
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click(); //Text Based x-path
		

		// Enter CompanyName
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeafOrg"); //Attribute Based x-path
		

		// Enter Forename
		driver.findElement(By.xpath("(//input[contains(@id,'firstName')])[1]")).sendKeys("Mayura"); //Partial Attribute Based x-path
		

		// Enter Surname
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Gupta");
		

		// Enter Title
		driver.findElement(By.xpath("//input[@name='generalProfTitle']")).sendKeys("Miss"); 
	

		// Click the "Create Lead" button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		

		// Verify that the Title is displayed correctly
		String title = driver.getTitle();

		String matchTitle = "View Lead | opentaps CRM";

		if (title.equals(matchTitle)) {

			System.out.println("Page Title is matched & the title is displayed as : " + title);

		} else {

			System.out.println("Incorrect Page Tile");
		}
		
		//Click Logout Button
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		// close the Window
		driver.close();

	}

}
