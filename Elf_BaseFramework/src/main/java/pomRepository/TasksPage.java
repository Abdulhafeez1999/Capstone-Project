package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.Base_Class;

public class TasksPage extends Base_Class{
	public TasksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//=======================================> Module (New Customer) <======================================
	
	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement Addnew;
	public WebElement getAddnew() {
		return Addnew;
	}
	 @FindBy(xpath = "//div[text()='+ New Customer']")
	 private WebElement newcustomer;
	public WebElement getNewcustomer() {
		return newcustomer;
	}
	
	@FindBy(xpath = "(//input[@placeholder=\'Enter Customer Name\'])[2]")
	private WebElement EnterCustomerName;
	public WebElement getEnterCustomerName() {
		return EnterCustomerName;
	}
	@FindBy(xpath = "//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement Description;
	public WebElement getDescription() {
		return Description;
	}
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomer;
	public WebElement getCreateCustomer() {
		return createCustomer;
	}
	
	//=======================================> Module (New Project) <======================================
	
	
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newProject;
	public WebElement getNewProject() {
		return newProject;
	}
	@FindBy(xpath = "//input[contains(@class,\"projectNameField \")]")
	private WebElement EnterProjectName;

	public WebElement getEnterProjectName() {
		return EnterProjectName;
	}
	@FindBy(xpath = "//div[@class='emptySelection']")
	private WebElement customerDropdown;

	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}

	@FindBy(xpath = "//div[text()='-- New Customer --']")
	private WebElement newCustomer;

	public WebElement getNewCustomer() {
		return newCustomer;
	}
	@FindBy(xpath = "//input[@class='newCustomerNameField newCustomer']")
	private WebElement enterCustomerName;

	public WebElement getenterCustomerName() {
		return enterCustomerName;
	}
	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescription;
	
	public WebElement getProjectDescription() {
		return projectDescription;
	}
	@FindBy(xpath = "(//input[@class=\"inputFieldWithPlaceholder\"])[1]")
	private WebElement enterTaskname;

	public WebElement getEnterTaskname() {
		return enterTaskname;
	}
	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProject;

	public WebElement getCreateProject() {
		return createProject;
	}

}












































