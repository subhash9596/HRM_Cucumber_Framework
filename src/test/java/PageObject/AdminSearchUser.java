package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminSearchUser {

	WebDriver driver;

	public AdminSearchUser(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Enter Username
	@FindBy(xpath = "//input[@id='searchSystemUser_userName']")
	WebElement Username;

	//Search button
	@FindBy(xpath = "//input[@id='searchBtn']")
	WebElement clickOnSearchbtn;

	public void enterUsername(String username) {
		Username.sendKeys(username);
	}
	public void clickSearchbtn() {
		clickOnSearchbtn.click();

	}

}
