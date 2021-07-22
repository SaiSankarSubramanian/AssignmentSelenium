package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAndSubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA"))	.click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CN");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("AAA");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("BBB");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("LocalFirst");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("LocalLast");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Heading");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/11/92");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("NODESCRIPTION");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("NONOTE");
		
		WebElement webCountryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
        webCountryCode.clear();
        webCountryCode.sendKeys("2");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("436");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("6");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("111@gmail.com");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9444555666");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Mr.K");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.com");
		
		driver.findElementById("createLeadForm_generalToName").sendKeys("abc");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("xyz");
		driver.findElementByName("generalAddress1").sendKeys("11,8th Street,");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Barington Lane");
		driver.findElementById("createLeadForm_generalCity").sendKeys("London");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("EC1A");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("EastCentral1Area");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Alabama");
		
		driver.findElement(By.className("smallSubmit")).click();
	
		
		String text = driver.findElementById("createLeadForm_firstName").getText();
		System.out.println(text);
		
		String title = driver.getTitle();
		String expTitle = "View Lead | opentaps CRM";
		if (title.equals(expTitle)) {
			System.out.println("Page landed successfully");
			
		}

		
	}
	

}
