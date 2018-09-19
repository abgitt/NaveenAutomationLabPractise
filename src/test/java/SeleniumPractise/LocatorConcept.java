package SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.get("https://www.ebay.com/");
		
		dr.findElement(By.xpath("//a[contains(text(),'register')]")).click();
		Thread.sleep(1000);
		dr.findElement(By.id("firstname")).sendKeys("Abilash");
		dr.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Reddy");
		dr.findElement(By.name("email")).sendKeys("Abgitt@gmail.com");
		dr.findElement(By.linkText("User Agreement")).click();
		dr.findElement(By.partialLinkText("User Privacy")).click();
		List<WebElement> a = dr.findElements(By.tagName("input"));
		System.out.println(a.size());
		dr.findElement(By.cssSelector("input[name=PASSWORD][type=password]")).sendKeys("12345");
		//Syntax : cssSelector("#idvalue")
		dr.findElement(By.className("sgnInTxt")).click();
	}

}
