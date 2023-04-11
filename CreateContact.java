package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// initiate the ChromeDriver
				ChromeDriver driver = new ChromeDriver();

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
				
				driver.findElement(By.linkText("Contacts")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.linkText("Create Contact")).click();
	
				driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Senthil");
				
				driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Raj");
				
				driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Vivek");
				
				driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Vadivelu");
				
				driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Chemistry");
				
				
				driver.findElement(By.id("createContactForm_description")).sendKeys("Chemistry is often called the central science for its role in connecting all the physical sciences at both the fundamental and applied levels. It is the study of atoms, molecules, chemical changes (reactions), structure and properties of matter.");
				
				
				
				driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("rajsenthil76@gmail.com");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				
				WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
				Select prov = new Select(state);
				
				prov.selectByVisibleText("New York");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
					
				
				
				driver.findElement(By.className("smallSubmit")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				
				driver.findElement(By.linkText("Edit")).click();
		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.findElement(By.id("updateContactForm_description")).clear();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Chemistry is often called the central science for its role in connecting all the physical sciences at both the fundamental and applied levels. It is the study of atoms, molecules, chemical changes (reactions), structure and properties of matter.");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				
				driver.findElement(By.xpath("//input[@value='Update']")).click();
				
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				String title = driver.getTitle();
				
				System.out.println(title);
				

				// close the window
				//driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
