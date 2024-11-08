package pages;

import java.io.Console;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import com.github.javafaker.IdNumber;
import com.github.javafaker.Number;
import core.ActionDriver;
import testData.PIMdata;
import utilities.ReportManager;

public class pimPage_Configuration {
	

	public static class link_Download{
		private static String link_Download = "Download link";
		private static By locator = By.xpath("//a[text()='Download']");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(link_Download, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(link_Download, locator);}
		
	}
	public static class btn_browse{
		private static String btn_browse = "browse button";
		private static By locator = By.xpath("//div[text()='Browse']");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(btn_browse, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(btn_browse, locator);}
		
	}
	public static class field_inputPathtoUploadData{
		private static String field_inputPathtoUploadData = "field_inputPathtoUploadData";
		private static By locator = By.xpath("//input[@type='file']");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(field_inputPathtoUploadData, locator);}
		public static void setText(String value) {ActionDriver.WebActions.setText(field_inputPathtoUploadData, locator, value);}
		
	}
	public static class btn_Open{
		private static String btn_Open = "button Open";
		private static By locator = By.xpath("//button[text()='&Open']");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(btn_Open, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(btn_Open, locator);}
		
	}
	public static class buttonCreateorSave{
		private static String buttonCreate = "button Save/Create";
		private static By locator = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(buttonCreate, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(buttonCreate, locator);}
	}
	public static class Message_SuccessfulImport{
		private static String Message_SuccessfulImport = "Message_SuccessfulImport";
		private static By locator = By.xpath("//p[contains(@class,'oxd-text oxd-text--p oxd-text--card-body orangehrm-success-message')]//parent::div");
		
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(Message_SuccessfulImport, locator);}
	}

	
	
	
}
