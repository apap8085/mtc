package testtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import touroperations.*;


public class SmokeTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Test Automation\\WebBrowser Drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		String title= driver.getTitle();
		System.out.println(title);
		
		System.out.print("Test Case 1: ");
		Register r=new Register(driver);
		r.registerUser();
		
		System.out.print("Test Case 2: ");
		Login l=new Login(driver);
		l.userLogin();		
		
		System.out.print("Test Case 3: ");
		FlightFinder ff=new FlightFinder(driver);
		ff.searchFlight("roundtrip");
		
		//System.out.print("Test Case 4: ");
		//ff.searchFlight("oneway");
		
		System.out.print("Smoke Test Finished Successfully!");
		
	}

}
