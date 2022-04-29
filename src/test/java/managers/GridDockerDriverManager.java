package managers;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDockerDriverManager extends DriverManager {
	@Override
	protected void createWebDriver() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("headless", true);


		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
			capabilities);
		driver.get("https://demoqa.com/");
	}
}
