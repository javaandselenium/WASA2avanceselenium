package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(35,TimeUnit.SECONDS);
		
		try {
			driver.get("https://www.amazon.com/");
			System.out.println("page is loaded within 15sec");
		}
		catch(Exception e) {
			System.out.println("page is not loaded within 15 sec");
		}
		
		driver.close();

	}

}
