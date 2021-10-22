package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Test1 extends Basecalss{
	@Test
	public void tc2() {
		List<WebElement> ele = driver.findElements(By.tagName("td"));
	System.out.println(ele.size());
	
	WebElement ele1 = driver.findElement(By.id("t2"));
List<WebElement> data = ele1.findElements(By.tagName("td"));
System.out.println(data.size());

driver.close();
	}

}
