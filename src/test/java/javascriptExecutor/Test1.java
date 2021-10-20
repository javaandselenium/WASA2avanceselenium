package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Test1 extends Basecalss{
@Test
public void tc2() throws InterruptedException {
	WebElement ele = driver.findElement(By.id("abc"));
	if(ele.isEnabled()) {
		System.out.println("element is enabled");
	}
	else
	{
		System.out.println("element is disabled");
	}
	JavascriptExecutor js=(JavascriptExecutor) driver;
	//clear the data in disabled element
	js.executeScript("document.getElementById('abc').value=''");
	
	//typeing
	js.executeScript("document.getElementById('abc').value='java and selenium'");
}
	

}
