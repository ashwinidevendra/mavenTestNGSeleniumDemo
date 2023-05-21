package SearchTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchTitleTest {
			ChromiumDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("Initializing chrome browser....");
		driver=new ChromeDriver();
	}
	
	@Test
	public void validateTitle() {
		driver.get("https://www.google.com/");
		System.out.println("Title is : "+driver.getTitle());
		//validate...compare
		Assert.assertEquals(driver.getTitle(), "Google");
		
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Closing chrome browser....");
		driver.close();
		
	}

}
