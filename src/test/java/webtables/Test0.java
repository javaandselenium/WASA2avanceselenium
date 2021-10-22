package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Test0 extends Basecalss{

	@Test
	public void tc1() {
		List<WebElement> ele = driver.findElements(By.tagName("tr"));
	System.out.println(ele.size());
	
	driver.close();
	
	}
}
