package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitWaitConcept {
	WebDriver dr;
	@BeforeTest
	public void fBeginMethod()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("http://jqueryui.com/droppable/");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();

		//dynamic wait
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	//Thread.sleep : static wait
	//dr.manage().timeouts().pageLoadTimeout(40) : (For page)within 40seconds loaded then remianing time will be ignored :)
	//implicit wait : For elements
	@Test
	public void fImplicitWaitConcept()
	{
		
	}

}
