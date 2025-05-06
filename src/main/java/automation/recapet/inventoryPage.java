package automation.recapet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class inventoryPage extends pageBase {

	public inventoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public @FindBy( className="product_sort_container")
	WebElement filterbox;
	
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	WebElement addbtn;
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	WebElement addbtn2;
	
	@FindBy(className="shopping_cart_link")
	WebElement cartbtn;
	
	public void sortProducts() {
		select=new Select(filterbox);
		select.selectByValue("lohi");
		
	
	}
	public void addProducts() {
		addbtn.click();
		addbtn2.click();
		
	}
	public void clickOnCart() {
	cartbtn.click();
}}

