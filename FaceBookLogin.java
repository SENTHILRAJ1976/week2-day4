package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initiate the ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Launch the URL
		driver.get("https://en-gb.facebook.com/");

		// maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rajsenthil76@gmail.com");
//				driver.findElement(By.xpath("(//input[@name='pass'])")).sendKeys("76dilsen");
//
//				driver.findElement(By.xpath("//button[contains(role, 'Log in')]")).click();

		driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Senthil");

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raj");

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("senthil_raj2000@yahoo.com");

		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("76@Dilsen");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement stor = driver.findElement(By.xpath("//select[@id='day']"));

		Select date = new Select(stor);

		date.selectByIndex(12);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));

		month.selectByVisibleText("Sep");
//	 month.selectByValue("9");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));


		
		year.selectByValue("1976");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'][1]/following::input[@name='sex'])[1]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//button[@name='websubmit']"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.close();

	}

}
