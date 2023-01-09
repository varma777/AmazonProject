package AmazonTestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MainPage {

	@Test
	public static void AmazonRealTime() {	
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		LandingPage landingpage = new LandingPage (driver);
		landingpage.Goto();
		landingpage.MoveTo();
		
				
		
	}

}
