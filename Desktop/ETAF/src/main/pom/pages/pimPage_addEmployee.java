package pages;

import java.io.Console;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import com.github.javafaker.IdNumber;
import com.github.javafaker.Number;
import core.ActionDriver;
import testData.PIMdata;
import utilities.ReportManager;

public class pimPage_addEmployee {
	
	
	
	public static class inputFirstName {
		private static String input_firstName = "input_firstName";
		private static By locator = By.xpath("//input[@name='firstName']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(input_firstName, locator);}
			public static void setText(String value) {ActionDriver.WebActions.setText(input_firstName, locator, value);}
	}
	
	public static class inputMiddleName {
		private static String input_middleName = "input_middleName";
		private static By locator = By.xpath("//input[@name='middleName']");
		
			public static void setText(String value) {ActionDriver.WebActions.setText(input_middleName, locator, value);}
	}
	
	public static class inputLastName {
		private static String input_LastName = "input_LastName";
		private static By locator = By.xpath("//input[@name='lastName']");
		
			public static void setText(String value) {ActionDriver.WebActions.setText(input_LastName, locator, value);}
	}
	
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

}
