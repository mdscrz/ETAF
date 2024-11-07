package pages;

import java.io.Console;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.github.javafaker.IdNumber;
import com.github.javafaker.Number;

import core.ActionDriver;
import testData.PIMdata;
import utilities.ReportManager;

public class adminPage {
	
	public static class button_Add {
		private static String button_Add = "addButton";
		private static By locator = By.xpath("//i[contains(@class,'oxd-icon bi-plus oxd-button-icon')]/parent::button");
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(button_Add, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_Add, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(button_Add, locator);}
	}
	
	public static class tab_userManagement {
		private static String tab_userManagement = "tab User Management";
		private static By locator = By.xpath("//span[contains(text(),'User')]");
		
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tab_userManagement, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tab_userManagement, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(tab_userManagement, locator);}
	}
	
}
