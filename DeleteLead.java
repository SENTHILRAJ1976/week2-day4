package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// initiate the ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// maximize the window
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// close the window
		// driver.close();

		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		Thread.sleep(5000);

		driver.findElement(By.linkText("CRM/SFA")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Leads")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Find Leads")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.linkText("Phone")).click();

		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");

		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("44");

		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9444416557");

		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement findElement = driver.findElement(By.xpath("//table/following::tr[2]/td[1]/div/a"));
		findElement.click();

		/*
		 * 
		 * driver.findElement(By.xpath("//div/table/tbody/tr[1]/td[1]/div/a")).click();
		 */		 


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.linkText("Delete")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.linkText("Find Leads")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.linkText("Phone")).click();

		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		

		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");

		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("44");

		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9444416557");

		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement errmsg = driver.findElement(By.xpath("//table/following-sibling::div[@class='x-paging-info']"));

		String text = errmsg.getText();

		System.out.println(text);
	
		// close the window
		driver.close();

	}

}
