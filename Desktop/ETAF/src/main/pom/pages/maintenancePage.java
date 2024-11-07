package pages;

import java.io.Console;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import com.github.javafaker.IdNumber;
import com.github.javafaker.Number;
import core.ActionDriver;
import testData.PIMdata;
import utilities.ReportManager;

public class maintenancePage {
	
	public static class buttonCreateorSave{
		private static String buttonCreate = "button Save/Create";
		private static By locator = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(buttonCreate, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(buttonCreate, locator);}
	}
	
	public static class header_accessRecords{
		private static String header_accessRecords = "Header Access Records";
		private static By locator = By.xpath("//a[text()='Access Records']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(header_accessRecords, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(header_accessRecords, locator);}
	}
	public static class button_Submit{
		private static String button_Submit = "Submit button";
		private static By locator = By.xpath("//button[contains(@class,'secondary')]");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_Submit, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(button_Submit, locator);}
		public static void moveToElement() throws InterruptedException {ActionDriver.WebActions.moveToElement(locator);}
	
	}
	public static class setpassword {
		private static String password = "password";
		private static By locator = By.xpath("//input[@name='password']");
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(password, locator);}
			public static void setText(String value) {ActionDriver.WebActions.setText(password, locator, value);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(password, locator);}
			public static void setPassword(String value) {ActionDriver.WebActions.setText(password, locator, value);}
	}
}
