package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeLogin {

	public static void main(String[] args) throws InterruptedException {

		/*
		 	1. Load url "https://acme-test.uipath.com/login"
			2. Enter email as "kumar.testleaf@gmail.com"
			3. Enter Password as "leaf@12"
			4. Click login button
			5. Get the title of the page and print
			6. Click on Log Out
			7. Close the browser
		 */
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementByXPath("//input[@id='password']").sendKeys( "leaf@12");
		driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		
		String title = driver.getTitle();
		System.out.println(title);
	
		driver.findElementByLinkText("Log Out").click();
		Thread.sleep(1500);
		driver.close();
		
		

	}

}
