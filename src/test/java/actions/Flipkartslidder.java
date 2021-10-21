package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import Locators.Basecalss;

public class Flipkartslidder extends Basecalss {
	@Test
	public void demo() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("samsung mobiles", Keys.ENTER);
		WebElement min = driver.findElement(By.xpath("//div[@class='_3FdLqY']"));
		WebElement max = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
		
		Actions a=new Actions(driver);
		a.dragAndDropBy(min,75,0).perform();
		Thread.sleep(5000);
		a.dragAndDropBy(max,-100,0).perform();

	
	}
	
}
