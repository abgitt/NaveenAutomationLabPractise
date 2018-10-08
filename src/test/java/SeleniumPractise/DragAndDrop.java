package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver dr;
	@BeforeMethod
	public void fBeginMethod()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();

		//dynamic wait
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.get("http://jqueryui.com/droppable/");
	}
	@Test
	@Parameters({"url","TestDataFolder"})

	public void  fDragAndDrop(String url,String TestDataFolder) throws InterruptedException
	{
		//click+move+release
		System.out.println(url+"-->TestDataFolder"+TestDataFolder);
		Thread.sleep(20000);
		dr.switchTo().frame(0);
		
		Actions action = new Actions(dr);
		action.clickAndHold(dr.findElement(By.xpath("//div[@id='draggable']")))
		.moveToElement(dr.findElement(By.xpath("//div[@id='droppable']")))
		.release()
		.build().perform();
	}
	@AfterMethod
	public void tearDown()
	{
		dr.close();
		dr.quit();
	}
}
