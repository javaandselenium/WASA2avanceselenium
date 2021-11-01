package testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import Locators.Basecalss;

public class Test12 {
	@Parameters({"browser"})
	@Test
	public void tc2(String browserName) throws MalformedURLException {
		URL remoteAddress=new URL("http://192.168.0.104:5556/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName(browserName);
		WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hgfgfgfg");
		driver.findElement(By.id("pass")).sendKeys("rgrghrghqgh");
		
	}
	

}
