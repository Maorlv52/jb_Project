package Maor_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class main_Page_POM {

	WebDriver driver;
	
	
	
//  Main page "Get a test ride" form variables:
	
	@FindBy (xpath =  "//div[1]/h1")
	WebElement headLine;
	
	@FindBy (name = "F_N")
	WebElement firstName;
	
	@FindBy (name = "L_N")
	WebElement lastName;
	
	@FindBy (name = "Country")
	WebElement country;
	
	@FindBy (css = "input[type='email']")
	WebElement eMail;
	
	@FindBy (name = "areaCode")
	WebElement areaCode;
	
	@FindBy (css = "input[name='Phone']")
	WebElement phone;
	
	@FindBy (name = "SEND")
	WebElement send;
	
	
	
//  Main page side menu buttons
	
	@FindBy (xpath = "//div[6]/div[3]/p/b/a")
	WebElement membershipButton;
	
	@FindBy (xpath = "//div[6]/div[1]/p/b/a")
	WebElement specsButton;
	
	@FindBy (xpath = "//body/div[6]/div[2]/p/b/a")
	WebElement aboutUsButton;
	
	@FindBy (xpath = "//body/div[6]/div[4]/p/b/a")
	WebElement kawasakiButton;
	
	@FindBy (xpath = "//div[6]/div[5]/p/a")
	WebElement youTubeButton;
	
	
	
//  Main page background buttons	
	
	@FindBy (css = ".backpic > button:nth-child(1)")
	WebElement backGroundButton1;

	@FindBy (css = ".backpic2 > button:nth-child(1)")
	WebElement backGroundButton2;
	
	

	
	public main_Page_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
//  Head line
	
	String head() {
		return headLine.getText();
	}
	
//  Main page "Get a test ride" form functions
	
	void typeFirstName(String fName) {
		firstName.sendKeys(fName); 
	}
	
	void typeLastName(String lName) {
		lastName.sendKeys(lName); 
	}
	
	void selectCountry(int index) {
		Select count1 = new Select(country);
		count1.selectByIndex(index);
	}
	
	void typeMail(String mail) {
		eMail.sendKeys(mail);
	}
	
	void selectAreaCode(int index) {
		Select area = new Select(areaCode);
		area.selectByIndex(index);
	}
	
	void typePhone(String number) {
		phone.sendKeys(number);
	}
	
	void click() {
		send.click();
	}
	
	
//  Main page side menu functions

	void clickMembership() {
		membershipButton.click();
	}
	
	void clickSpecs() {
		specsButton.click();
	}
	
	void clickAboutUs() {
		aboutUsButton.click();
	}
	void clickKawasaki() {
		kawasakiButton.click();
	}
	
	void clickYouTube() {
		youTubeButton.click();
	}
	
//  Main page background functions

	void clickBackGroundButton() {
		backGroundButton1.click();
	}
	
}
