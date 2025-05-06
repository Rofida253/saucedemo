package automation.recapet;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;

public class testBase {
	public static WebDriver driver;

	@BeforeClass
	@Parameters({"browser"})
	
	public void setupdriver(@Optional("chrome")  String browserName) {
		if (browserName.equalsIgnoreCase("chrome"))
		{System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
			if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			}
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS);
		driver.navigate().to("https://www.saucedemo.com/");
		
	}
@AfterMethod
public void screenshootOnfailur ( ITestResult  result )  {
	
	if (result.getStatus() == ITestResult.FAILURE) {
		System.out.println("take screenshoot");
		
			try {
				Helper.captureScreenShoot(driver, result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}

   @AfterClass
   public void stopdriver() {
	driver.close();
}
   }
	


	



