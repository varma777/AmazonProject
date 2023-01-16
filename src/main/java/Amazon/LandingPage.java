package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver= driver;
	}
	public void Goto() {
		
	driver.manage().window().maximize();
    driver.get("https://www.amazon.com/");	
	}
	public void MoveTo() {	
    Actions a = new Actions(driver);
    a.moveToElement(driver.findElement(By.xpath("//div[@class='layoutToolbarPadding']/child::a[1]/child::span"))).build().perform();
    
    
	}
	
	
}
