package automation.recapet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends pageBase {

	public loginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="user-name")
	WebElement usertxtbox;
	
	@FindBy(id="password")
	WebElement passworedtxtbox;
	
	  @FindBy(id="login-button")
	   WebElement loginbtn;
	  
 public @FindBy(xpath ="/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")
WebElement errorMessage;


public void userlogin(String User , String Password)
{
	  usertxtbox.sendKeys(User);
	  passworedtxtbox.sendKeys(Password);
	  loginbtn.click();
}
}