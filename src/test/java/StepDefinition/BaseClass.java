package StepDefinition;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import PageObject.AdminAddUsers;
import PageObject.AdminLoginPage;
import PageObject.AdminSearchUser;
import PageObject.ForgotYourPasswordPage;


//Parent class
public class BaseClass {
	public static WebDriver driver;
	public AdminLoginPage adminlogin;
	public ForgotYourPasswordPage forgotpassword;
	public AdminAddUsers addusers;
	public AdminSearchUser searchuser;
	public static Logger log;
	public Properties readconfig;

	//Generated random email address
	public String generateEmailId() {
		return (RandomStringUtils.randomAlphabetic(6));
	}
	
	
}