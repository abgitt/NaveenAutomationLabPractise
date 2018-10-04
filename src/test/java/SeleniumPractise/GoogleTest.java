package SeleniumPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		dr.get("http://www.google.com");
		dr.findElement(By.id("lst-ib")).sendKeys("Java");
		//List<WebElement> ele = dr.findElements(By.xpath("//ul[@role='listbox']/li"));
		List<WebElement> ele = dr.findElements(By.xpath("//ul[@role='listbox']/descendant::li/descendant::div[@class='sbqs_c']"));
		for(int i=0;i<ele.size();i++)
		{
			System.out.println(ele.get(i).getText());
			if(ele.get(i).getText().contains("java online compiler"))
			{
				ele.get(i).click();
				break;
			}
		}
	}

}
