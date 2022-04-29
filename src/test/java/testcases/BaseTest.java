package testcases;

import managers.DriverManageFactory;
import managers.DriverManager;
import managers.DriverType;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.util.Locale;

public class BaseTest {

	DriverManager driverManager;
	JavascriptExecutor jsExecutor;
	WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) throws MalformedURLException {
		DriverType driverType = DriverType.valueOf(browser.toUpperCase(Locale.ROOT));
		driverManager = DriverManageFactory.getDriverManager(driverType);
		driver = driverManager.getWebDriver();
	}

	@AfterClass
	public void tearDown() {
		driverManager.quitWebDriver();
	}
}
