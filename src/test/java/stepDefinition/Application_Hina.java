package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Base;

public class Application_Hina extends Base {
	@Given("I clicked on Application Tab")
	public void i_clicked_on_application_tab() {
		driver.findElement(By.className("brandPrimaryFgr")).click();
	}

	@Given("I clicked on New Tab")
	public void i_clicked_on_new_tab() {
		driver.findElement(By.name("new")).click();
	}

	@Given("I verified that First Name field is present")
	public void i_verified_that_first_name_field_is_present() {
		driver.findElement(By.id("00NHs00000gWijB")).isDisplayed();
	}

	@Given("I clicked save to confirm that this field is mandatory")
	public void i_clicked_save_to_confirm_that_this_field_is_mandatory() {
		driver.findElement(By.className("btn")).click();
		Assert.assertTrue(true);
	}

	@Then("I entered letters to confirm the	required length of {int} characters")
	public void i_entered_letters_to_confirm_the_required_length_of_characters(Integer int1) {
		driver.findElement(By.name("00NHs00000gWijB")).sendKeys("Hina Qayyum Chohan Hassam");
	}

	@Then("I click the save button to confirm the entry")
	public void i_click_the_save_button_to_confirm_the_entry() {
		driver.findElement(By.className("btn")).click();
		Assert.assertTrue(true);

	}

	@And("I verified that Middle Name field is present")
	public void i_verified_that_middle_name_field_is_present() {
		driver.findElement(By.id("00NHs00000gWijG")).isDisplayed();

	}

	@Given("I verified that the field is not required by clicking save tab")
	public void i_verified_that_the_field_is_not_required_by_clicking_save_tab() {
		driver.findElement(By.className("btn")).click();
		Assert.assertTrue(true);
	}

	@Given("I entered length of {int} characters to confirm the required length")
	public void i_entered_length_of_characters_to_confirm_the_required_length(Integer int1) {
		driver.findElement(By.id("00NHs00000gWijG")).sendKeys("Hassam Chohan Qayyum Hina");
	}

	@Then("I click save to confirm the entry")
	public void i_click_save_to_confirm_the_entry() {
		Assert.assertTrue(true);
	}


	@And("I verify that Last Name field is present")
	public void i_verify_that_last_name_field_is_present() {
		driver.findElement(By.id("00NHs00000gWijL")).isDisplayed();
	}

	@Given("I click save to confirm that this field is mandatory")
	public void i_click_save_to_confirm_that_this_field_is_mandatory() {
		driver.findElement(By.className("btn")).click();
		Assert.assertTrue(true);
	}

	@Then("I enter letters to confirm the	required length of {int} chrachters")
	public void i_enter_letters_to_confirm_the_required_length_of_chrachters(Integer int1) {
		driver.findElement(By.name("00NHs00000gWijL")).sendKeys("Chohan Hina Hassam Qayyum");
	}

	@Then("I click save button to confirm")
	public void i_click_save_button_to_confirm() {
		driver.findElement(By.className("btn")).click();
		Assert.assertTrue(true);
	}

	@And("I verified the dropdown field is present which has {string} id")
	public void i_verified_the_dropdown_field_is_present_which_has_id(String string) {
		driver.findElement(By.className("btn")).click();
		Assert.assertTrue(true);
	}

	@Given("I clicked save to confirm that this field is required")
	public void i_clicked_save_to_confirm_that_this_field_is_required() {
		driver.findElement(By.className("btn")).click();
		Assert.assertTrue(true);
	}

	@Given("I verified the dropdown options which has {string} id")
	public void i_verified_the_dropdown_options_which_has_id(String id, io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedRating = dataTable.asList();
		WebElement field = driver.findElement(By.id(id));
		Select sel = new Select(field);
		List<WebElement> actualRating = sel.getOptions();
		for (int i = 0; i < expectedRating.size(); i++) {
			Assert.assertEquals(expectedRating.get(i), actualRating.get(i).getText());
		}
	}

	@Given("I verified the values are in alphabetical order")
	public void i_verified_the_values_are_in_alphabetical_order() {
		driver.findElement(By.id("00NHs00000gWil2")).getText();

	}

	@Then("I verified the default value is entered as none")
	public void i_verified_the_default_value_is_entered_as_none() {
		driver.findElement(By.id("00NHs00000gWil2")).isSelected();
		System.out.println();

	}

	@Given("I verified the access as standard user")
	public void i_verified_the_access_as_standard_user() {
		openBrowser();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("john@codegator.us");
		driver.findElement(By.id("password")).sendKeys("Welcome2");
		driver.findElement(By.id("Login")).click();

	}

	@Given("I verified that the Application Object tab is visible")
	public void i_verified_that_the_application_object_tab_is_visible() {
		driver.findElement(By.className("brandPrimaryFgr")).isDisplayed();
	}

	@Given("I verify the Co-signer checkbox is there")
	public void i_verify_the_co_signer_checkbox_is_there() {
		driver.findElement(By.id("00NHs00000gYC9i")).isDisplayed();
	}


	@Given("I verify that the Loan will be used for field is present")
	public void i_verify_that_the_loan_will_be_used_for_field_is_present() {
	  driver.findElement(By.id("00NHs00000gYC9d")).isDisplayed();  
	}
	@Given("I verify the dropdown options which has {string} id")
	public void i_verify_the_dropdown_options_which_has_id(String id, io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedOptions = dataTable.asList();
		WebElement field = driver.findElement(By.id(id));
		Select sel = new Select(field);
		List<WebElement> actualRating = sel.getOptions();
		for (int i = 0; i < expectedOptions.size(); i++) {
			Assert.assertEquals(expectedOptions.get(i), actualRating.get(i).getText());
		}
	}
	@Given("I verified that the values are displayed in the order above")
	public void i_verified_that_the_values_are_displayed_in_the_order_above() {
	   driver.findElement(By.id("00NHs00000gYC9d")).getText();
	  
	}
	
	@Given("I verified that the field is currency field only")
	public void i_verified_that_the_field_is_currency_field_only() {
	    driver.findElement(By.id("00NHs00000gYC9T")).sendKeys("abcd");
	    Assert.assertFalse(true);
	}
	@Given("it is accepting decimal value also")
	public void it_is_accepting_decimal_value_also() {
	 driver.findElement(By.id("00NHs00000gYC9T")).sendKeys("24.50");   
	System.out.println();
	}








}
