package firstFramework.NewProject07Aug;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class test07 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.nike.com/ca/en_gb/");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

}
