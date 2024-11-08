package pages;

import java.io.Console;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import com.github.javafaker.IdNumber;
import com.github.javafaker.Number;
import core.ActionDriver;
import testData.PIMdata;
import utilities.ReportManager;

public class maintenancePage_accessRecords {
	
	public static class inputforDownloadPersonalData{
		private static String inputforDownloadPersonalData = "Input for Download Personal Data";
		private static By locator = By.xpath("//input[@placeholder='Type for hints...']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(inputforDownloadPersonalData, locator);}
			public static void setStoredValue() {ActionDriver.WebActions.setStoredValue(inputforDownloadPersonalData, locator);}
	}
	public static class button_Submit{
		private static String button_Submit = "Submit button";
		private static By locator = By.xpath("//button[contains(@class,'secondary')]");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_Submit, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(button_Submit, locator);}
		public static void moveToElement() throws InterruptedException {ActionDriver.WebActions.moveToElement(locator);}
	
	}
	public static class button_Download{
		private static String button_Download = "Download button";
		private static By locator = By.xpath("(//button[contains(@class,'secondary')])[2]");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_Download, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(button_Download, locator);}
	
	}
	public static class tab_Error{
		private static String tab_Error = "Error tab";
		private static By locator = By.xpath("//body[@class='neterror']/ancestor::html");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tab_Error, locator);}
	
	}
	
	public static class ValidateErrorPage{
		
		public static void errPage500() {ActionDriver.WebActions.errPage500();}
	
	}
}
