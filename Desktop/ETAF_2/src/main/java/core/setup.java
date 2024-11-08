package core;

import org.testng.annotations.BeforeTest;
import pages.loginPage;
import testData.*;
import utilities.ConfigReader;


public class setup {
	//@BeforeTest
	public static void LoginToOrangeHRM(String uname,String pw)
	{
		
		
		loginPage.setUsername.assertElementDisplayed();
		loginPage.setUsername.setText(uname);
		loginPage.setpassword.assertElementDisplayed();
		loginPage.setpassword.setText(pw);
		loginPage.clickLoginButton.clickElement();
		
	}
}
