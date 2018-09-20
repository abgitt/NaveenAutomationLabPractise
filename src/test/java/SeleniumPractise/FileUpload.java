package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	WebDriver dr;
	@BeforeTest
	public void fBeginMethod()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		dr.get("https://html.com/input-type-file/");
	}
	
	@Test
	public void fuploadFile() throws Exception
	{
		Thread.sleep(10000);
		if(dr.findElement(By.linkText("×")).isDisplayed())
		{
			System.out.println("I am inside");
			dr.findElement(By.linkText("×")).click();
		}
		dr.findElement(By.id("fileupload")).sendKeys("C:\\Users\\ABI\\eclipse-workspace\\NaveenAL\\src\\test\\java\\SeleniumPractise\\driver.java");
	}
}
