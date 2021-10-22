package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Test2 extends Basecalss {
	@Test
	public void tc2() {
		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[*]"));
	
		for(WebElement b:ele) {
			System.out.println(b.getText());
		}
		
		driver.close();
	
	}

}
