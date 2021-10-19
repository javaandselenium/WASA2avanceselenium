package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Flipkart extends Basecalss {
	@Test
	public void demo() {
		driver.findElement(By.name("q")).sendKeys("samsung mobiles", Keys.ENTER);
		String price = "//div[text()='SAMSUNG Galaxy F12 (Sky Blue, 64 GB)']/ancestor::div[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1']";
		driver.findElement(By.xpath(price)).click();
		Set<String> child = driver.getWindowHandles();
		for (String b : child) {
			driver.switchTo().window(b);
		}
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	}

}
