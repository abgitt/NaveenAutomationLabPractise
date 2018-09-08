package SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Driver {
	
	@Test
	public void startChrome()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://www.youtube.com");
	}
	@AfterTest
	public void closeChrome()
	{
		System.out.println("Closing ");
	}
}
