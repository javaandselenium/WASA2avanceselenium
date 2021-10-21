package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Draganddrop1 extends Basecalss{
	@Test
	public void demo() throws InterruptedException
	{
	WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));	
	WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	
	Actions a=new Actions(driver);
	
	a.clickAndHold(block1).moveToElement(block4).release().perform();
	
	
	}

}
