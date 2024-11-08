package pages;

import java.io.Console;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import com.github.javafaker.IdNumber;
import com.github.javafaker.Number;
import core.ActionDriver;
import testData.PIMdata;
import utilities.ReportManager;

public class pimPage_employeeList
{
	
	
	public static class inputEEid {
		private static String inputEEid = "input employee id";
		private static By locator = By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div//input");
		
			public static void setInt(int value) {ActionDriver.WebActions.setInt(inputEEid, locator, value);}
			public static void clearText() {ActionDriver.WebActions.clearText(inputEEid, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(inputEEid, locator);}
			public static void selectAll() {ActionDriver.WebActions.selectAll(inputEEid, locator);}
	}
	public static class button_Submit{
		private static String button_Submit = "Submit button";
		private static By locator = By.xpath("//button[contains(@class,'secondary')]");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_Submit, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(button_Submit, locator);}
		public static void moveToElement() throws InterruptedException {ActionDriver.WebActions.moveToElement(locator);}
		
	}
	
	public static class geteeID{
		private static String geteeID = "Employee ID value";
		private static By locator = By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div//input");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(geteeID, locator);}
		//public static void assertStatus(String value) {ActionDriver.WebActions.assertStatus(getText_eeID, locator,value);}
		public static void setInt(int value) {ActionDriver.WebActions.setInt(geteeID, locator,value);}
	}
	
	public static class retrieveCreatedEE{
		private static String retrieveCreatedEE = "Created EE ID element";
		private static By locator = By.xpath("//div[text()='"+PIMdata.currentEEId+"']/parent::div");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(retrieveCreatedEE, locator);}
		public static void assertInt(int value) {ActionDriver.WebActions.assertInt(retrieveCreatedEE, locator,value);}
		//public static void captureScreenShot() {ActionDriver.WebActions.captureScreenShot(retrieveCreatedEE, locator);}
	}
}
