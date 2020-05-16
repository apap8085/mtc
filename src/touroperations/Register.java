package touroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class Register {

	WebDriver driver;
	
	public Register(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	public void registerUser()
	{
		System.out.println("Executing Register_User Test Case");
		
		//Open User Registration Page
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
		// Fill User Registration Form
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Smith");
		driver.findElement(By.name("phone")).sendKeys("1234512345");
		driver.findElement(By.name("userName")).sendKeys("john103.smith@test.com");
		driver.findElement(By.name("address1")).sendKeys("BK complex");
		driver.findElement(By.name("address2")).sendKeys("Street A");
		driver.findElement(By.name("city")).sendKeys("Mumbai");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("postalCode")).sendKeys("410030");
		driver.findElement(By.name("email")).sendKeys("john103.smith@test.com");
		driver.findElement(By.name("password")).sendKeys("Demo123#");
		driver.findElement(By.name("confirmPassword")).sendKeys("Demo123#");
		
		WebElement dd1=driver.findElement(By.name("country"));
		Select country=new Select(dd1);
		country.selectByValue("92");
		
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// Submit User Registration Form
		driver.findElement(By.name("register")).click();
		
		System.out.println(driver.getTitle());
		System.out.println("User Registration Successful!");
		
	}
	
	
	
}
