package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver= driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='nav-line-1-container']")
	WebElement click;
	
	public void Goto() {	
	driver.manage().window().maximize();
    driver.get("https://www.amazon.com/");	
	}
	public void MoveTo() {	
    Actions a = new Actions(driver);
    a.moveToElement(driver.findElement(By.xpath("//div[@class='layoutToolbarPadding']/child::a[1]/child::span"))).build().perform();
    
	}
	@SuppressWarnings("deprecation")
	public void implecitWait() {
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);				
	}
	public void click() {
	   click.click();	
	}
	
	
	
	
	
	
}
