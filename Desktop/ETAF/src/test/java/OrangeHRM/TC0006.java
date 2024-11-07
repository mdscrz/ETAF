package OrangeHRM;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import core.setup;
import pages.*;
import testData.*;
import utilities.ConfigReader;


public class TC0006 extends Hooks{
	@Test(description="Verify successful post in Buzz", 
			groups = {""})
		public static void VerifyDifferentLoginOptions() throws InterruptedException
		{
		
			ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("OrangeURL"));
			
			setup.LoginToOrangeHRM(LoginData.username_valid,LoginData.password_valid);
			homePage.tab_Buzz.waitElementVisible();
			homePage.tab_Buzz.clickElement();
			buzzPage.field_post.waitElementVisible();
			buzzPage.field_post.moveToElement();
			buzzPage.field_post.clickElement();
			buzzPage.field_post.setText(BuzzData.testPost);
			Thread.sleep(2000);
			buzzPage.button_Post.clickElement();
			
			Thread.sleep(5000);
			//assert
			buzzPage.validateRecentPost.assertElementDisplayed();
			
			
			
			
			
			
		}
			
}
