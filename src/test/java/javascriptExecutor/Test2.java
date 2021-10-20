package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Locators.Basecalss;

public class Test2 extends Basecalss{
@Test
public void demo() {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	String text = js.executeScript("return document.title;").toString();
System.out.println(text);

String url = js.executeScript("return document.URL;").toString();
System.out.println(url);

driver.close();
}

}
