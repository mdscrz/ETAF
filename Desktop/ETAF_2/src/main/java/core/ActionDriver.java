package core;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import selenium.BrowserFactory;
import utilities.ConfigReader;
import utilities.ReportManager;
import utilities.Utility;
import org.openqa.selenium.interactions.Actions;
import java.util.*;
import java.util.Map.Entry;

public class ActionDriver {
	
	protected static ThreadLocal<Integer> step = new ThreadLocal<Integer>();
	protected static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public static ThreadLocal<Actions> actions = new ThreadLocal<Actions>();
	private static Map<String, String> mapStore= new HashMap<String, String>();
	//public static Actions actions = new Actions((WebDriver) driver);
	
	private static WebElement getElement(By locator) {
		WebElement element = getDriver().findElement(locator);
		return element;
	}
	
	private static void logToReporter(String desc) {
		ReportManager.testPass("Step " + step.get() + " - " + desc);
		step.set(step.get() + 1);
	}

	public synchronized static String captureScreenShot(String path) throws Exception {		
		/*File scrFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		path = path + System.currentTimeMillis() + ".png";
		FileUtils.copyFile(scrFile, new File(path));*/
		
		Utility.createDirectory(path);
		path = path + System.currentTimeMillis() + ".png";
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(ActionDriver.getDriver());
		ImageIO.write(screenshot.getImage(), "PNG", new File(path));

		return path;
	}	
	
	public static void closeInstance() {
		driver.get().quit();
		driver.remove();
	}
	
	public static void createInstance(String browser) {
		step.set(1);
		driver.set(BrowserFactory.launchApplication(browser));
	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}	
	
	public static class WebActions {
		public static void clearText(String elementName, By locator) {
			//action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
			getElement(locator).clear();
			logToReporter(elementName + " is cleared.");
			
		}
		
		// Verify Element is displayed
		public static void assertElementDisplayed(String elementName, By locator) {
			Assert.assertTrue(getElement(locator).isDisplayed());
			logToReporter(elementName + " is displayed.");
		}	
		
		// Verify Element is displayed
		public static void selectAll(String elementName, By locator) {
			
			new Actions(getDriver()).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
			logToReporter(elementName + " for select all action is successful.");
		}	
		
		// Click Element
		public static void clickElement(String elementName, By locator) {
			getElement(locator).click();
			logToReporter(elementName + " was clicked.");
		}
		
		public static void navigateToURL(String value) {
			getDriver().get(value);
		}
		
		// Set Password
			public static void setPassword(String elementName, By locator, String value) {
				getElement(locator).sendKeys(value);
				logToReporter(elementName + " is populated with ********.");
			}

		// Set Text
		public static void setText(String elementName, By locator, String value) {
			getElement(locator).sendKeys(value);
			logToReporter(elementName + " is populated with " + value + ".");
		}
		
		
		// Set int
		public static void setInt(String elementName, By locator, int value) {
			getElement(locator).sendKeys(String.valueOf(value));
			logToReporter(elementName + " is populated with " + value + ".");
		}
		// Wait for Element to be clickable
		public static void waitElementClickable(String elementName, By locator) {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable((By) getElement(locator)));
			getDriver().manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
			logToReporter(elementName + " is clickable.");
		}

