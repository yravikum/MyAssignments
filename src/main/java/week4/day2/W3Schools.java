package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

	public static void main(String[] args) throws InterruptedException {

		// Instantiate Chrome Driver
		ChromeDriver driver = new ChromeDriver();

		// Load URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// maximize the window
		driver.manage().window().maximize();

		// Click on 'Try It' button Note: Try it button is inside the frame
		WebElement frame = driver.findElement(By.id("iframeResult"));

		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// Alert Handling --> Prompt Alert
		driver.switchTo().alert().sendKeys("Vineeth Malhotra");
		driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();

		// Confirm the action is performed correctly by verifying the text displayed

		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("Text is Displayed as : " + text);
		if (text.contains("cancelled")) {
			System.out.println("Validation Passed : Cancel Button was clicked in the Alert");
		} else if (text.contains("How are you today?")) {
			System.out.println("Validation Passed : Ok Button was clicked in the Alert");
		}

		// close the driver
		driver.close();

	}

}
