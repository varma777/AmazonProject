package AmazonTestPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import Amazon.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.TestNGListeners;

public  class MainPage extends TestNGListeners {
	
	@Test
	public static void AmazonRealTime(){
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver = new ChromeDriver();
	LandingPage landingpage = new LandingPage (driver);
	landingpage.implecitWait();
	landingpage.Goto();
	landingpage.MoveTo();
	landingpage.click();
	landingpage.login("hymahyma163@gmail.com", "Varma@123");
	
  }
		
	
}
