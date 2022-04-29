package managers;

public class DriverManageFactory {
	public static DriverManager getDriverManager(DriverType type) {
		DriverManager driverManager = null;

		switch (type) {
			case CHROME:
				driverManager = new ChromeDriverManager();
				break;
			case FIREFOX:
				driverManager = new FirefoxDriverManager();
				break;
			case GRID_DOCKER:
				driverManager = new GridDockerDriverManager();
				break;
			default:
				break;
		}
		return driverManager;
	}
}
