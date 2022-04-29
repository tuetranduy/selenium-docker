package managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

public class FirefoxDriverManager extends DriverManager {

	@Override
	protected void createWebDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.of(10, SECONDS));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	}
}
