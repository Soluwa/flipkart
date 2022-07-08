package utils;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.BaseClass;

public class PageSynchroniser extends BaseClass {
	static WebDriverWait waiter;
	public static void waitforElementVisibility(By xpathOfElement, int timeToWaitFor) {
		  waiter = new WebDriverWait(driver,Duration.ofSeconds(timeToWaitFor));
					  waiter.until(ExpectedConditions.visibilityOfElementLocated(xpathOfElement));
	}
	
	public static void waitForElementClickability(By xpathOfElement, int timeToWaitFor) {
		 waiter = new WebDriverWait(driver,Duration.ofSeconds(timeToWaitFor));
					  waiter.until(ExpectedConditions.elementToBeClickable(xpathOfElement));
	}
	
	public static Alert waitsForElementClickability(By xpathOfElement, int timeToWaitFor) {
		 waiter = new WebDriverWait(driver,Duration.ofSeconds(timeToWaitFor));
					 return waiter.until(ExpectedConditions.alertIsPresent());
	}
}
