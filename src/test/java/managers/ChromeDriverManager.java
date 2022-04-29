package managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

public class ChromeDriverManager extends DriverManager {
	@Override
	protected void createWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.of(10, SECONDS));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	}
}
