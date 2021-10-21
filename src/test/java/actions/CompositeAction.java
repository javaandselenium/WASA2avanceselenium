package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class CompositeAction extends Basecalss{
	@Test
	public void tc2() throws AWTException {
		driver.findElement(By.name("q")).sendKeys("samsung mobiles", Keys.ENTER);
		String price = "//div[text()='SAMSUNG Galaxy F12 (Sky Blue, 64 GB)']";
		WebElement ele = driver.findElement(By.xpath(price));
		
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
