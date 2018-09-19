package SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();

		dr.get("https://www.ebay.com/");
		Select select = new Select(dr.findElement(By.name("_sacat")));
		select.selectByVisibleText("Art");
		dr.findElement(By.xpath("//a[@id='gf-fbtn']")).click();
		List<WebElement> list = dr.findElements(By.xpath("//ul[@class='gf-ful' and @role='navigation']/li"));
		for(WebElement country:list)
		{
			System.out.println(country.getText());
			if(country.getText().equals("Australia"))
			{
				/*System.out.println("India");
				Thread.sleep(10000);
				country.click();*/
				WebElement element = country;
				Actions action = new Actions(dr);
				action.moveToElement(element).click().perform();
			}
		}
	}

}
