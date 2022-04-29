package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage {

	@FindBy(xpath = "//h5[text()='Elements']//ancestor::div[@class='category-cards']")
	private WebElement elementPageBtn;

	@FindBy(xpath = "//div/div[text()='Forms']")
	private WebElement formsBtn;

	@FindBy(xpath = "//div[@class='header-wrapper']/div[text()='Elements']")
	private WebElement elementsBtn;

	@FindBy(xpath = "//ul//span[text()='Web Tables']")
	private WebElement webTablesBtn;

	@FindBy(xpath = "//ul//span[text()='Practice Form']")
	private WebElement practiceFormBtn;

	@FindBy(id = "firstName")
	private WebElement firstNameInput;

	@FindBy(id = "lastName")
	private WebElement lastNameInput;

	@FindBy(id = "userEmail")
	private WebElement emailInput;

	@FindBy(id = "userNumber")
	private WebElement mobileInput;

	@FindBy(xpath = "//input[@id='searchBox']")
	private WebElement searchInput;

	public ElementsPage(WebDriver driver) {
		super(driver);
	}

	public void goToElementPages() {
		elementPageBtn.click();
	}

	public void goToPracticeForm() {
		formsBtn.click();
		practiceFormBtn.click();
	}

	public void goToWebTables() {
		elementsBtn.click();
		webTablesBtn.click();
	}

	public void enterInformation() {
		firstNameInput.sendKeys("this is first name");
		lastNameInput.sendKeys("this is last name");
		emailInput.sendKeys("testemail@mail.com");

		String gender = "Male";
		WebElement genderRd = driver.findElement(By.xpath("//input[@value='" + gender + "']"));
		jsExecutor.executeScript("arguments[0].click();", genderRd);

		mobileInput.sendKeys("0920000333");

	}

	public void deleteRecord(String name) {
		driver.findElement(By.xpath("//div[text()='" + name + "']//parent::div[@role='row']//span[@title='Delete']")).click();
	}

	public void setSearchInput(String searchValue) {
		searchInput.sendKeys(searchValue);
	}
}
