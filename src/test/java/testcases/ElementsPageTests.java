package testcases;

import org.testng.annotations.Test;
import pageobjects.ElementsPage;

public class ElementsPageTests extends BaseTest {

	ElementsPage elementsPage;

	@Test
	public void fillInInformation() {
		elementsPage = new ElementsPage(driver);
		elementsPage.goToElementPages();
		elementsPage.goToPracticeForm();
		elementsPage.enterInformation();
	}

}
