package pages;

import java.io.Console;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.github.javafaker.IdNumber;
import com.github.javafaker.Number;

import core.ActionDriver;
import testData.MyInfoData;
import testData.PIMdata;
import utilities.ReportManager;

public class adminPage_userManagement {
	
	public static class dropdown_UserRole{
		private static String dropdown_UserRole = "User role dropdown";
		private static By locator = By.xpath("//label[text()='User Role']/parent::div/following-sibling::div");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(dropdown_UserRole, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(dropdown_UserRole, locator);}
	}
	public static class dropdown_Status{
		private static String dropdown_UserRole = "Status dropdown";
		private static By locator = By.xpath("//label[text()='Status']/parent::div/following-sibling::div");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(dropdown_UserRole, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(dropdown_UserRole, locator);}
	}
	
	public static class dropdown_UserRole_options{
		private static String dropdown_Status_options = "Listbox user role options";
		private static By locator = By.xpath("//span[text()='Admin']//parent::div");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(dropdown_Status_options, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(dropdown_Status_options, locator);}
			
	}
	public static class dropdown_Status_options{
		private static String dropdown_Status_options = "Listbox status options";
		private static By locator = By.xpath("//span[text()='Enabled']//parent::div");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(dropdown_Status_options, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(dropdown_Status_options, locator);}
			
	}
	
	public static class retrieveExistingEE{
		private static String retrieveExsitingEE = "Created EE ID element";
		private static By locator = By.xpath("//div[text()='"+PIMdata.currentEEId+"']/parent::div");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(retrieveExsitingEE, locator);}
		public static void assertInt(int value) {ActionDriver.WebActions.assertInt(retrieveExsitingEE, locator,value);}
		//public static void captureScreenShot() {ActionDriver.WebActions.captureScreenShot(retrieveCreatedEE, locator);}
	}
	
	public static class inputUsername{
		private static String inputUsername = "Username field";
		private static By locator = By.xpath("//label[text()='Username']/parent::div/following-sibling::div//input");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(inputUsername, locator);}
		public static void setText(String value) {ActionDriver.WebActions.setText(inputUsername, locator, value);}
		public static void selectAll() {ActionDriver.WebActions.selectAll(inputUsername, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(inputUsername, locator);}
	}
	
	public static class inputFullName{
		private static String inputFullName = "Input Employee fullname of existing employee";
		private static By locator = By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div//input");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(inputFullName, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(inputFullName, locator);}
		public static void setStoredValue() {ActionDriver.WebActions.setStoredValue(inputFullName, locator);}
		public static void selectAll() {ActionDriver.WebActions.selectAll(inputFullName, locator);}
		//public static void storeText() {ActionDriver.WebActions.storeText();}
		//public static void assertInt(int value) {ActionDriver.WebActions.assertInt(retrieveExsitingEE, locator,value);}
		//public static void captureScreenShot() {ActionDriver.WebActions.captureScreenShot(retrieveCreatedEE, locator);}
	}
	public static class setpassword {
		private static String password = "confirm password";
		private static By locator = By.xpath("//label[text()='Confirm Password']/parent::div/following-sibling::div//input");
		
			public static void clickElement() {ActionDriver.WebActions.clickElement(password, locator);}
			public static void setText(String value) {ActionDriver.WebActions.setText(password, locator, value);}
			public static void selectAll() {ActionDriver.WebActions.selectAll(password, locator);}
			public static void setPassword(String value) {ActionDriver.WebActions.setText(password, locator, value);}
	}
	public static class setpassword2 {
		private static String setpassword2 = "password";
		private static By locator = By.xpath("//label[text()='Password']/parent::div/following-sibling::div//input");
		
			public static void clickElement() {ActionDriver.WebActions.clickElement(setpassword2, locator);}
			public static void setText(String value) {ActionDriver.WebActions.setText(setpassword2, locator, value);}
			public static void setPassword(String value) {ActionDriver.WebActions.setText(setpassword2, locator, value);}
	}
	public static class assertRoleOfEE {
		private static String assertRoleOfEE = "Assert assigned Role for the existing EE";
		private static By locator = By.xpath("(//div[contains(@class,'oxd-table-cell oxd-padding-cell')]//div)[4]");
		
		public static void assertText(String value) {ActionDriver.WebActions.assertText(assertRoleOfEE, locator,value);}
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(assertRoleOfEE, locator);}
		
			
	}
	public static class assertFNOfEE {
		private static String assertFNOfEE = "Assert that the Admin role is assigned to the expected firstname of existing EE";
		private static By locator = By.xpath("(//div[contains(@class,'oxd-table-cell oxd-padding-cell')]//div)[6]");
		
		public static void assertValueEquals() {ActionDriver.WebActions.assertValueEquals(assertFNOfEE, locator);}
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(assertFNOfEE, locator);}
		
			
	}
	public static class buttonCreateorSave{
		private static String buttonCreate = "button Save/Create";
		private static By locator = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(buttonCreate, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(buttonCreate, locator);}
	}
	
}
