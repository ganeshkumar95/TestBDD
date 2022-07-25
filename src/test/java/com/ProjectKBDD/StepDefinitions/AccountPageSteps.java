package com.ProjectKBDD.StepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.ProjectKBDD.factory.DriverFactory;
import com.ProjectKBDD.pages.AccountsPage;
import com.ProjectKBDD.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountsPage;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) throws InterruptedException {
	   List<Map<String, String>> credList = credTable.asMaps();
	   String username = credList.get(0).get("username");
	   String password = credList.get(0).get("password");
	   
	   DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	   accountsPage = loginPage.doLogin(username, password);
	}
	
	@Given("user is on Accounts page")
	public void user_is_on_accounts_page() {
		accountsPage.getAccountsPageTitle();
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable sectionsTable) {
		List<String> expectedAccountSectionsList = sectionsTable.asList();
		System.out.println("Expected Account Sections List :"+ expectedAccountSectionsList);
		
		List<String> actualAccountSectionsList = accountsPage.getAccountsSectionsList();
		System.out.println("Actual accounts section list: " + actualAccountSectionsList);
		
		Assert.assertTrue(expectedAccountSectionsList.containsAll(actualAccountSectionsList));
		
	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expectedSectionCount) {
	   Assert.assertTrue(accountsPage.getAccountsSectionCount() == expectedSectionCount);
	}
}
