package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotYourPasswordPage  {
	
	WebDriver driver;
	
	public ForgotYourPasswordPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(linkText = "Forgot your password?")
	WebElement ForgotPasswordLink;
	
	@FindBy(xpath = "//input[@id='securityAuthentication_userName']")
	WebElement HRMUsername;

	@FindBy(xpath = "//input[@id='btnSearchValues']")
	WebElement ResetPasswordbtn;
	
	@FindBy(xpath = "//h1[normalize-space()='Forgot Your Password?']")
	WebElement TitleOfPage;
	
	public void ClickOnForgotPasswordlink() throws Exception 
	{
		ForgotPasswordLink.click();	
	}
	public void enterHRMUsername(String username) 
	{
		HRMUsername.sendKeys(username);	
	}
	public void titleofPage() 
	{
		HRMUsername.getText();	
	}
	public void clickOnResetpasswrodBtn() 
	{
		ResetPasswordbtn.click();
	}


}
