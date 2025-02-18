package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {

		// Instantiation of ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the window
		driver.manage().window().maximize();

		// Enter the Username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Enter Login Button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on Accounts Tab
		driver.findElement(By.linkText("Accounts")).click();

		// Click on Create Account Link
		driver.findElement(By.linkText("Create Account")).click();

		// Enter Account Name
		driver.findElement(By.id("accountName")).sendKeys("Feb-2025 Learning Batch 05");
		String accountName = driver.findElement(By.id("accountName")).getText();

		// Enter Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		// Select "ComputerSoftware" as the industry
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industryDD = new Select(industry);
		industryDD.selectByValue("IND_SOFTWARE");

		// Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipDD = new Select(ownership);
		ownershipDD.selectByVisibleText("S-Corporation");

		// Select "Employee" as the source using SelectByValue.
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sourceDD = new Select(source);
		sourceDD.selectByValue("LEAD_EMPLOYEE");

		// Select "eCommerce Site Internal Campaign" as the marketing campaign using
		// SelectByIndex
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select marketingCampaignDD = new Select(marketingCampaign);
		marketingCampaignDD.selectByIndex(6);

		// Select "Texas" as the state/province using SelectByValue.
		WebElement stateprovince = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateprovinceDD = new Select(stateprovince);
		stateprovinceDD.selectByValue("TX");

		// Click the "Create Account" button
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();

		// Verify that the account name is displayed correctly
		// Needs advanced x-path concepts will implement later
		String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();

		if (text.contains(accountName)) {
			System.out.println("Account name is verified");
		} else {
			System.out.println("Account name is not matched");
		}

		// Click Logout Button
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		// close the Window
		driver.close();

	}

}
