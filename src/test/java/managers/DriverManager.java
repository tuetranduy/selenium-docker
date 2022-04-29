package managers;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public abstract class DriverManager {

	protected WebDriver driver;

	protected abstract void createWebDriver() throws MalformedURLException;

	public void quitWebDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public WebDriver getWebDriver() throws MalformedURLException {
		if (driver == null) {
			createWebDriver();
		}
		return driver;
	}
}
