package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContacts {

	public static void main(String[] args) throws InterruptedException {

		// Instantiate the Chrome Driver
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// maximize the window
		driver.manage().window().maximize();

		// Enter the username and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		// Click on the Contacts button.
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		// Click on Merge Contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		// Click on the widget of the "From Contact"
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a")).click();

		// Click on the first resulting contact
		Set<String> fromContact = driver.getWindowHandles();

		List<String> fromContact1 = new ArrayList<String>(fromContact);

		driver.switchTo().window(fromContact1.get(1));

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

		driver.switchTo().window(fromContact1.get(0));

		// Click on the widget of the "To Contact"
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a")).click();

		// Click on the second resulting contact.
		Set<String> toContact = driver.getWindowHandles();

		List<String> toContact1 = new ArrayList<String>(toContact);

		driver.switchTo().window(toContact1.get(1));

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();

		driver.switchTo().window(toContact1.get(0));

		// Click on the Merge button
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

		// Accept the alert
		driver.switchTo().alert().accept();

		// Verify the title of the page
		System.out.println("Title of the Page is : " + driver.getTitle());
		if (driver.getTitle().contains("View Contact")) {
			System.out.println("Merge Contact is Successful");
			
		//close the driver
		driver.close();

		}

	}

}
