package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
public static void captureScreenShoot (WebDriver driver ,String screenshootname) throws IOException {
	 
	try {
	
	Path dest= Paths.get("./Screenshoots", screenshootname+".png");
	Files.createDirectories(dest.getParent());
	FileOutputStream out =new FileOutputStream(dest.toString());
	out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
	out.close();
	}
	catch(IOException e){
		System.out.println("exception while tak screenshoot"+e.getMessage());
		
	}
	
	
	
}
}



