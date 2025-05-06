package automation.recapet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class pageBase {
	public WebDriver driver;
	
    public Select select ;
    
	public pageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	

}
}
