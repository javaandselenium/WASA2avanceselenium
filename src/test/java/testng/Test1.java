package testng;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import Locators.Basecalss;

public class Test1 extends Basecalss{
	@DataProvider
	public Object[][] getData() {
		Object[][] a=new Object[3][2];
		a[0][0]="ertretgfeyetyty";
		a[0][1]="yuyutryguyguyguy";
		
		a[1][0]="6546657657657";
		a[1][1]="6786767657657";
		
		a[2][0]="hdgfsjh676573&%^%$$";
		a[2][1]="hfhj876&&&^&%^%^$%";
		return a;
	}
	
	
	@Test(dataProvider = "getData")
	public void login(String us,String pwd) {
		driver.findElement(By.id("email")).sendKeys(us);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

}
