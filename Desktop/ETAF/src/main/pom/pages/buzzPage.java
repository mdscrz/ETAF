package pages;

import java.io.Console;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.github.javafaker.IdNumber;
import com.github.javafaker.Number;

import core.ActionDriver;
import testData.BuzzData;
import testData.PIMdata;
import utilities.ReportManager;

public class buzzPage {
	
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
	
	public static class field_post {
		private static String field_post = "field post";
		private static By locator = By.xpath("//textarea[contains(@class,'oxd-buzz-post-input')]");
		
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(field_post, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(field_post, locator);}
			public static void setText(String value) {ActionDriver.WebActions.setText(field_post, locator, value);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(field_post, locator);}
			public static void moveToElement() throws InterruptedException {ActionDriver.WebActions.moveToElement(locator);}
	}
	
	public static class button_Post {
		private static String button_Post = "post button";
		private static By locator = By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--main')]");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_Post, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(button_Post, locator);}
	}
	public static class validateRecentPost {
		private static String validateRecentPost = "post button";
		private static By locator = By.xpath("(//p[text()='Insert post test description for validation']/parent::div)[1]");
		
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(validateRecentPost, locator);}
			
	}

}
