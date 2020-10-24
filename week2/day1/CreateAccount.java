package week2.day1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementByXPath("//input[@class='inputBox']").sendKeys("Debit Limited Account");
		driver.findElementByXPath("//input[@id='groupNameLocal']").sendKeys("Chennai");
		driver.findElementByXPath("//input[@id='annualRevenue']").sendKeys("10000000");
		
		WebElement industry = driver.findElementByName("industryEnumId");
		Select dropdown1 = new Select(industry);
		dropdown1.selectByValue("IND_SOFTWARE");
		
		WebElement ownership = driver.findElementByName("ownershipEnumId");
		Select dropdown2 = new Select(ownership);
		dropdown2.selectByVisibleText("S-Corporation");
		
			
		WebElement source = driver.findElementByName("dataSourceId");
		Select dropdown3 = new Select(source);
		dropdown3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaign = driver.findElementByName("marketingCampaignId");
		Select dropdown4 = new Select(marketingCampaign);
		dropdown4.selectByValue("9000");
		
	
		driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("sometext");
		driver.findElementByXPath("//textarea[@class='inputBox']").sendKeys("Selenium Automation Tester");
		
		
		WebElement stateProvince = driver.findElementByName("generalStateProvinceGeoId");
		Select dropdown5 = new Select(stateProvince);
		dropdown5.selectByValue("TX");
		
		
		
		
		
		Thread.sleep(1000);;
		driver.findElementByLinkText("Logout").click();
		Thread.sleep(1000);;

		driver.close();
	}

}
