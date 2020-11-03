package Maor_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kawasaki_Page_POM {
	
	WebDriver driver;
	
	@FindBy (css = "#cat-1")
	WebElement kawaElement;
	
	
	public kawasaki_Page_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
