package synchronization;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Test0 extends Basecalss{
@Test
public void tc() {
	FluentWait wait=new FluentWait(driver);
	wait.withTimeout(500,TimeUnit.MICROSECONDS);
	wait.pollingEvery(250,TimeUnit.MILLISECONDS);
	wait.ignoring(NoSuchElementException.class);
	
	WebElement ele = driver.findElement(By.name("q"));
	wait.until(ExpectedConditions.visibilityOf(ele));
	ele.sendKeys("phone");
}
}
