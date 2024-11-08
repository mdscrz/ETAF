package pages;

import org.openqa.selenium.By;

import core.ActionDriver;
import utilities.ConfigReader;

public class myInfoPage {
	
	public static class eeFullName {
		private static String eeFullName = "Employee full name";
		private static By locator = By.xpath("//h6[@class='oxd-text oxd-text--h6 --strong']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(eeFullName, locator);}
			public static void getAttributeTextContent(String value) {ActionDriver.WebActions.getAttributeTextContent(eeFullName, locator,value);}
			public static void getText(String value) {ActionDriver.WebActions.getText(eeFullName, locator,value);}
	}
	
	public static class eeFirstName {
		private static String eeFN = "Employee first name";
		private static By locator = By.xpath("//label[text()='Employee Full Name']/ancestor::div/following-sibling::div//input[@name='firstName']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(eeFN, locator);}
			public static void getAttributeValue(String value) {ActionDriver.WebActions.getAttributeValue(eeFN, locator,value);}
	}
	public static class eeMiddleName {
		private static String eeMN = "Employee middle name";
		private static By locator = By.xpath("//label[text()='Employee Full Name']/ancestor::div/following-sibling::div//input[@name='middleName']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(eeMN, locator);}
			public static void getAttributeValue(String value) {ActionDriver.WebActions.getAttributeValue(eeMN, locator,value);}
	}
	public static class eeLastName {
		private static String eeLN = "Employee last name";
		private static By locator = By.xpath("//label[text()='Employee Full Name']/ancestor::div/following-sibling::div//input[@name='lastName']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(eeLN, locator);}
			public static void getAttributeValue(String value) {ActionDriver.WebActions.getAttributeValue(eeLN, locator,value);}
	}
	
}
