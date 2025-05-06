package automation.recapet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartPage extends pageBase {

	public cartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy (id="item_2_title_link")
public WebElement product1;

@FindBy (id="item_0_title_link")
public WebElement product2;

@FindBy (className="shopping_cart_badge")
 public WebElement cartCount;

@FindBy (className="inventory_item_price")
public WebElement price1;
@FindBy (className="inventory_item_price")
public WebElement price2;

   @FindBy(id="checkout")
   public WebElement checkOutbtn;

public void CheckOut() {
	checkOutbtn.click();
	
}




}

