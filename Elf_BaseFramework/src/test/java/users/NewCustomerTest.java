package users;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.TasksPage;

public class NewCustomerTest extends Base_Class{

	@Test
	public void Go_To_Tasks() {
		homePage.getTasksTab().click();
		TasksPage newCustomer = new TasksPage(driver);
		newCustomer.getAddnew().click();
		newCustomer.getNewcustomer().click();
		newCustomer.getEnterCustomerName().sendKeys("Lincoln Navigator");
		newCustomer.getDescription().sendKeys("The Lincoln Navigator is a full-size luxury SUV marketed and sold by the Lincoln brand of Ford Motor Company since the 1998 model year.");
		newCustomer.getCreateCustomer().click();
	}

}
