package TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver = WebDriverManager.firefoxdriver().create();; 
	
	/*
	 * public BaseClass(WebDriver _driver) { this.driver = _driver; }
	 */
	public void navigateToSite(String siteURL) {
		driver.navigate().to(siteURL);
	}
	
	public void clickOnElement(WebElement elementToClickOn) {
		elementToClickOn.click();
	}
	
	public WebElement locateElement(String elementXpath) {
		return driver.findElement(By.xpath(elementXpath));
	}
	
	public String getSiteTitle() {
		return driver.getTitle();
	}
	
	public void moveToElement(WebElement elementToMoveTo) {
		Actions action = new Actions(driver);
		action.moveToElement(elementToMoveTo);
	}
}
