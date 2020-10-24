package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1EditPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("email@aol.com");
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("Text Appended");
		driver.findElementByXPath("//input[@value='TestLeaf']").clear();
		driver.findElementByXPath("//input[@value='TestLeaf']").sendKeys("Default Text");
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		if(driver.findElementByXPath("//input[@disabled='true']").isDisplayed())
		{
			System.out.println("Confirm that edit field is disabled");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
