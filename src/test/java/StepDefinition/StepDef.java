package StepDefinition;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.AdminAddUsers;
import PageObject.AdminLoginPage;
import PageObject.AdminSearchUser;
import PageObject.ForgotYourPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

//Child class of base class
public class StepDef extends BaseClass {
	
	

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws Exception {
		readconfig = new Properties();
		FileInputStream file = new FileInputStream("config.properties");
		readconfig.load(file);
		
		String browser = readconfig.getProperty("browser");
		
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		log = org.apache.logging.log4j.LogManager.getLogger("StepDef");
		adminlogin = new AdminLoginPage(driver);
		forgotpassword = new ForgotYourPasswordPage(driver);
		addusers = new AdminAddUsers(driver);
		searchuser = new AdminSearchUser(driver);
	}
	@When("User opens URL{string}")
	public void user_opens_url(String Appurl) {
		log.info("The Users Opesn the URL");
		driver.get(Appurl);
	}

	@And("User enters valid username {string} ans password {string}")
	public void user_enters_valid_username_ans_password(String Username, String Passeord) {
		log.info("Enter Usernaem");
		adminlogin.enterUsername(Username);
		log.info("Enter Password");
		adminlogin.enterPassword(Passeord);
	}

	@And("Click on Loing button")
	public void click_on_loing_button() {
		adminlogin.clickOnLoginbtn();
	}

	@Then("The page title should be {string}")
	public void the_page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	// -------------------Forgot Password -----------------//

	@When("Click on Forgot Passwrod Link")
	public void click_on_forgot_passwrod_link() throws Exception {
		forgotpassword.ClickOnForgotPasswordlink();
	}

	@Then("User can view the title of page {string}")
	public void user_can_view_the_title_of_page(String string) {
		forgotpassword.titleofPage();
	}

	@When("User enter Username in text as {string}")
	public void user_enter_username_in_text_as(String hrmusername) {
		forgotpassword.enterHRMUsername(hrmusername);
	}

	@When("Click on Reset Password button")
	public void click_on_reset_password_button() {
		forgotpassword.clickOnResetpasswrodBtn();

	}

	// -----------------------Add Users ---------------------//

	@When("User click on Admin menu")
	public void user_click_on_admin_menu() {

		addusers.ClickAdminMenu();

	}

	@When("Click on Add button")
	public void click_on_add_button() {
		addusers.ClickonAdminBtn();

	}

	@Then("User can view Add Customer page")
	public void user_can_view_add_customer_page() {

	}

	@When("User enter customer information")
	public void user_enter_customer_information() {
		addusers.selectUserRole("ESS");
		addusers.employeeName("Subhash ingale");
		addusers.userName("subhash959698");
		addusers.selectStatus("Enabled");
		addusers.enterPassword("Subhash@959612");
		addusers.enterConformPassword("Subhash@959612");
	}

	@When("click on Save button.")
	public void click_on_save_button() {
		addusers.ClickOnSaveBtn();

	}

	// -----------------------Search Users -----------------------------//

	@Then("User can view System Users page")
	public void user_can_view_system_users_page() {

	}

	@When("User enter Username for search")
	public void user_enter_username_for_search() {

		searchuser.enterUsername("subhash959698");

	}

	@When("click on Search button.")
	public void click_on_search_button() {
		searchuser.clickSearchbtn();

	}

}
