package pages;

import java.io.Console;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import com.github.javafaker.IdNumber;
import com.github.javafaker.Number;
import core.ActionDriver;
import testData.PIMdata;
import utilities.ReportManager;

public class performancePage {
	
	public static class button_Add {
		private static String button_Add = "addButton";
		private static By locator = By.xpath("//i[contains(@class,'oxd-icon bi-plus oxd-button-icon')]/parent::button");
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(button_Add, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_Add, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(button_Add, locator);}
	}

	public static class header_ManageReviews{
		private static String header_ManageReviews = "header Manage Reviews";
		private static By locator = By.xpath("//span[contains(text(),'Manage Reviews')]/ancestor::li");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(header_ManageReviews, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(header_ManageReviews, locator);}
		
	}
	public static class header_ManageReviews_opt{
		private static String header_ManageReviews_opt = "header Manage Reviews options";
		private static By locator = By.xpath("//a[contains(text(),'Manage Reviews') and contains(@role,'menuitem')]");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(header_ManageReviews_opt, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(header_ManageReviews_opt, locator);}
		
	}
	
	
}
