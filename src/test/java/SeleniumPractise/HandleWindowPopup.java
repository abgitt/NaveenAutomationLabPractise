package SeleniumPractise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleWindowPopup {
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
		dr.get("http://www.popuptest.com/goodpopups.html");
	}
	@Test
	public void fHandleWindow() throws InterruptedException
	{
		Actions act = new Actions(dr);
		act.moveToElement(dr.findElement(By.linkText("Good PopUp #1"))).click().build().perform();
		Set<String> winhandle = dr.getWindowHandles();
		Iterator<String> itr = winhandle.iterator();
		String Parent = itr.next();
		System.out.println("Parent node : " + Parent);
		String child = itr.next();
		System.out.println(child);
		dr.switchTo().window(child);
		Thread.sleep(5000);
		dr.close();
		dr.switchTo().window(Parent);
		dr.close();
	}
}
