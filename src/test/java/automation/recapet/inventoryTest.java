package automation.recapet;
import org.testng.annotations.Test;

public class inventoryTest extends testBase {
 
  
  loginPage loginObject;
  inventoryPage inventoryobject;

  @Test(priority=1)
  public void loginSuccessfully () { 
  	loginObject = new loginPage(driver);
  	loginObject.userlogin("standard_user", "secret_sauce");
  	
}
  @Test(priority=2)
  public void sorting () {
	  inventoryobject =new inventoryPage(driver);
	  inventoryobject.sortProducts();
  }
	  @Test(priority=3)
	  public void productAdded() throws InterruptedException {
		  inventoryobject =new inventoryPage(driver);
		inventoryobject.addProducts();
		Thread.sleep(4000);
		  
	  }
	    
	  
	  
  }
	  
	  
  
