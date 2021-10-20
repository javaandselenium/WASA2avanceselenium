package synchronization;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Test3 extends Basecalss{
	@Test
	public void demo() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
		while(true) {
			try {
		driver.findElement(By.id("logoutLink")).click();
	break;
			}
			catch(Exception e) {
				
			}
			
	
	}}}


