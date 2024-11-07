package pages;

import org.openqa.selenium.By;

import core.ActionDriver;
import utilities.ConfigReader;

public class loginPage {
	
	public static class setURL {
			public static void navigateToURL(String value) {ActionDriver.WebActions.navigateToURL(value);}
		
	}
	public static class setUsername {
		private static String userName = "username";
		private static By locator = By.xpath("//input[@name='username']");
		
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(userName, locator);}
			public static void setText(String value) {ActionDriver.WebActions.setText(userName, locator, value);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(userName, locator);}
		
	}
	
	public static class setpassword {
		private static String password = "password";
		private static By locator = By.xpath("//input[@name='password']");
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(password, locator);}
			public static void setText(String value) {ActionDriver.WebActions.setText(password, locator, value);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(password, locator);}
			public static void setPassword(String value) {ActionDriver.WebActions.setText(password, locator, value);}
	}
	
	public static class clickLoginButton {
		private static String buttonLogin = "loginButton";
		private static By locator = By.xpath("//button[@type='submit']");
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(buttonLogin, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(buttonLogin, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(buttonLogin, locator);}
	}
	
	public static class assertLoginInvalid {
		private static String assertLoginInvalid = "Invalid credentials mesage";
		private static By locator = By.xpath("//p[text()='Invalid credentials']/parent::div[contains(@class,'error')]");
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(assertLoginInvalid, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(assertLoginInvalid, locator);}
	}
	public static class title_Login {
		private static String title_Login = "Login Title";
		private static By locator = By.xpath("//h5[text()='Login']/parent::div[contains(@class,'orangehrm-login-slot')]");
		
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(title_Login, locator);}
			public static void clickElement() {ActionDriver.WebActions.clickElement(title_Login, locator);}
	}
	
	
	
	
}
