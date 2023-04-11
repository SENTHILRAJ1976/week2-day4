package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {

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

		driver.findElement(By.linkText("Email")).click();

//				driver.findElement(By.xpath("//input[@name='emailAddress']")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("senthil_raj2000@yahoo.com");

		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		WebElement findEle = driver.findElement(By.xpath("//table/following::tr[2]/td[1]/div/a"));

		WebElement findEle = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		
		Thread.sleep(2000);
		
		String text = findEle.getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		findEle.click();
		
//		driver.findElement(By.xpath("//table/following::tr[2]/td[1]/div/a")).click();

		/*
		 * 
		 * driver.findElement(By.xpath("//div/table/tbody/tr[1]/td[1]/div/a")).click();
		 */

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement findElement2 = driver.findElement(By.linkText("Duplicate Lead"));

		findElement2.click();

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.linkText("Create Lead")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TechM");

		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Senthil");

		driver.findElement(By.xpath("//input//input[@id='createLeadForm_lastName']")).sendKeys("Raj");

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("44");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9444416557");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rajsenthil76@gmail.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String title2 = driver.getTitle();

		System.out.println(title2);
		
		if(text.equals(title2)){
			
			System.out.println("duplicated lead name is same as captured name");
			
		}else
			System.out.println("duplicated lead name is not same as captured name");
		

		// close the window
		driver.close();

	}

}
