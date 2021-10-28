package datadriventesting;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import Locators.Basecalss;

public class Test0 {
@Test
public void createUser(XmlTest xml) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String url = xml.getParameter("url");
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	driver.findElement(By.id("email")).sendKeys(xml.getParameter("username"));
	driver.findElement(By.id("password")).sendKeys(xml.getParameter("password"));
	
	
}
	
}
