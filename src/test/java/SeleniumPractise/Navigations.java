package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		dr.navigate().to("http://www.google.com");
		dr.navigate().to("http://www.facebook.com");
		dr.navigate().back();
		Thread.sleep(1000);
		dr.navigate().forward();
		Thread.sleep(1000);
		dr.navigate().refresh();

	}

}
