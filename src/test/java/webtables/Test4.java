package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Test4  extends Basecalss{
	@Test
	public void tc1() {
		 List<WebElement> ele = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[11]/*"));
	
		 for(WebElement l:ele)
System.out.println(l.getText());
driver.close();
	
	}

}