		// Wait until element is not visible
		public static void waitElementNotVisible(String elementName, By locator) {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigReader.getIntProps("longWait")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated((By) getElement(locator)));
			logToReporter(elementName + " is not visible.");
		}

		// Wait until element is visible
		public static void waitElementVisible(String elementName, By locator) {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigReader.getIntProps("midWait")));
			wait.until(ExpectedConditions.visibilityOf(getElement(locator))).isDisplayed();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			logToReporter(elementName + " is visible.");
		}

		// Wait for page to load completely
		public static void waitPageLoadComplete() {
			new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd)
					.executeScript("return document.readyState").equals("complete"));
		}
		
		public static void assertText(String elementName, By locator,String expectedValue) {
			// wait = new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigReader.getIntProps("midWait")));
			//wait.until(ExpectedConditions.visibilityOf(getElement(locator))).isDisplayed();
			String getTextContent = getElement(locator).getText();
			
			logToReporter(getTextContent);
			assertEquals(getTextContent,expectedValue,"Text does not contain expected value!");
		}
		public static String getText(String elementName, By locator,String expectedValue) {
			// wait = new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigReader.getIntProps("midWait")));
			//wait.until(ExpectedConditions.visibilityOf(getElement(locator))).isDisplayed();
			expectedValue = getElement(locator).getText();
			storeText(expectedValue);
			logToReporter(expectedValue);
			logToReporter(elementName + " text attribute captured.");
			
			return expectedValue;
			
		}
		//
		public static void setStoredText(String elementName, By locator, String value) {
			storeText(value);
			getElement(locator).sendKeys(value);
			logToReporter(elementName + " is populated with " + value + ".");
		}
		
		public static String storeText(String expectedValue) {
			// wait = new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigReader.getIntProps("midWait")));
			//wait.until(ExpectedConditions.visibilityOf(getElement(locator))).isDisplayed();
			String storedText = expectedValue;
			logToReporter("!!!!!"+storedText);
			return storedText;
			
		}
		public static void getAttributeValue(String elementName, By locator,String expectedValue) {
			// wait = new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigReader.getIntProps("midWait")));
			//wait.until(ExpectedConditions.visibilityOf(getElement(locator))).isDisplayed();
			String getValue = getElement(locator).getAttribute("value");
			mapStore.put(expectedValue,getValue);
			logToReporter(getValue);
			System.out.println("Key: " + expectedValue + ", Value: " + getValue);
			//assertEquals(getValue,expectedValue,"Text does not contain expected value!");
		}
		public static void getAttributeTextContent(String elementName, By locator,String expectedValue) {
			// wait = new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigReader.getIntProps("midWait")));
			//wait.until(ExpectedConditions.visibilityOf(getElement(locator))).isDisplayed();
			String getValue = getElement(locator).getAttribute("textContent");
			mapStore.put(expectedValue,getValue);
			logToReporter(getValue);
			System.out.println("Key: " + expectedValue + ", Value: " + getValue);
			//assertEquals(getValue,expectedValue,"Text does not contain expected value!");
		}
		public static void setStoredValue(String elementName, By locator) {
			for (Map.Entry<String, String> entry : mapStore.entrySet()) {
			    String key = entry.getKey();
			    String value = entry.getValue();
			    System.out.println("Key: " + key + ", Value: " + value);
			    
			    getElement(locator).sendKeys(value+" ");
			    
			    //Thread.sleep(3000);
			    By locator2 = By.xpath("//span[contains(text(),'"+value+"')]/parent::div");
			    //String ENText = getElement(locator2).getText();
			    	if(getElement(locator2).isDisplayed())
			    	{
			    		
			    		getElement(locator2).click();
			    		break;
			    	}
			}

		    
			//logToReporter(getValue);
			//assertEquals(getValue,expectedValue,"Text does not contain expected value!");
		}
		public static void assertValueEquals(String elementName, By locator) {
			for (Map.Entry<String, String> entry : mapStore.entrySet()) {
			    String key = entry.getKey();
			    String value = entry.getValue();
			   // System.out.println("Key: " + key + ", Value: " + value);
			    
			   String actualValue = getElement(locator).getText();
			  // System.out.println(actualValue);
			 // assert(value,actualValue,"Text does not contain expected value!");
			  assertTrue(actualValue.contains(value),"Text does not contain expected value!");
			  break;
			}
			//logToReporter(getValue);
			
		}
		
		public static void getValue(String elementName, By locator,String expectedValue) {
			// wait = new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigReader.getIntProps("midWait")));
			//wait.until(ExpectedConditions.visibilityOf(getElement(locator))).isDisplayed();
			expectedValue = getElement(locator).getAttribute("value");
			logToReporter(expectedValue);
			//logToReporter(elementName + " value attribute captured.");
			//assertEquals(getValue,expectedValue,"Text does not contain expected value!");
		}
		public static void assertInt(String elementName, By locator,int expectedInt) {
			// wait = new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigReader.getIntProps("midWait")));
			//wait.until(ExpectedConditions.visibilityOf(getElement(locator))).isDisplayed();
			String getIntContent = getElement(locator).getText();
			String expectedIntToString = String.valueOf(expectedInt);
			logToReporter(getIntContent);
			assertTrue(expectedIntToString.contains(getIntContent),"The actual value does not match the expected value!");
		}
		public static void moveToElement(By locator) throws InterruptedException {
			Thread.sleep(3000);
			WebElement element = getDriver().findElement(locator);
			new Actions(getDriver()).moveToElement(element).perform();
		}
		
		public static void PressElement (By locator) throws InterruptedException {
			Thread.sleep(3000);
			WebElement element = getDriver().findElement(locator);
			new Actions(getDriver()).sendKeys(element).perform();
			new Actions(getDriver()).sendKeys(Keys.ENTER).perform();
			logToReporter("Perform Keyboard press TAB and ENTER");
		}
	}
}
