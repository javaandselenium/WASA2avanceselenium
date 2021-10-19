package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TEst10 extends Basecalss{
	@Test
	public void tc1() throws InterruptedException {
	driver.findElement(By.name("q")).sendKeys("samsung mobiles",Keys.ENTER);
	WebElement ele = driver.findElement(By.xpath("//div[text()='6 GB & Above']/preceding-sibling::div"));
	ele.click();
	Thread.sleep(5000);
	WebElement e = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F22 (Denim Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1']"));
	System.out.println(e.getText());
	e.click();
	}

}
