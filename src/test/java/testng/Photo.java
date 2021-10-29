package testng;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo {
	
	public void getPhoto(WebDriver driver,String name) {
		Date d=new Date();
		String date = d.toString().replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(date+name+"./photo/facebook.png");
		try {
			FileUtils.copyFile(src,dest);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
