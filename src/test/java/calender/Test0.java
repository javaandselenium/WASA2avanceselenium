package calender;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Test0 extends Basecalss{
	@Test
	public void demo() {
		driver.findElement(By.xpath("//label[@for='departure']")).click();
	
		while(true) {
			try {
			driver.findElement(By.xpath("/div[@class='DayPicker-Day DayPicker-Day--selected' and @aria-label='Sat May 28 2022']/div/p[text()='28']")).click();
		break;
			}
			catch(Exception e) {
				System.out.println("date not found");
			}
	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	}

	}}
