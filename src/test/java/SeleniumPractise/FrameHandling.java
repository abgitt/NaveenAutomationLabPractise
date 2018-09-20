package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameHandling {
	
	WebDriver dr;
	@BeforeTest
	public void fBeginMethod()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		//dynamic wait
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.get("https://www.freecrm.com");
	}
	
	@Test
	public void fuploadFile() throws Exception
	{
		dr.findElement(By.name("username")).sendKeys("naveenk");
		dr.findElement(By.name("password")).sendKeys("test@123");
		dr.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
