package automation.recapet;

import org.testng.Assert;
import org.testng.annotations.Test;


public class testLogin extends testBase{


loginPage loginObject;

@Test(priority=1)
public void loginSuccessfully () {
	loginObject = new loginPage(driver);
	loginObject.userlogin("standard_user", "secret_sauce");
}
@Test (priority=2)
public void navigateBack() 
{
	driver.get("https://www.saucedemo.com/");
}

	@Test(priority=3)
	public void invaledLogin () {
		loginObject = new loginPage(driver);
		loginObject.userlogin("standard_user", "secret_auce");
		Assert.assertTrue(loginObject.errorMessage.getText().contains("Epic sadface: Username and password do not match any user in this service"));
		
	}

}
