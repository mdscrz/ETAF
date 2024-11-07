package pages;

import java.time.*;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import org.openqa.selenium.By;
import core.ActionDriver;
import testData.ClaimData;

public class claimPage_submitClaim {

	
	public static class dropdown_Event{
		private static String dropdown_Event = "Event dropdown";
		private static By locator = By.xpath("//label[text()='Event']/parent::div/following-sibling::div");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(dropdown_Event, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(dropdown_Event, locator);}
	}
	public static class dropdown_Curr{
		private static String dropdown_Curr = "Currency dropdown";
		private static By locator = By.xpath("//label[text()='Currency']/parent::div/following-sibling::div");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(dropdown_Curr, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(dropdown_Curr, locator);}
	}
	public static class dropdown_ExpenseType{
		private static String dropdown_ExpenseType = "Expense Type dropdown";
		private static By locator = By.xpath("//label[text()='Expense Type']/parent::div/following-sibling::div");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(dropdown_ExpenseType, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(dropdown_ExpenseType, locator);}
	}
	public static class dropdown_Listbox{
		private static String dropdown_Listbox = "Listboxdropdown";
		private static By locator = By.xpath("//div[@role='listbox']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(dropdown_Listbox, locator);}
	}
	public static class dropdown_Event_options{
		private static String dropdown_Event_options = "Listbox Event options";
		private static By locator = By.xpath("//span[text()='Accommodation']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(dropdown_Event_options, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(dropdown_Event_options, locator);}
			
	}
	public static class dropdown_Curr_options{
		private static String dropdown_Curr_options = "Listbox Currency options";
		private static By locator = By.xpath("//span[text()='Australian Dollar']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(dropdown_Curr_options, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(dropdown_Curr_options, locator);}
	}
	public static class field_Remark{
		private static String field_Remark = "Remarks Field description";
		private static By locator = By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(field_Remark, locator);}
			public static void setText(String value) {ActionDriver.WebActions.setText(field_Remark, locator, value);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(field_Remark, locator);}
	}
	public static class buttonCreateorSave{
		private static String buttonCreate = "button Save/Create";
		private static By locator = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(buttonCreate, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(buttonCreate, locator);}
	}
	
		public static class checkbox_expenseType{
		private static String checkbox_expenseType = "Expense Type Checkbox";
		private static By locator = By.xpath("//h6[text()='Submit Claim']");
		
		public static void clickElement() {ActionDriver.WebActions.clickElement(checkbox_expenseType, locator);}
		
	}
	public static class button_Submit{
		private static String button_Submit = "Submit button";
		private static By locator = By.xpath("//button[contains(@class,'secondary')]");
		
		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_Submit, locator);}
		public static void clickElement() {ActionDriver.WebActions.clickElement(button_Submit, locator);}
		public static void moveToElement() throws InterruptedException {ActionDriver.WebActions.moveToElement(locator);}
		
	}
	public static class value_referenceID{
		private static String button_Submit = "Reference ID value";
		private static By locator = By.xpath("//button[contains(@class,'sm-button')][3]");
		
		public static void clickElement() {ActionDriver.WebActions.clickElement(button_Submit, locator);}
		
	}
	public static class Tab_addExpense{
		private static String Tab_addExpense = "Add expense tab";
		private static By locator = By.xpath("//p[text()='Add Expense']");

		public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(Tab_addExpense, locator);}
		
	}
	public static class inputDateNow{
		private static LocalDate currentDate = LocalDate.now();
		//int minute = currentDate.get(ChronoField.MINUTE_OF_HOUR);
		private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		private static String DateNow = currentDate.format(formatter);
		
		private static String inputDateNow = "Input Date today";
		private static By locator = By.xpath("//label[text()='Date']/parent::div/following-sibling::div//input");

		public static void setText() {ActionDriver.WebActions.setText(inputDateNow, locator, DateNow);}
		
	}
	public static class inputAmt{
		private static String inputAmt = "Input Amount";
		private static By locator = By.xpath("//label[text()='Amount']/parent::div/following-sibling::div//input");

		public static void setText(String value) {ActionDriver.WebActions.setText(inputAmt, locator, value);}
		
	}
	public static class dropdown_expenseType_options{
		private static String dropdown_expenseType_options = "Listbox Expense Type options";
		private static By locator = By.xpath("//span[text()='"+ClaimData.ExpenseType_Data+"']");
		
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(dropdown_expenseType_options, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(dropdown_expenseType_options, locator);}
	}
	public static class assertAddedExpense{
		private static String assertAddedExpense = "Expense type added in claims";
		private static By locator = By.xpath("//div[text()='"+ClaimData.ExpenseType_Data+"']");

		public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(assertAddedExpense, locator);}
	}
	public static class assertclaimStatus{
		private static String assertclaimStatus = "Assert Claim status";
		private static By locator = By.xpath("(//div[contains(@class,'oxd-table-cell oxd-padding-cell')]//div)[6]");
		
		public static void assertText(String expectedValue) {ActionDriver.WebActions.assertText(assertclaimStatus, locator, expectedValue);}
		//public static void assertValue(String expectedValue) {ActionDriver.WebActions.getAttributeValue(assertclaimStatus, locator, expectedValue);}
	}
	
}

