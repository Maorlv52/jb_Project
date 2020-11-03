package Maor_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class specs_Page_POM {
	WebDriver driver;

	
	@FindBy (xpath = "//body/div/p/a")
	WebElement backButton;
	
	//"//body/div/p/a"
	public specs_Page_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	void clickBack() {
		backButton.click();
	}
}
