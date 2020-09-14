package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeStepDefinitions extends CommonMethods {

	@Given("log in")
	public void log_in() {
		sendText(login.userNametextBox, ConfigsReader.getPropValue("username"));
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);

	}

	@Given("go to Add Employee Page")
	public void go_to_Add_Employee_Page() {
		click(dash.pimLinkBtn);
		waitForVisibility(dash.addEmployeeBtn);
		click(dash.addEmployeeBtn);
	}

	@When("input the employee Full Name")
	public void input_the_employee_Full_Name() {
		waitForVisibility(addEmp.firstNameField);
		sendText(addEmp.firstNameField, "Edward");
		waitForVisibility(addEmp.middleName);
		sendText(addEmp.middleName, "M");
		waitForVisibility(addEmp.lastName);
		sendText(addEmp.lastName, "Howretyu");
		click(addEmp.saveButton);
	}

	@Then("verify the Personal Details text")
	public void verify_the_Personal_Details_text() {

		String firstName = "Edward";
		String middleName = "M";
		String lastName = "Howretyu";
		waitForVisibility(persDetails.progilePicText);
		Assert.assertEquals(persDetails.progilePicText.getText(), firstName + " " + middleName + " " + lastName);
	}

	@When("input the employee login details")
	public void input_the_employee_login_details() {
		waitForVisibility(addEmp.firstNameField);
		sendText(addEmp.firstNameField, "Alyna");
		waitForVisibility(addEmp.middleName);
		sendText(addEmp.middleName, "C");
		waitForVisibility(addEmp.lastName);
		sendText(addEmp.lastName, "Yashanikovici");
		click(addEmp.createLoginDetailsCheckbox);
		sendText(addEmp.userName, "Alyna245");
		sendText(addEmp.userPassword, "Hertyutyui12345%$#");
		sendText(addEmp.confirmPassword, "Hertyutyui12345%$#");
		click(addEmp.saveButton);
	}
	
	@Then("verify the Personal Details text after login details")
	public void verify_the_Personal_Details_text_after_login_details() {
		String firstName = "Alyna";
		String middleName = "C";
		String lastName = "Yashanikovici";
		waitForVisibility(persDetails.progilePicText);
		Assert.assertEquals(persDetails.progilePicText.getText(), firstName + " " + middleName + " " + lastName);
	}
}