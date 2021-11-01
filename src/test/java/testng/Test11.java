package testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test11 {
	@Parameters({"browserName","ip"})
	@Test
	public void tc13(String browserName,String ip) throws MalformedURLException {
		URL remoteAddress=new URL("http://"+ip+":5556/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName(browserName);
		WebDriver driver=new RemoteWebDriver(remoteAddress,capabilities);
	}

}
