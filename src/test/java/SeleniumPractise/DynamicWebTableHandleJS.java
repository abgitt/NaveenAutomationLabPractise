package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandleJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		JavascriptExecutor js = ((JavascriptExecutor) dr);
		dr.get("https://spicejet.com/");
		JavascriptExecutorConcept.changeDate("01/02", dr.findElement(By.id("ctl00_mainContent_view_date1")), js);
	

	}

}
