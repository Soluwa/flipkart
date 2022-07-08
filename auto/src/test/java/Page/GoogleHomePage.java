package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseClass;

public class GoogleHomePage extends BaseClass {
	
	@FindBy(xpath="//button//a[text()='More options']")
	public WebElement moreOptionLink;

	@FindBy(xpath="//button[@jsname='yUNjVb']//span[@jsname='V67aGc']")
	public WebElement searcCustomisatioOffButton;
	
	@FindBy(xpath="//button[@jsname='VkrUPc']//span[@jsname='V67aGc']']")
	public WebElement addPersonalisationOffButton;
	
	@FindBy(xpath="//button//div[text()='Reject all']")
	public WebElement rejectAllButton;
	
	/*
	 * @FindBy(xpath="") public WebElement moreOptionLink;
	 */
	
	public GoogleHomePage() {
		PageFactory.initElements(driver, this);
	}
}
