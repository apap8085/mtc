package touroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	
	WebDriver driver;
	
	public FlightFinder(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	public void searchFlight(String journey)
	{
		System.out.println("Executing Search Flight test Case...");
		System.out.println("Searching Flight for " + journey + " journey...");
		
		if(journey=="roundtrip")
		{
		
			if(!driver.findElement(By.cssSelector("input[value='roundtrip']")).isSelected())
				{
					driver.findElement(By.cssSelector("input[value='roundtrip']")).click();
					WebElement d6= driver.findElement(By.name("toMonth"));
					WebElement d7= driver.findElement(By.name("toDay"));
		            Select rm =new Select(d6);
		            rm.selectByIndex(9);
		            Select rd =new Select(d7);
		            rd.selectByValue("24");
				}
		}
		else
		{
			driver.findElement(By.cssSelector("input[value='oneway']")).click();
			
		}
		
		
		WebElement d1= driver.findElement(By.name("passCount"));
		WebElement d2= driver.findElement(By.name("fromPort"));
		WebElement d3= driver.findElement(By.name("fromMonth"));
		WebElement d4= driver.findElement(By.name("fromDay"));
		WebElement d5= driver.findElement(By.name("toPort"));
		
		
		Select pasc=new Select(d1);
		pasc.selectByValue("2");
		
		Select fp=new Select(d2);
		fp.selectByValue("London");
		
		Select fm=new Select(d3);
		fm.selectByIndex(6);
		
		Select fd=new Select(d4);
		fd.selectByVisibleText("20");
		
		Select tp=new Select(d5);
		tp.selectByIndex(2);
		
		driver.findElement(By.cssSelector("input[value='Business']")).click();
		
		driver.findElement(By.name("findFlights")).click();
		
		System.out.println("Searching Flight for " +journey+ " Journey Successful!");
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("reserveFlights")).click();
		System.out.println(driver.getTitle());
		System.out.println("Flight Booked for " +journey+ " Journey Successfully!");
		
	}
	
	
	
}
