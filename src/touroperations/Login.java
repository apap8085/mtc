/**
 * 
 */
package touroperations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author aadhish
 *
 */
public class Login {

WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void userLogin()
	{
		
		System.out.println("Executing Login_User Test Case");
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		
		WebElement signin= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]")));
		signin.click();
		
		// Enter login credentials
		driver.findElement(By.name("userName")).sendKeys("john103.smith@test.com");
		driver.findElement(By.name("password")).sendKeys("Demo123#");
		
		// Login
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println("Login Successful!");
	}
	
}
