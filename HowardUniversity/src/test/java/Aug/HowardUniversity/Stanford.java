package Aug.HowardUniversity;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Stanford {
	@Test
	public void stanford() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stanford.edu/");
		driver.findElement(By.linkText("Wireless sensors stick to skin and track health")).click();

		System.out.println(driver.findElement(By.xpath("//div[@id='story-head']/div/h1")).getText());

	}

}
