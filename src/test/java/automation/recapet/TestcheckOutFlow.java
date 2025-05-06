package automation.recapet;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestcheckOutFlow extends testBase {
	 loginPage loginObject;
	 inventoryPage inventoryobject;
	 cartPage  cartObject;
	  checkOutFlowPage  checkOutObject;
	  orderConfirmationPage  confirmationObject;

	  @Test(priority=1)
	  public void loginSuccessfully () { 
	  	loginObject = new loginPage(driver);
	  	loginObject.userlogin("standard_user", "secret_sauce");
	  	
 
}
	  @Test(priority=2)
	  public void sorting () throws InterruptedException {
		  inventoryobject =new inventoryPage(driver);
		  inventoryobject.sortProducts();
		  Thread.sleep(5000);
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
        @Test (priority=5)
        public void fillInformation() throws InterruptedException {
        	 cartObject =new cartPage(driver);
        	 cartObject.CheckOut();
        	  driver.navigate().to("https://www.saucedemo.com/checkout-step-one.html"+"/checkOutbtn");
        	 checkOutObject=new checkOutFlowPage(driver);
          	 checkOutObject.yourInformation("hy5at","a5mdt","15279");
              Thread.sleep(9000);
        }
        
              
     @Test (priority=6)
     public void scrollDown() {
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("scrollBy(0,3000)");
     }
    /* @Test (priority=9)
    	  public void validateTotalCalculation() {
    	 checkOutObject=new checkOutFlowPage(driver);
     
        float itemTotal = checkOutObject.getItemTotal();    
         float tax = checkOutObject.getTax();          
          float expectedTotal = itemTotal + tax;        

          float actualTotal = checkOutObject.getItemTotal();

         Assert.assertEquals(actualTotal, expectedTotal, 0.01, "Total price calculation mismatch.");
     }*/
       
      
     
     @Test (priority=7)
	  public void completeOrder()  {
    	 checkOutObject=new checkOutFlowPage(driver);
    	  checkOutObject.Finish();
     }
    	  @Test (priority=8)
    	  public void ConfirmationTheOrder() {
    	    confirmationObject =new orderConfirmationPage(driver);
    	    Assert.assertTrue(confirmationObject.orderConfirmation.isDisplayed());
    	    
    	
     }
    	    }

     
