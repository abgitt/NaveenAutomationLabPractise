package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseMovement {

	WebDriver dr;
	@BeforeTest
	public void fBeginMethod()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();

		//dynamic wait
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.get("https://spicejet.com/");
	}
	@Test
	public void mouseMovemnet()
	{
		//Mouse hovering on a specifi element
		Actions action = new Actions(dr);
		action.moveToElement(dr.findElement(By.xpath("//li[@id='header-addons']"))).build().perform();
		dr.findElement(By.linkText("Travel Insurance")).click();
	}
}
