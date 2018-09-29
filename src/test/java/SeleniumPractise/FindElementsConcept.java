package SeleniumPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		//dynamic wait
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.get("http://www.half.ebay.com");
		List<WebElement> al2= dr.findElements(By.tagName("a"));
		System.out.println(al2.size());
		List<WebElement> al= dr.findElements(By.xpath("//a"));
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			if(!((al2.get(i).getText()).equals((al.get(i).getText()))))
			{
				System.out.println((al2.get(i).getText()) +"-->"+ (al.get(i).getText()));
			}
		}
	}

}
