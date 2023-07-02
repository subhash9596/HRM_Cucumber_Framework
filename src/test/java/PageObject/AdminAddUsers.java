package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminAddUsers {

	WebDriver driver;

	public AdminAddUsers(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Click on Admin Loink
	@FindBy(linkText = "Admin")
	WebElement ClickOnAdminMenu;

	// Click on Add Button
	@FindBy(xpath = "//input[@id='btnAdd']")
	WebElement ClickOnAddbtn;

	// Select User Role
	@FindBy(xpath = "//select[@id='systemUser_userType']")
	WebElement SelectUserRole;

	// Employee Name
	@FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
	WebElement EmployeeName;

	// Enter User Name
	@FindBy(xpath = "//input[@id='systemUser_userName']")
	WebElement EnterUsername;

	// Select Status from dropdown
	@FindBy(xpath = "//select[@id='systemUser_status']")
	WebElement SelectStatus;

	// Enter User Name
	@FindBy(xpath = "//input[@id='systemUser_password']")
	WebElement enterPasswrod;

	// Enter Confirm Passwrod
	@FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
	WebElement enterConfimPasswrod;

	// Click on Save button
	@FindBy(xpath = "//input[@id='btnSave']")
	WebElement clickOnsavebtn;

	public void ClickAdminMenu() {
		ClickOnAdminMenu.click();

	}

	public void ClickonAdminBtn() {
		ClickOnAddbtn.click();

	}

	public void selectUserRole(String role) {

		Select select = new Select(SelectUserRole);
		select.selectByVisibleText(role);
	}

	public void employeeName(String empName) {
		EmployeeName.sendKeys(empName);
	}

	public void userName(String username) {

		EnterUsername.sendKeys(username);
	}

	public void selectStatus(String status) {

		Select select = new Select(SelectStatus);
		select.selectByVisibleText(status);
	}

	public void enterPassword(String password) {
		enterPasswrod.sendKeys(password);

	}

	public void enterConformPassword(String conformPasswrod) {
		enterConfimPasswrod.sendKeys(conformPasswrod);

	}

	public void ClickOnSaveBtn() {
		clickOnsavebtn.click();

	}

}
