package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class AdminLoginPage {
	
WebDriver driver;
public AdminLoginPage(WebDriver rdriver) {
	
	driver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(xpath = "//input[@id='txtUsername']")
WebElement Username;

@FindBy(xpath = "//input[@id='txtPassword']")
WebElement Password;

@FindBy(xpath = "//input[@id='btnLogin']")
WebElement loginBtn;


public void enterUsername(String username) 
{
	Username.sendKeys(username);	
}
public void enterPassword(String password) 
{
	Password.sendKeys(password);	
}
public void clickOnLoginbtn() 
{

	loginBtn.click();	
}

}
