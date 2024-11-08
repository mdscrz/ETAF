package pages;

import org.openqa.selenium.By;

import core.ActionDriver;
import utilities.ConfigReader;

public class directoryPage {
	
	public static class eeFullName {
		private static String EN = "Employee Name";
		private static By locator = By.xpath("//label[text()='Employee Name']/ancestor::div/following-sibling::div//input");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(EN, locator);}
			public static void setText(String value) {ActionDriver.WebActions.setText(EN, locator, value);}
			public static void setStoredValue() {ActionDriver.WebActions.setStoredValue(EN, locator);}
	}
	public static class button_Search {
		private static String btnSearch = "Search button";
		private static By locator = By.xpath("//label[text()='Employee Name']/ancestor::div/following-sibling::div//input");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(btnSearch, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(btnSearch, locator);}
	}
	
	public static class validateSearchEE {
		private static String searchedEE = "Search employee records";
		private static By locator = By.xpath("//div[contains(@class,'orangehrm-directory-card')]/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']");
		
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(searchedEE, locator);}
	}
}