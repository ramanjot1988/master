package commonUtilities;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Utilities {

	public void printWebElementList(List<WebElement> listOfWebElement) {
		for (int i=0; i<listOfWebElement.size(); i++) {
			System.out.println(listOfWebElement.get(i).getText());
		}
		
		
		
	}
	
	//public void setName (String name)

}
