package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// initiate the ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Launch the URL
		driver.get("http://leaftaps.com/opentaps");

		// maximize the window
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCsr");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);

	//
		Thread.sleep(2000);

	//	driver.close();

	}

}
