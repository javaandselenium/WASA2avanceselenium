package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Test0 extends Basecalss{
	@Test
	public void tc1() {
	WebElement ele = driver.findElement(By.xpath("//img[@alt='Shop Pet supplies']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);",ele);
	
	
	js.executeScript("arguments[0].click();",ele);
	//ele.click();
	}

}
