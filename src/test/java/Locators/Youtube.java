package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Youtube extends Basecalss{
	@Test
	public void tc2() {
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='search']"));
		ele1.sendKeys("Selenium");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		
String sel="//a[@id='video-title']/ancestor::div[@id='meta']//span[@class='style-scope ytd-video-meta-block']";	
		
		WebElement ele = driver.findElement(By.xpath(sel));
	System.out.println(ele.getText());
	}

}
