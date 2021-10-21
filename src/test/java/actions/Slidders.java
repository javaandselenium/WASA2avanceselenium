package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Slidders extends Basecalss{
	@Test
	public void tc1() throws InterruptedException {
	driver.switchTo().frame(0);
	WebElement ele = driver.findElement(By.xpath("//div[@id='slider']/span"));
	Point loc = ele.getLocation();
	System.out.println(loc.getX());
	System.out.println(loc.getY());
	
	Actions a=new Actions(driver);
	a.dragAndDropBy(ele,400,0).perform();
	Thread.sleep(3000);
	a.dragAndDropBy(ele,-400,0).perform();
	
		
	}

	
}
