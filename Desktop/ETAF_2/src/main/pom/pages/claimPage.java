package pages;

import java.time.*;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import org.openqa.selenium.By;
import core.ActionDriver;
import testData.ClaimData;

public class claimPage {

	public static class button_Add {
		private static String button_Add = "addButton";
		private static By locator = By.xpath("//i[contains(@class,'oxd-icon bi-plus oxd-button-icon')]/parent::button[1]");
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(button_Add, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_Add, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(button_Add, locator);}
	}
	public static class button_SumbitClaim{
		private static String button_SumbitClaim = "Submit Claim button";
		private static By locator = By.xpath("//a[text()='Submit Claim']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_SumbitClaim, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(button_SumbitClaim, locator);}
	}
	
	public static class buttonCreateorSave{
		private static String buttonCreate = "button Save/Create";
		private static By locator = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(buttonCreate, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(buttonCreate, locator);}
	}
	public static class header_submitClaim{
		private static String header_submitClaim = "Submit claim header";
		private static By locator = By.xpath("//h6[text()='Submit Claim']");
		
		public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(header_submitClaim, locator);}
	}
	public static class header_MyClaims{
		private static String header_MyClaims = "My claims header";
		private static By locator = By.xpath("//a[text()='My Claims']");
		
		public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(header_MyClaims, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(header_MyClaims, locator);}
	}
	
	public static class button_Submit{
		private static String button_Submit = "Submit button";
		private static By locator = By.xpath("//button[contains(@class,'secondary')]");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_Submit, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(button_Submit, locator);}
		public static void moveToElement() throws InterruptedException {ActionDriver.WebActions.moveToElement(locator);}
	
	}
	
}

