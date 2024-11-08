package pages;

import org.openqa.selenium.By;
import core.ActionDriver;

public class homePage {
	
	public static class homePageLogo {
		private static String homePageImg = "Orange HRM Homepage Logo";
		private static By locator = By.xpath("//img[contains(@src,'orangehrm-logo')]");
		
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(homePageImg, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(homePageImg, locator);}
		
	}
	
	public static class defaultHeader {
		private static String tabDashboard = "tab_Dashboard";
		private static By locator = By.xpath("//a[contains(@href,'dashboard')]");
		
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tabDashboard, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tabDashboard, locator);}
		
	}
	public static class defaulSelectedTab {
		private static String headerdashboard = "header_Dashboard";
		private static By locator = By.xpath("//h6[text()='Dashboard']");
		
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(headerdashboard, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(headerdashboard, locator);}
		
	}
	public static class tab_PIM {
		private static String tabPIM = "tab_PIM";
		private static By locator = By.xpath("//a[contains(@href,'pim')]");
		
			public static void clickElement() {ActionDriver.WebActions.clickElement(tabPIM, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tabPIM, locator);}
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tabPIM, locator);}
		
	}
	public static class tab_Leave {
		private static String tab_Leave = "tab_Leave";
		private static By locator = By.xpath("//a[contains(@href,'leave')]");
		
			public static void clickElement() {ActionDriver.WebActions.clickElement(tab_Leave, locator);}
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tab_Leave, locator);}
		
	}
	public static class tab_Time {
		private static String tab_Time = "tab_Time";
		private static By locator = By.xpath("//a[contains(@href,'time')]");
		
			public static void clickElement() {ActionDriver.WebActions.clickElement(tab_Time, locator);}
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tab_Time, locator);}
		
	}
	public static class tab_Recruitment {
		private static String tab_Recruitment = "tab_Recruitment";
		private static By locator = By.xpath("//a[contains(@href,'recruitment')]");
		
			public static void clickElement() {ActionDriver.WebActions.clickElement(tab_Recruitment, locator);}
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tab_Recruitment, locator);}
		
	}
	public static class tab_Buzz {
		private static String tabBuzz = "tab_Buzz";
		private static By locator = By.xpath("//a[contains(@href,'buzz')]");
		
			public static void clickElement() {ActionDriver.WebActions.clickElement(tabBuzz, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tabBuzz, locator);}
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tabBuzz, locator);}
		
	}
	public static class tab_Maintenance {
		private static String tab_Maintenance = "tab_Maintenance";
		private static By locator = By.xpath("//a[contains(@href,'maintenance')]");
		
			public static void clickElement() {ActionDriver.WebActions.clickElement(tab_Maintenance, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tab_Maintenance, locator);}
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tab_Maintenance, locator);}
		
	}
	
	public static class tab_Performance {
		private static String tab_Performance = "tab Performance";
		private static By locator = By.xpath("//a[contains(@href,'performance')]");
		
			public static void clickElement() {ActionDriver.WebActions.clickElement(tab_Performance, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tab_Performance, locator);}
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tab_Performance, locator);}
		
	}
	public static class tab_Directory {
		private static String tab_Directory = "tab Directory";
		private static By locator = By.xpath("//a[contains(@href,'directory')]");
		
			public static void clickElement() {ActionDriver.WebActions.clickElement(tab_Directory, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tab_Directory, locator);}
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tab_Directory, locator);}
		
	}
	public static class tab_Dashboard {
		private static String tab_Dashboard = "tab Dashboard";
		private static By locator = By.xpath("//a[contains(@href,'directory')]");
		
			public static void clickElement() {ActionDriver.WebActions.clickElement(tab_Dashboard, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tab_Dashboard, locator);}
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tab_Dashboard, locator);}
		
	}
		public static class tab_Claim {
		private static String tabPIM = "tab_Claim";
		private static By locator = By.xpath("//a[contains(@href,'claim')]");
		
			public static void clickElement() {ActionDriver.WebActions.clickElement(tabPIM, locator);}
			public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tabPIM, locator);}
			public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tabPIM, locator);}
		
	}
		public static class tab_Admin {
			private static String tab_Admin = "Admin Tab";
			private static By locator = By.xpath("//a[contains(@href,'admin')]");
			
				public static void clickElement() {ActionDriver.WebActions.clickElement(tab_Admin, locator);}
				public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tab_Admin, locator);}
				public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tab_Admin, locator);}
			
		}
		public static class tab_myInfo {
			private static String tab_myInfo = "My Info Tab";
			private static By locator = By.xpath("//a[contains(@href,'viewMyDetails')]");
			
				public static void clickElement() {ActionDriver.WebActions.clickElement(tab_myInfo, locator);}
				public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(tab_myInfo, locator);}
				public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(tab_myInfo, locator);}
			
		}
		public static class dropdown_Account {
			private static String dropdown_Account = "User account dropdown";
			private static By locator = By.xpath("//i[contains(@class,'oxd-userdropdown-icon')]");
			
				public static void clickElement() {ActionDriver.WebActions.clickElement(dropdown_Account, locator);}
				public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(dropdown_Account, locator);}
		}
		public static class button_Logout {
			private static String button_Logout = "User account logout";
			private static By locator = By.xpath("//a[contains(text(),'Logout')]");
			
				public static void clickElement() {ActionDriver.WebActions.clickElement(button_Logout, locator);}
				public static void waitElementVisible() {ActionDriver.WebActions.waitElementVisible(button_Logout, locator);}
		}
		

}
