package testcases;

import org.testng.annotations.Test;
import pageobjects.ElementsPage;

public class WebTablePageTests extends BaseTest {

	ElementsPage elementsPage;

	@Test
	public void deleteRecordInTableTest() {
		elementsPage = new ElementsPage(driver);
		elementsPage.goToElementPages();
		elementsPage.goToWebTables();
		elementsPage.deleteRecord("Alden");
	}

	@Test
	public void searchInTableTest() {
		elementsPage.setSearchInput("Cierra");
	}
}
