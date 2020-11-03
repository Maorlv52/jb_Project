package Maor_Project;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Maor_Project {

	
	
//TEST SPECIFICATION  //TEST SPECIFICATION  //TEST SPECIFICATION  //TEST SPECIFICATION  //TEST SPECIFICATION  //TEST SPECIFICATION  //TEST SPECIFICATION  //TEST SPECIFICATION  //TEST SPECIFICATION  

	
	
/*  
   * INTRODUCTION (Test specifications):

      -(The tests are valid for both browsers)-
     
	  1.  Open the main page and verify page title.
	  2.  In the "Order a test ride" form, enter "Maor" as first name, and verify the value obtained.
	  3.  Enter "Levinshtein" as last name, and verify the value obtained.
	  4.  Select "Unites states" from the drop-down list, as country, and verify the value obtained.  
	  5.  Enter "Maorlv52@gmail.com" as Email, and verify the value obtained.
	  6.  Select "054" from the drop-down list, as phone frefix, and verify the value obtained. 
	  7.  Enter "4837295" as phone number, verify the value obtained, and click on "Order".
	  8.  Make sure you are in the "Order a test ride!" page, then go back to main page.
	  9.  Click on "GET MEMBERSHIP" button, and make sure you are in the "Get your membership!" page.
	  10. In the "Get a membership" form, enter "Ploni" as first name, and verify the value obtained.
	  11. Enter "Almoni" as last name, and verify the value obtained.
	  13. Enter "ploniAlmoni@gmail.com" as Email, and verify the value obtained.
	  14. Select "03" from the drop-down list, as phone frefix, and verify the value obtained.
	  15. Enter "5555555" as phone number, verify the value obtained, and click on "Order".
	  16. Select "MasterCard" from the drop-down list, as credit card type, and verify the value obtained.
	  17. Enter "123456789" as Credit card number, and verify the value obtained.
	  18. Enter "123" as cvv number, and verify the value obtained.
	  19. Enter "06" as Expiration month, and verify the value obtained.
	  20. Enter "22" as Expiration year, and verify the value obtained.
	  21. Press "2", on the "Payments" radio button, and verify the value obtained.
	  22. Press "Yes" on the "I Agree" checkBox, verify the value obtained, and press "Pay".
	  23. Make sure you are in the "Thank you!" page, then go back to main page.
	  24. Click on "VIEW TECHNICAL SPECS", and make sure you are in the "Vulcan 650s Specification" page, then go back to main page.
	  25. Click on "ABOUT US" button, and make sure you are in the "ABOUT US" page, then go back to main page.
	  26. Click on "KAWASAKI.COM", and make sure you entered "https://www.kawasaki.com/motorcycle/vulcan/sport-cruiser/vulcan-s" (By verify an element from site).
	  27. Go back to main page, verify you go to previous page by finding main page element.
	  28. Click on "VULCAN 650s VIDEO" button, and make sure you entered "https://www.youtube.com/watch?v=qytkjr187c4"  (By verify an element from site).
	  29. Go back to main page, verify you go to previous page by finding main page element.
	  30. Change the main page background picture by using the "Change background" button, on the buttom of the page, varify the pictire has changed.
	  31. Count how many "input" elements there are on the Main webpage, and compare the result to the quantity that should be.
	  32. Count how many "box" elements there are on the Main webpage, and compare the result to the quantity that should be.
	  33. Count how many "p" elements there are on the Main webpage, and compare the result to the quantity that should be.
	  34. Count how many "hr" elements there are on the Main webpage, and compare the result to the quantity that should be.
	  35. Count how many "radio" elements there are on the Membership webpage, and compare the result to the quantity that should be.

*/
	
	public static void main(String[] args) {
		

		
//SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS  //SETTINGS
		
		
		
	//TEST RESULTS ARRAY (BOTH BROWSERS)
		boolean[] testC = new boolean[35];
		boolean[] testF = new boolean[35];
	
	//DRIVERES (BOTH BROWSERS)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\maorl\\Desktop\\School\\Automation + java\\Selenium_drivers\\chromedriver.exe");
		WebDriver driveC = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\maorl\\Desktop\\School\\Automation + java\\Selenium_drivers\\geckodriver.exe");
		WebDriver driveF = new FirefoxDriver();

	//TIME SETTING (BOTH BROWSERS)
		driveC.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driveF.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait waitC = new WebDriverWait(driveC, 30);
		WebDriverWait waitF = new WebDriverWait(driveF, 30);

	//OPEN CHROME
		driveC.navigate().to("file:///C:/Users/maorl/Desktop/School/html%20+%20css%20+%20Javascript/Maor's%20Project/INDEX.html");
		driveC.manage().window().maximize();
		
	//OPEN FIRE FOX
		driveF.navigate().to("file:///C:/Users/maorl/Desktop/School/html%20+%20css%20+%20Javascript/Maor's%20Project/INDEX.html");
		driveF.manage().window().maximize();
		
	//POM USE (classes per web page, in the same package)
		
		//MAIN PAGE POM:
		main_Page_POM mainPageC = new main_Page_POM(driveC);
		main_Page_POM mainPageF = new main_Page_POM(driveF);
		
		//TEST RIDE PAGE (AFTER FILLING MAIN PAGE FORM) POM::
		testRide_Page_POM ridePageC = new testRide_Page_POM(driveC);
		testRide_Page_POM ridePageF = new testRide_Page_POM(driveF);
		
		//GET MEMBERSHIP PAGE POM::
		membership_Page_POM memberPageC = new membership_Page_POM(driveC);
		membership_Page_POM memberPageF = new membership_Page_POM(driveF);
		
		//THANK YOU PAGE (AFTER MEMBERSHIP PAYMENT) POM:
		Thx_Page_POM thxPageC = new Thx_Page_POM(driveC);
		Thx_Page_POM thxPageF = new Thx_Page_POM(driveF);
		
		//SPECIFICATION PAGE POM:
		specs_Page_POM specsPageC = new specs_Page_POM(driveC);
		specs_Page_POM specsPageF = new specs_Page_POM(driveF);
		
		//ABOUT US PAGE POM:
		about_Page_POM aboutPageC = new about_Page_POM(driveC);
		about_Page_POM aboutPageF = new about_Page_POM(driveF);
		
		//KAWASAKI WEB PAGE POM:
		kawasaki_Page_POM kawaPageC = new kawasaki_Page_POM(driveC);
		kawasaki_Page_POM kawaPageF = new kawasaki_Page_POM(driveF);
		
		
		
//AOTUMATION  //AOTUMATION  //AOTUMATION  //AOTUMATION  //AOTUMATION  //AOTUMATION  //AOTUMATION  //AOTUMATION  //AOTUMATION  //AOTUMATION  //AOTUMATION  //AOTUMATION  //AOTUMATION  //AOTUMATION    
	
		
		
	//TEST 1 (CHROME): 
		String title1C = driveC.getTitle();
		if(title1C.equals("Vulcan650s"))
			testC[0] = true;
		else
			testC[0] = false;
		
	//TEST 1 (FIRE FOX): 
		String title1F = driveF.getTitle();
		if(title1F.equals("Vulcan650s"))
			testF[0] = true;
		else
			testF[0] = false;
		
	//TEST 2 (CHROME):
		mainPageC.typeFirstName("Maor");
		String firstName2C = mainPageC.firstName.getAttribute("value");
		if(firstName2C.equals("Maor"))
			testC[1] = true;
		else
			testC[1] = false;

	//TEST 2 (FIRE FOX): 

		mainPageF.typeFirstName("Maor");
		String firstName2F = mainPageF.firstName.getAttribute("value");
		if(firstName2F.equals("Maor"))
			testF[1] = true;
		else
			testF[1] = false;
		
	//TEST 3 (CHROME):
		mainPageC.typeLastName("Levinshtein");
		String lastName3C =  mainPageC.lastName.getAttribute("value");
		if(lastName3C.equals("Levinshtein"))
			testC[2] = true;
		else
			testC[2] = false;
	
	//TEST 3 (FIRE FOX): 
		mainPageF.typeLastName("Levinshtein");
		String lastName3F =  mainPageF.lastName.getAttribute("value");
		if(lastName3F.equals("Levinshtein"))
			testF[2] = true;
		else
			testF[2] = false;
		
	//TEST 4 (CHROME):
		mainPageC.selectCountry(1);
		String count4C = mainPageC.country.getAttribute("value");
		if(count4C.equals("usa"))
			testC[3] = true;
		else
			testC[3] = false;
		
	//TEST 4 (FIRE FOX): 
		mainPageF.selectCountry(1);
		String count4F = mainPageF.country.getAttribute("value");
		if(count4F.equals("usa"))
			testF[3] = true;
		else
			testF[3] = false;
		
	//TEST 5 (CHROME):
		mainPageC.typeMail("maorlv52@gmail.com");
		String mail5C = mainPageC.eMail.getAttribute("value");
		if(mail5C.equals("maorlv52@gmail.com"))
			testC[4] = true;
		else
			testC[4] = false;
		
	//TEST 5 (FIRE FOX): 
		mainPageF.typeMail("maorlv52@gmail.com");
		String mail5F = mainPageF.eMail.getAttribute("value");
		if(mail5F.equals("maorlv52@gmail.com"))
			testF[4] = true;
		else
			testF[4] = false;
		
	//TEST 6 (CHROME):
		mainPageC.selectAreaCode(5);
		String area6C = mainPageC.areaCode.getAttribute("value");
		if(area6C.equals("054"))
			testC[5] = true;
		else
			testC[5] = false;
		
	//TEST 6 (FIRE FOX): 
		mainPageF.selectAreaCode(5);
		String area6F = mainPageC.areaCode.getAttribute("value");
		if(area6F.equals("054"))
			testF[5] = true;
		else
			testF[5] = false;
		
	//TEST 7 (CHROME):
		mainPageC.typePhone("4837295");
		String number7C = mainPageC.phone.getAttribute("value");
		if(number7C.equals("4837295"))
			testC[6] = true;
		else
			testC[6] = false;
		
	//TEST 7 (FIRE FOX): 
		mainPageF.typePhone("4837295");
		String number7F = mainPageF.phone.getAttribute("value");
		if(number7F.equals("4837295"))
			testF[6] = true;
		else
			testF[6] = false;
		
		mainPageC.click();
		mainPageF.click();

    //TEST 8 (CHROME): 
		String title8C = driveC.getTitle();
		if(title8C.equals("Order a test ride!"))
			testC[7] = true;
		else
			testC[7] = false;
		
		ridePageC.clickBack();
		
	//TEST 8 (FIRE FOX): 
		String title8F = driveF.getTitle();
		if(title8F.equals("Order a test ride!"))
			testF[7] = true;
		else
			testF[7] = false;
		ridePageF.clickBack();

	//TEST 9 (CHROME):
		mainPageC.clickMembership();
		String title9C = driveC.getTitle();
		if(title9C.equals("Get your membership!"))
			testC[8] = true;
		else
			testC[8] = false;
		
	//TEST 9 (FIRE FOX):
		mainPageF.clickMembership();
		String title9F = driveF.getTitle();
		if(title9F.equals("Get your membership!"))
			testF[8] = true;
		else
			testF[8] = false;

	//TEST 10 (CHROME):
		memberPageC.typeFirstName("Ploni");
		String firstName10C = memberPageC.firstName.getAttribute("value");
		if(firstName10C.equals("Ploni"))
			testC[9] = true;
		else
			testC[9] = false;
		
	//TEST 10 (FIRE FOX):
		memberPageF.typeFirstName("Ploni");
		String firstName10F = memberPageF.firstName.getAttribute("value");
		if(firstName10F.equals("Ploni"))
			testF[9] = true;
		else
			testF[9] = false;
		

	//TEST 11 (CHROME):
		memberPageC.typeLastName("Almoni");
		String lastName11C = memberPageC.lastName.getAttribute("value");
		if(lastName11C.equals("Almoni"))
			testC[10] = true;
		else
			testC[10] = false;
		
	//TEST 11 (FIRE FOX):
		memberPageF.typeLastName("Almoni");
		String lastName11F = memberPageF.lastName.getAttribute("value");
		if(lastName11F.equals("Almoni"))
			testF[10] = true;
		else
			testF[10] = false;
		
	//TEST 12 (CHROME):	
		memberPageC.selectCountry(1);
		String count12C = memberPageC.country.getAttribute("value");
		if(count12C.equals("usa"))
			testC[11] = true;
		else
			testC[11] = false;
			
	//TEST 12 (FIRE FOX):
		memberPageF.selectCountry(1);
		String count12F = memberPageF.country.getAttribute("value");
		if(count12F.equals("usa"))
			testF[11] = true;
		else
			testF[11] = false;
			
	//TEST 13 (CHROME):	
		memberPageC.typeMail("ploniAlmoni@gmail.com");
		String mail13C = memberPageC.eMail.getAttribute("value");
		if(mail13C.equals("ploniAlmoni@gmail.com"))
			testC[12] = true;
		else
			testC[12] = false;
		
	//TEST 13 (FIRE FOX):
		memberPageF.typeMail("ploniAlmoni@gmail.com");
		String mail13F = memberPageF.eMail.getAttribute("value");
		if(mail13F.equals("ploniAlmoni@gmail.com"))
			testF[12] = true;
		else
			testF[12] = false;
		
	//TEST 14 (CHROME):	
		memberPageC.selectAreaCode(1);
		String area14C = memberPageC.areaCode.getAttribute("value");
		if(area14C.equals("03"))
			testC[13] = true;
			else
			testC[13] = false;
		
	//TEST 14 (FIRE FOX):
		memberPageF.selectAreaCode(1);
		String area14F = memberPageF.areaCode.getAttribute("value");
		if(area14F.equals("03"))
			testF[13] = true;
			else
			testF[13] = false;
		
	//TEST 15 (CHROME):	
		memberPageC.typePhone("5555555");
		String number15C = memberPageC.phone.getAttribute("value");
		if(number15C.equals("5555555"))
			testC[14] = true;
		else
			testC[14] = false;
		
	//TEST 15 (FIRE FOX):
		memberPageF.typePhone("5555555");
		String number15F = memberPageF.phone.getAttribute("value");;
		if(number15F.equals("5555555"))
			testF[14] = true;
		else
			testF[14] = false;
		
	//TEST 16 (CHROME):	
		memberPageC.selectCreditCard("Mastercard");
		String creditType16C = memberPageC.credit.getAttribute("value");
		if(creditType16C.equals("mas"))
			testC[15] = true;
		else
			testC[15] = false;
	
	//TEST 16 (FIRE FOX):
		memberPageF.selectCreditCard("Mastercard");
		String creditType16F = memberPageF.credit.getAttribute("value");
		if(creditType16F.equals("mas"))
			testF[15] = true;
		else
			testF[15] = false;
		
	//TEST 17 (CHROME):	
		memberPageC.clearCreditNumber();
		memberPageC.typeCreditNumber("123456789");
		String creditNumber17C = memberPageC.creditNumber.getAttribute("value");
		if(creditNumber17C.equals("123456789"))
			testC[16] = true;
		else
			testC[16] = false;
		
	//TEST 17 (FIRE FOX):
		memberPageF.clearCreditNumber();
		memberPageF.typeCreditNumber("123456789");
		String creditNumber17F = memberPageF.creditNumber.getAttribute("value");
		if(creditNumber17F.equals("123456789"))
			testF[16] = true;
		else
			testF[16] = false;
		
	//TEST 18 (CHROME):	
		memberPageC.clearCvvNumber();
		memberPageC.typeCvvNumber("123");
		String cvvNumber18C = memberPageC.cvvNumber.getAttribute("value");
		if(cvvNumber18C.equals("123"))
			testC[17] = true;
		else
			testC[17] = false;
		
	//TEST 18 (FIRE FOX):
		memberPageF.clearCvvNumber();
		memberPageF.typeCvvNumber("123");
		String cvvNumber18F = memberPageF.cvvNumber.getAttribute("value");
		if(cvvNumber18F.equals("123"))
			testF[17] = true;
		else
			testF[17] = false;
		
	//TEST 19 (CHROME):	
		memberPageC.clearExpMonth();
		memberPageC.typeExpMonth("06");
		String expMonth19C = memberPageC.expMonth.getAttribute("value");
		if(expMonth19C.equals("06"))
			testC[18] = true;
		
		else
			testC[18] = false;
		
	//TEST 19 (FIRE FOX):
		memberPageF.clearExpMonth();
		memberPageF.typeExpMonth("06");
		String expMonth19F = memberPageF.expMonth.getAttribute("value");
		if(expMonth19F.equals("06"))
			testF[18] = true;
		else
			testF[18] = false;
		
	//TEST 20 (CHROME):	
		memberPageC.clearExpYear();
		memberPageC.typeExpYear("22");
		String expYear20C = memberPageC.expYear.getAttribute("value");
		if(expYear20C.equals("22"))
			testC[19] = true;
		else
			testC[19] = false;
		
	//TEST 20 (FIRE FOX):
		memberPageF.clearExpYear();
		memberPageF.typeExpYear("22");
		String expYear20F = memberPageF.expYear.getAttribute("value");
		if(expYear20F.equals("22"))
			testF[19] = true;
		else
			testF[19] = false;
		
	//TEST 21 (CHROME):	(==RADIO BUTTON==)
		memberPageC.payments.click();
		String payments21C = memberPageC.payments.getAttribute("value"); 
		if(payments21C.equals("2") && memberPageC.paymentsRadioCheck() == true)
			testC[20] = true;
		else
			testC[20] = false;
		
	//TEST 21 (FIRE FOX):  (==RADIO BUTTON==)
		memberPageF.payments.click();
		String payments21F = memberPageF.payments.getAttribute("value"); 
		if(payments21F.equals("2") && memberPageF.paymentsRadioCheck() == true)
			testF[20] = true;
		else
			testF[20] = false;
		
	//TEST 22 (CHROME):	
		memberPageC.clickAgree();
		String agreeBox22C = memberPageC.agreeBox.getAttribute("value");
		if(agreeBox22C.equals("Yes") && memberPageC.agreeBoxCheck() == true)
			testC[21] = true;
		else
			testC[21] = false;
		memberPageC.clickPay();

	//TEST 22 (FIRE FOX):
		memberPageF.clickAgree();
		String agreeBox22F = memberPageF.agreeBox.getAttribute("value");
		if(agreeBox22F.equals("Yes") && memberPageF.agreeBoxCheck() == true)
			testF[21] = true;
		else
			testF[21] = false;
		memberPageF.clickPay();
		
	//TEST 23 (CHROME);
		String title23C = driveC.getTitle();
		if(title23C.equals("Thank you!"))
			testC[22] = true;
		else
			testC[22] = false;
		thxPageC.clickBack();
		
	//TEST 23 (FIRE FOX);
		String title23F = driveF.getTitle();
		if(title23F.equals("Thank you!"))
			testF[22] = true;
		else
			testF[22] = false;
		thxPageF.clickBack();
		
	//TEST 24 (CHROME):
		mainPageC.clickSpecs();
		String title24C = driveC.getTitle();
		if(title24C.equals("Vulcan 650s Specification"))
			testC[23] = true;
		else
			testC[23] = false;
		specsPageC.clickBack();
		
	//TEST 24 (FIRE FOX):
		mainPageF.clickSpecs();
		String title24F = driveF.getTitle();
		if(title24F.equals("Vulcan 650s Specification"))
			testF[23] = true;
		else
			testF[23] = false;
		specsPageF.clickBack();
		
	//TEST 25 (CHROME):
		mainPageC.clickAboutUs();
		String title25C = driveC.getTitle();
		if(title25C.equals("ABOUT US"))
			testC[24] = true;
		else
			testC[24] = false;
		aboutPageC.clickBack();
		
	//TEST 25 (FIRE FOX):
		mainPageF.clickAboutUs();
		String title25F = driveF.getTitle();
		if(title25F.equals("ABOUT US"))
			testF[24] = true;
		else
			testF[24] = false;
		aboutPageF.clickBack();
		
	//TEST 26 (CHROME):
		mainPageC.clickKawasaki();
		waitC.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cat-1")));
		String kawasakiElement26C = kawaPageC.kawaElement.getText();
		if(kawasakiElement26C.equals("MOTORCYCLE"))
			testC[25] = true;
		else
			testC[25] = false;
		
	//TEST 26 (FIRE FOX):
		mainPageF.clickKawasaki();
		waitF.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cat-1")));
		String kawasakiElement26F = kawaPageF.kawaElement.getText();
		if(kawasakiElement26F.equals("MOTORCYCLE"))
			testF[25] = true;
		else
			testF[25] = false;
		
	//TEST 27 (CHROME):
		driveC.navigate().back();
		String mainPageElement27C = mainPageC.headLine.getText();
		if(mainPageElement27C.equals("THE NEW KAWASAKI VULCAN 650s"))
			testC[26] = true;
		else
			testC[26] = false;
		
	//TEST 27 (FIRE FOX):
		driveF.navigate().back();
		String mainPageElement27F = mainPageF.headLine.getText();
		if(mainPageElement27F.equals("THE NEW KAWASAKI VULCAN 650s"))
			testF[26] = true;
		else
			testF[26] = false;
		
	//TEST 28 (CHROME):
	    mainPageC.clickYouTube();
	    String videoTitle28C = driveC.getTitle();
		if(videoTitle28C.equals("Kawasaki Vulcan S ABS 2020 - YouTube"))
			testC[27] = true;
		else
			testC[27] = false;

	//TEST 28 (FIRE FOX):
		mainPageF.clickYouTube();
		String videoTitle28F = driveF.getTitle();
		if(videoTitle28F.equals("Kawasaki Vulcan S ABS 2020 - YouTube"))
			testF[27] = true;
		else
			testF[27] = false;
						
	//TEST 29 (CHROME):
		driveC.navigate().back();
		String mainPageElement29C = mainPageC.backGroundButton2.getText();
		if(mainPageElement29C.equals("Change back (double click)"))
			testC[28] = true;
		else
			testC[28] = false;	
				
	//TEST 29 (FIRE FOX):
		driveF.navigate().back();
		String mainPageElement29F = mainPageF.backGroundButton2.getText();
		if(mainPageElement29F.equals("Change back (double click)"))
			testF[28] = true;
		else
			testF[28] = false;	
			
	//TEST 30 (CHROME):
		String backChange30C = mainPageC.backGroundButton1.getText();
		driveC.findElement(By.cssSelector(".backpic>button")).click();
		if(backChange30C.equals("Change Background"))
			testC[29] = true;
		else
			testC[29] = false;	
		
	//TEST 30 (FIRE FOX):
		String backChange30F = mainPageF.backGroundButton1.getText();
		driveF.findElement(By.cssSelector(".backpic>button")).click();
		if(backChange30F.equals("Change Background"))
			testF[29] = true;
		else
			testF[29] = false;	
		
	//TEST 31 (CHROME):	
		List<WebElement> inputListC = driveC.findElements(By.tagName("input"));
		int inputItemsAmount31C = inputListC.size();
		if(inputItemsAmount31C == 5)
			testC[30] = true;
		else
			testC[30] = false;
		
	//TEST 31 (FIRE FOX):	
		List<WebElement> inputListF = driveF.findElements(By.tagName("input"));
		int inputItemsAmount31F = inputListF.size();
		if(inputItemsAmount31F == 5)
			testF[30] = true;
		else
			testF[30] = false;

	//TEST 32 (CHROME):	
		List<WebElement> boxListC = driveC.findElements(By.className("box"));
		int boxItemsAmount32C = boxListC.size();
		if(boxItemsAmount32C == 6)
			testC[31] = true;
		else
			testC[31] = false;
		
	//TEST 32 (FIRE FOX):	
		List<WebElement> boxListF = driveF.findElements(By.className("box"));
		int boxItemsAmount32F = boxListF.size();
		if(boxItemsAmount32F == 6)
			testF[31] = true;
		else
			testF[31] = false;
		
	//TEST 33 (CHROME):	
		List<WebElement> pListC = driveC.findElements(By.cssSelector("p"));
		int pItemsAmount33C = pListC.size();
		if(pItemsAmount33C == 8)
			testC[32] = true;
		else
			testC[32] = false;
		
	//TEST 33 (FIRE FOX):	
		List<WebElement> pListF = driveC.findElements(By.cssSelector("p"));
		int pItemsAmount33F = pListF.size();
		if(pItemsAmount33F == 8)
			testF[32] = true;
		else
			testF[32] = false;
		
	//TEST 34 (CHROME):	
		List<WebElement> hrListC = driveC.findElements(By.cssSelector("hr"));
		int hrItemsAmount34C = hrListC.size();
		if(hrItemsAmount34C == 6)
			testC[33] = true;
		else
			testC[33] = false;	
		
	//TEST 34 (FIRE FOX):	
		List<WebElement> hrListF = driveF.findElements(By.cssSelector("hr"));
		int hrItemsAmount34F = hrListF.size();
		if(hrItemsAmount34F == 6)
			testF[33] = true;
		else
			testF[33] = false;		
		
	//TEST 35 (CHROME):
		mainPageC.clickMembership();
		List<WebElement> radioListC = driveC.findElements(By.cssSelector("input[type='radio']"));
		int radioItemsAmount35C = radioListC.size();
		if(radioItemsAmount35C == 3)
			testC[34] = true;
		else
			testC[34] = false;
		memberPageC.clickBackButton();
		
	//TEST 35 (FIRE FOX):
		mainPageF.clickMembership();
		List<WebElement> radioListF = driveF.findElements(By.cssSelector("input[type='radio']"));
		int radioItemsAmount35F = radioListF.size();
		if(radioItemsAmount35F == 3)
			testF[34] = true;
		else
			testF[34] = false;
		memberPageF.clickBackButton();
		
		
			driveC.close();
			driveF.close();
		
		
			
// TEST RESULTS  // TEST RESULTS  // TEST RESULTS  // TEST RESULTS  // TEST RESULTS  // TEST RESULTS  // TEST RESULTS  // TEST RESULTS  // TEST RESULTS  // TEST RESULTS  // TEST RESULTS    
			
			
			
		System.out.println("\n    ======  TEST SUMMARY ======    \n");
		
		System.out.println("\n======  CHROME TEST RESULTS: ======\n");
		for (int i = 0; i < testC.length; i++) {
			if(i<9 && testC[i] == true)
				System.out.println("  * test "+(i+1)+"  pass");
			else if(testC[i] == true)
				System.out.println("  * test "+(i+1)+" pass");
			else if(i<9 && testC[i] == false)
				System.out.println("  * test "+(i+1)+"  fail");
			else
				System.out.println("  * test "+(i+1)+" fail");
		}
		System.out.println(TestResultPercent(testC));
		
		System.out.println("\n======  FIRE FOX TEST RESULTS: ======\n");
		for (int i = 0; i < testF.length; i++) {
			if(i<9 && testF[i] == true)
				System.out.println("  * test "+(i+1)+"  pass");
			else if(testF[i] == true)
				System.out.println("  * test "+(i+1)+" pass");
			else if(i<9 && testF[i] == false)
				System.out.println("  * test "+(i+1)+"  fail");
			else
				System.out.println("  * test "+(i+1)+" fail");
		}
		System.out.println(TestResultPercent(testF));
		
		
		
//TEST VARIABLES  //TEST VARIABLES  //TEST VARIABLES  //TEST VARIABLES  //TEST VARIABLES  //TEST VARIABLES  //TEST VARIABLES  //TEST VARIABLES  //TEST VARIABLES  //TEST VARIABLES      
		
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("\n======  CHECK THE AMOUNT OF ELEMENTS ON THE PAGE ======\n");

        System.out.println("\n*  THE ELEMENTS TESTED ARE:");
        System.out.println(" - input , box , p , hr (Main page)");
        System.out.println(" - radio (Membership page)\n");
        
        System.out.println("\n*  Elements Comparison Results for Chrome Browser:\n");
        System.out.println("    input element = should be 5, quantity in run = "+inputItemsAmount31C);
        System.out.println("    box element   = should be 6, quantity in run = "+boxItemsAmount32C);
        System.out.println("    p element     = should be 8, quantity in run = "+pItemsAmount33C);
        System.out.println("    hr element    = should be 6, quantity in run = "+hrItemsAmount34C);
        System.out.println("    radio element = should be 3, quantity in run = "+radioItemsAmount35C);
       
        System.out.println("\n*  Elements Comparison Results for Fire Fox Browser:\n");
        System.out.println("    input element = should be 5, quantity in run = "+inputItemsAmount31F);
        System.out.println("    box element   = should be 6, quantity in run = "+boxItemsAmount32F);
        System.out.println("    p element     = should be 8, quantity in run = "+pItemsAmount33F);
        System.out.println("    hr element    = should be 6, quantity in run = "+hrItemsAmount34F);
        System.out.println("    radio element = should be 3, quantity in run = "+radioItemsAmount35F);
        System.out.println("\n");
        System.out.println("\n*  In the variables section, the last 5 variable (31-35),\n   are Web Element variables\n");
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
        System.out.println("\n======  TEST VARIABLES ======\n");
		System.out.println("*  IMPORTANT!!!\n    The name of the variable, consists of three parts,\r\n" + 
				"    Part One - Variable Content,\r\n" + 
				"    Part Two - Test Number\r\n" + 
				"    Part Three - Browser Tested ( C - Chrome / F - Fire fox)\n");
		
		System.out.println("\n======  CHROME AUTOMATION VARIABLES:  ======");
		System.out.println("\n  * title1C = "+title1C);
		System.out.println("  * firstName2C: "+firstName2C);
		System.out.println("  * lastName3C = "+lastName3C);
		System.out.println("  * count4C = "+count4C );
		System.out.println("  * mail5C = "+mail5C);
		System.out.println("  * area6C = "+area6C);
		System.out.println("  * number7C = "+number7C);
		System.out.println("  * title8C = "+title8C);
		System.out.println("  * title9C = "+title9C);
		System.out.println("  * firstName10C = "+firstName10C );
		System.out.println("  * lastName11C = "+lastName11C );
		System.out.println("  * count12C = "+count12C  );
		System.out.println("  * mail13C = "+mail13C);
		System.out.println("  * area14C = "+area14C);
		System.out.println("  * number15C = "+number15C);		
		System.out.println("  * creditType16C = "+creditType16C);
		System.out.println("  * creditNumber17C = "+creditNumber17C);
		System.out.println("  * cvvNumber18C = "+cvvNumber18C);
		System.out.println("  * expMonth19C = "+expMonth19C);
		System.out.println("  * expYear20C = "+expYear20C);
		System.out.println("  * payments21C (radio button) = "+payments21C);
		System.out.println("  * agreeBox22C (checkBox) = "+agreeBox22C);
		System.out.println("  * title23C = "+title23C);
		System.out.println("  * title24C = "+title24C);
		System.out.println("  * title25C = "+title25C);
		System.out.println("  * kawasakiElement26C = "+kawasakiElement26C);
		System.out.println("  * mainPageElement27C = "+mainPageElement27C);
		System.out.println("  * videoTitle28C = "+videoTitle28C);
		System.out.println("  * mainPageElement29C = "+mainPageElement29C);
		System.out.println("  * backChange30C = "+backChange30C);
		System.out.println("  * inputItemsAmount31C (input element) = "+inputItemsAmount31C);
		System.out.println("  * boxItemsAmount32C (box element) = "+boxItemsAmount32C);
		System.out.println("  * pItemsAmount33C (p element) = "+pItemsAmount33C);
		System.out.println("  * hrItemsAmount33C (hr element) = "+hrItemsAmount34C);
		System.out.println("  * radioItemsAmount35C (radio element) = "+radioItemsAmount35C);

		
		System.out.println("\n======  FIRE FOX AUTOMATION VARIABLES:  ======");
		System.out.println("\n  * title1F = "+title1F);
		System.out.println("  * firstName2F = " + firstName2F);
		System.out.println("  * lastName3F = "+lastName3F);
		System.out.println("  * count4F = "+count4F);
		System.out.println("  * mail5F = "+mail5F);
		System.out.println("  * area6F = "+area6F);
		System.out.println("  * number7F = "+number7F);
		System.out.println("  * title8F = "+title8F);
		System.out.println("  * title9F = "+title9F);
		System.out.println("  * firstName10F = "+firstName10F);
		System.out.println("  * lastName11F = "+lastName11F);
		System.out.println("  * count12F = "+count12F);
		System.out.println("  * mail13F = "+mail13F);
		System.out.println("  * area14F = "+area14F);
		System.out.println("  * number15F = "+number15F);		
		System.out.println("  * creditType16F = "+creditType16F);
		System.out.println("  * creditNumber17F = "+creditNumber17F);
		System.out.println("  * cvvNumber18F = "+cvvNumber18F);
		System.out.println("  * expMonth19F = "+expMonth19F);
		System.out.println("  * expYear20F = "+expYear20F);
		System.out.println("  * payments21F (radio button) = "+payments21F);
		System.out.println("  * agreeBox22F (checkBox) = "+agreeBox22F);
		System.out.println("  * title23F = "+title23F);
		System.out.println("  * title24F = "+title24F);
		System.out.println("  * title25F = "+title25F);
		System.out.println("  * kawasakiElement26F = "+kawasakiElement26F);
		System.out.println("  * mainPageElement27F = "+mainPageElement27F);
		System.out.println("  * videoTitle28F = "+videoTitle28F);
		System.out.println("  * mainPageElement29F = "+mainPageElement29F);
		System.out.println("  * backChange30F = "+backChange30F);
		System.out.println("  * inputItemsAmount31F (input element) = "+inputItemsAmount31F);
		System.out.println("  * boxItemsAmount32F (box element) = "+boxItemsAmount32F);
		System.out.println("  * pItemsAmount33F = (p element)"+pItemsAmount33F);
		System.out.println("  * hrItemsAmount33F (hr element) = "+hrItemsAmount34F);
		System.out.println("  * radioItemsAmount35F (radio element) = "+radioItemsAmount35F);
		
	}
	
	static String TestResultPercent(boolean[] test) {
		double count = 0, successPer;
		int rest;
		for (double i = 0; i < test.length; i++) {
			if(test[(int) i] == true)
				count++;
		}
		successPer = (count*100/test.length);
		rest = (int)successPer%10;
		return("\n  * Percentage of tests passed: "+(int)successPer+"."+rest+"%\n");
	}
	

	
}
