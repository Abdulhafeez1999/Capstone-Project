package users;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.TasksPage;

public class NewProjectTest extends Base_Class {
	@Test
	public void Go_To_Tasks() {
		homePage.getTasksTab().click();
		TasksPage newProject = new TasksPage(driver);
		newProject.getAddnew().click();
		newProject.getNewProject().click();
		newProject.getEnterProjectName().click();
		newProject.getEnterProjectName().sendKeys("First Release");
		newProject.getCustomerDropdown().click();
		newProject.getNewCustomer().click();
		newProject.getenterCustomerName().click();
		newProject.getenterCustomerName().sendKeys("Joels's Project");
		newProject.getProjectDescription().click();
		newProject.getProjectDescription().sendKeys("Joel Adams is an Australian pop/soul singer-songwriter and producer known for his hit debut single, \"Please Don't Go\" in 2015. On 5 October 2018, Adams' single, \"Fake Friends\" was released.");
		newProject.getEnterTaskname().click();
		newProject.getEnterTaskname().sendKeys("Joel Adams");
		newProject.getCreateProject().click();
	}
}
