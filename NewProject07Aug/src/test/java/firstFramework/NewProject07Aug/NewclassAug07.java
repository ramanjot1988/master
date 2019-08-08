package firstFramework.NewProject07Aug;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

public class NewclassAug07 {
	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ontario.ca");

		driver.findElement(By.partialLinkText("English")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@ng-model='search.input'])[1]")).sendKeys("jobs in driving");
		driver.findElement(By.xpath("(//input[@ng-model='search.input'])[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@analytics-value='1'])[1]")).click();
		Thread.sleep(3000);
		List<WebElement> webElement1 = driver.findElements(By.xpath("//ul[@class='no-bullet']/li/a"));
		System.out.println(webElement1.size());
		for (int i = 0; i < webElement1.size(); i++) {
			System.out.println(webElement1.get(i).getText());
		}
	}

	@BeforeMethod
	public void beforeMethod() {
	}

}
