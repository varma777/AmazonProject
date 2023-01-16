package AmazonTestPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MainPage {

	@SuppressWarnings("deprecation")
	@Test
	public static void AmazonRealTime()  {	
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	LandingPage landingpage = new LandingPage (driver);
	landingpage.Goto();
	landingpage.MoveTo();
	driver.findElement(By.xpath("//div[@class='layoutToolbarPadding']//a[2]//div//span")).click();        
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("9866412795");
	driver.findElement(By.xpath("//div[@class='a-section']//span[@id='continue']")).click();
	driver.findElement(By.xpath("//div[@class='a-section a-spacing-large']//input")).sendKeys("Varma@123");
		
	}

}
