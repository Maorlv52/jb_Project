package Maor_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class membership_Page_POM {

	WebDriver driver;
	
//  Membership page form variables:

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
	
	@FindBy (css = "select[name='Card type']")
	WebElement credit;
	
	@FindBy (css = "input[name='Submit']")
	WebElement creditNumber;
	
	@FindBy (css = "input[name='CvvNumber']")
	WebElement cvvNumber;
	
	@FindBy (xpath = "//tbody/tr[10]/td[2]/input[1]")
	WebElement expMonth;
	
	@FindBy (xpath = "//tbody/tr[10]/td[2]/input[2]")
	WebElement expYear;
	
	@FindBy (css = "input[type='radio'][value='2']")
	WebElement payments;
	
	@FindBy (css = "input[type='checkbox']")
	WebElement agreeBox;
	
	@FindBy (css = "input[name='pay']")
	WebElement payButton;
	
	
//  Click back to main page
	@FindBy (xpath = "//body/div/p/a")
	WebElement backButton;
	

	public membership_Page_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//  Membership page form functions:

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
	
	void selectCreditCard(String creditType) {
		Select credit1 = new Select(credit);
		credit1.selectByVisibleText(creditType);
	}
	
	void clearCreditNumber() {
		creditNumber.clear();
	}
	
	void typeCreditNumber(String number) {
		creditNumber.sendKeys(number);
	}
	
	void clearCvvNumber() {
		cvvNumber.clear();
	}
	
	void typeCvvNumber(String cvv) {
		cvvNumber.sendKeys(cvv);
	}
	
	void clearExpMonth() {
		expMonth.clear();
	}
	
	void typeExpMonth(String month) {
		expMonth.sendKeys(month);
	}
	
	void clearExpYear() {
		expYear.clear();
	}
	
	void typeExpYear(String year) {
		expYear.sendKeys(year);
	}
	
	void clickPayments() {
		payments.click();
	}
	
	boolean paymentsRadioCheck() {
		if(payments.isSelected())
			return true;
		else
			return false;
	}
	
	void clickAgree() {
		agreeBox.click();
	}
	
	boolean agreeBoxCheck() {
		if(agreeBox.isSelected())
			return true;
		else
			return false;
	}
	
	void clickPay() {
		payButton.click();
	}
	
//  Click back to main page function
	void clickBackButton() {
		backButton.click();
	}
	
	
}
