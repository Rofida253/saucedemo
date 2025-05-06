package automation.recapet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testCart extends testBase{
	  loginPage loginObject;
	 inventoryPage inventoryobject;
	 cartPage  cartObject;
	

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
			Thread.sleep(9000);
			  
		  }
		  @Test(priority=4)
		  public void navigateToCart() {
			  driver.navigate().to("https://www.saucedemo.com/cart.html"+"/cartbtn");
		  }
		  @Test(priority=5)
		  public void bothProductAppearCorrect () {
			  cartObject =new cartPage(driver);
			 Assert.assertTrue(cartObject.product1.getText().contains("Sauce Labs Onesie"));
			 Assert.assertTrue(cartObject.product2.getText().contains("Sauce Labs Bike Light"));
			 
			
		  }
        @Test (priority=6)
        public void checkCartCount() {
        	 cartObject =new cartPage(driver);
        	 Assert.assertTrue(cartObject.cartCount.getText().contains("2"));
        }
        @Test (priority=7)
        public void clickOnCheckOut() {
        	 cartObject =new cartPage(driver);
        	 cartObject.CheckOut();
        }
        
       
        }


