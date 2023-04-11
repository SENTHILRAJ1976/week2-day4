package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	

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

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@class=' x-form-text x-form-field '])[1]")).sendKeys("Senthil");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[(contains(text(), 'Find Leads'))]")).click();
		
		Thread.sleep(2000);
		
		WebElement findEle1 = driver.findElement(By.xpath("//div[1]/table/tbody/tr[1]/td[3]/div/a"));
		
		String txt = findEle1.getText();
		
		System.out.println(txt);
		
		findEle1.click();

		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String txt1 = driver.getTitle();
		System.out.println(txt1);
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Tech Mahindra Ltd");
		
		driver.findElement(By.xpath("//table/tbody/tr[12]/td[2]/input")).click();
		
	
		

	}

}
