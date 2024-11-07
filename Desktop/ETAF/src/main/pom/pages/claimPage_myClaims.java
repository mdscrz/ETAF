package pages;

import java.time.*;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import org.openqa.selenium.By;
import core.ActionDriver;
import testData.ClaimData;

public class claimPage_myClaims{

	
	public static class assertclaimStatus{
		private static String assertclaimStatus = "Assert Claim status";
		private static By locator = By.xpath("(//div[contains(@class,'oxd-table-cell oxd-padding-cell')]//div)[6]");
		
		public static void assertText(String expectedValue) {ActionDriver.WebActions.assertText(assertclaimStatus, locator, expectedValue);}
		//public static void assertValue(String expectedValue) {ActionDriver.WebActions.getAttributeValue(assertclaimStatus, locator, expectedValue);}
	}
	
}

