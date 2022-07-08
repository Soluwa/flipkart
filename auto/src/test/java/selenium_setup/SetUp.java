package selenium_setup;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.auto.utility.PropertyFileReader;
import com.auto.utility.RunCMD;

import Page.GoogleHomePage;
import TestBase.BaseClass;
import utils.Photographer;

public class SetUp extends BaseClass {
	
	/*
	 * public SetUp(WebDriver driver) { super(driver); }
	 */

	//WebDriver driver;
	GoogleHomePage homepage = new GoogleHomePage();
	
	@BeforeTest
	public void launchBrowser() {
		 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
	    //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	public void gotoURL() {
		navigateToSite("https://www.facebook.com");
		System.out.println(getSiteTitle());
		//clickOnElement(homepage.moreOptionLink);
		//clickOnElement(locateElement("//button//a[text()='More options']"));
		
		//clickOnElement(homepage.searcCustomisatioOffButton);
		//driver.quit();
		/*
		 * moveToElement(homepage.addPersonalisationOffButton);
		 * clickOnElement(homepage.addPersonalisationOffButton);
		 */
		
		/*
		 * moveToElement(homepage.rejectAllButton);
		 * clickOnElement(homepage.rejectAllButton);
		 */
		
	}
	
	
	  @AfterTest
	  public void tearDown() 
	  { 
		  //driver.close();
		  //driver.quit();
		  Photographer.captureShot("facebook_landingPage");
		  RunCMD.runCommand(PropertyFileReader.ReadData("FirefoxExeKillCommand"));
	  }
	 
}
