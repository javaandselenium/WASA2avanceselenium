package testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Hub extends Basecalss{
	@Test
	public void demo() throws MalformedURLException {
		URL remoteAddress=new URL("http://192.168.0.103:4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
		
		driver.findElement(By.id("email")).sendKeys("hgfgfgfg");
		driver.findElement(By.id("pass")).sendKeys("rgrghrghqgh");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		Reporter.log(title,true);
		
	}
	

}
