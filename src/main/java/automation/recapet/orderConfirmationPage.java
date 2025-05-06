package automation.recapet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class orderConfirmationPage extends pageBase {

	public orderConfirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (className = "complete-header")
	WebElement orderConfirmation;
}
