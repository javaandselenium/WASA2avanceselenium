package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test6 {

	@Test
	public void demo(){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.id("email54454534534")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("gghshhjghjhgjh");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	driver.close();
	

	}

}
