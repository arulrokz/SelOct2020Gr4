package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLand {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Arulraj");
		driver.findElementById("createLeadForm_lastName").sendKeys("Dhinakararajan");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown1 = new Select(source);
		dropdown1.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaignId = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown2 = new Select(marketingCampaignId);
		dropdown2.selectByValue("9001");
		
		WebElement ownershipEnumId = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdown3 = new Select(ownershipEnumId);
		dropdown3.selectByValue("OWN_SCORP");
		
		WebElement generalCountryGeoId = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropdown4 = new Select(generalCountryGeoId);
		dropdown4.selectByValue("IND");
		
		driver.findElementByClassName("smallSubmit").click();
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.close();
	}

}
