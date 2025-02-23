package week4.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		// Instantiate Chrome Driver
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the window
		driver.manage().window().maximize();

		// In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@type='text' and @aria-label='Search Ajio']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@type='submit' and @aria-label='search']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Print the count of the items found.
		WebElement count = driver.findElement(By.xpath("//div[@class='length']/strong"));
		String countItem = count.getText();
		System.out.println("Count of Items Found is : " + countItem);

		// Get the list of brand of the products displayed in the page and print the
		// list.
		driver.findElement(By.xpath("//span[text()='brands']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.xpath("(//strong[text()='MORE'])[2]")).click();

		List<WebElement> brandNames = driver.findElements(By.xpath("//label[contains(@class,'linkname-brand')]"));

		System.out.println("List of Brands displayed are : ");

		for (WebElement brandNameElement : brandNames) {

			String text = brandNameElement.getText();
			String replaceAll = text.replaceAll("[()0-9]", "");
			System.out.println(replaceAll);

		}

		// Get the list of names of the bags and print it
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		List<WebElement> bagDesc = driver.findElements(By.xpath("//div[@class='nameCls']"));

		System.out.println("List of Brand Name with description are listed below : ");

		for (WebElement bagName1Element : bagNames) {

			String name = bagName1Element.getText();

			for (WebElement bagDescElement : bagDesc) {
				String bagDesc1 = bagDescElement.getText();
				System.out.println("Brand Name : " + name + " " + "Bag Description : " + bagDesc1 + "\n");

			}

		}

		// Close the driver
		driver.close();

	}

}
