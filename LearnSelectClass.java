package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// initiate the ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

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

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TechM");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Senthil");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");

		Thread.sleep(2000);

		WebElement cod = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(cod);
		sel.selectByIndex(4);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement cod1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1 = new Select(cod1);
		sel1.selectByVisibleText("Automobile");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement cod2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel2 = new Select(cod2);
		sel2.selectByValue("OWN_CCORP");

		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

		// close the window
		// driver.close();

	}

}
