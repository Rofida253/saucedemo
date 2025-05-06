package automation.recapet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkOutFlowPage extends pageBase{

	public checkOutFlowPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (id="first-name")
	WebElement FirstNameTxt;
	
	@FindBy (id="last-name")
	WebElement LasttNameTxt;
	
	@FindBy (id="postal-code")
	WebElement postalCodeTxt;
	
	@FindBy (id="continue")
	WebElement continueBtn;
	
	@FindBy (className="summary_subtotal_label")
	WebElement itemTotal;
	
	 @FindBy(className = "summary_tax_label")           
	     WebElement tax;
	 
	 @FindBy(className= "summary_total_label")         
	     WebElement total;

	 @FindBy(id= "finish")         
	     public WebElement  finishBtn;
	
	
	public void yourInformation(String First , String Last ,String code)
	{
		FirstNameTxt.sendKeys(First);
		LasttNameTxt.sendKeys(Last);
		postalCodeTxt.sendKeys(code);
		continueBtn.click();
	}
	
    public void Finish () {
    	finishBtn.click();
    }
    

}
	/*public float getItemTotal() {
        return  Float.parseFloat(itemTotal.getText().replace("$", ""));
    }

    public float getTax() {
        return Float.parseFloat((tax.getText().replace("$", ""));
    }

    public float getTotal() {
        return Float.parseFloat(total.getText().replace("$", ""));
    }*/

	
	
			
			

