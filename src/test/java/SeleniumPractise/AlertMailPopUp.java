package SeleniumPractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertMailPopUp {
	WebDriver dr;
	@BeforeTest
	public void fBeginMethod()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();

		//dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		dr.get("https://html.com/input-type-file/");
	}
	
	@Test
	public void fTestHandlePopUp()
	{
		dr.findElement(By.name("proceed")).click();
		Alert alert = dr.switchTo().alert();
		System.out.println(alert.getText());
		// then validate the above text using str.gettext()
		alert.accept();
		//alert.dismiss(); to cancel
	}

}
