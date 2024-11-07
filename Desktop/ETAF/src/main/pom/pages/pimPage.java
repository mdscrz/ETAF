package pages;

import java.io.Console;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import com.github.javafaker.IdNumber;
import com.github.javafaker.Number;
import core.ActionDriver;
import testData.PIMdata;
import utilities.ReportManager;

public class pimPage {
	
	public static class button_Add {
		private static String button_Add = "addButton";
		private static By locator = By.xpath("//i[contains(@class,'oxd-icon bi-plus oxd-button-icon')]/parent::button");
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(button_Add, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_Add, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(button_Add, locator);}
	}

	public static class button_eeList{
		private static String button_eeList = "Employee List button";
		private static By locator = By.xpath("//a[contains(text(),'Employee List')]");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_eeList, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(button_eeList, locator);}
		
	}
	
	public static class tab_Configuration{
		private static String tab_Configuration = "Configuration tab";
		private static By locator = By.xpath("//span[contains(text(),'Configuration')]");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tab_Configuration, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(tab_Configuration, locator);}
		
	}
	public static class tab_Configuration_options{
		private static String tab_Configuration_options = "Configuration tab options";
		private static By locator = By.xpath("//a[text()='Data Import']/parent::li");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tab_Configuration_options, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(tab_Configuration_options, locator);}
		
	}
	
	
}
