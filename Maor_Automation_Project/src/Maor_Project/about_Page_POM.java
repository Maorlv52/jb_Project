package Maor_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class about_Page_POM {
	WebDriver driver;
	
	@FindBy (css = "p:nth-child(1) > a")
	WebElement backButton;
	
	public about_Page_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	void clickBack() {
		backButton.click();
	}
}
