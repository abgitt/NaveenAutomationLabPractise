package SeleniumPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HUnitDriver {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");



	//	WebDriver dr=new ChromeDriver();
		WebDriver dr = new HtmlUnitDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		dr.manage().deleteAllCookies();
		Properties prop = new Properties(); 
		FileInputStream fis = new FileInputStream("C:\\Users\\ABI\\eclipse-workspace\\NaveenAL\\src\\test\\java\\SeleniumPractise\\config.properties");
		prop.load(fis);
		dr.get(prop.getProperty("url"));
		dr.findElement(By.name(prop.getProperty("name"))).sendKeys(prop.getProperty("username"));
		dr.findElement(By.name(prop.getProperty("pwd"))).sendKeys(prop.getProperty("passkey"));
		dr.switchTo().parentFrame();
		System.out.println(dr.getTitle());
		Thread.sleep(5000);
		dr.findElement(By.xpath(prop.getProperty("btn"))).click();
		System.out.println(dr.getTitle());


	}

}
