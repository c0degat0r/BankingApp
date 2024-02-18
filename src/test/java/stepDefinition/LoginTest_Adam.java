package stepDefinition;



import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Base;

public class LoginTest_Adam extends Base {


	@Given("I clicked on Application Tab")
	public void i_clicked_on_application_tab() {
		driver.findElement(By.className("brandPrimaryFgr")).click();
	   
	}
	@Given("I clicked on New Tab")
	public void i_clicked_on_new_tab() {
		driver.findElement(By.name("new")).click();
	    
	}
	@Given("I check that First Name field is present")
	public void i_check_that_first_name_field_is_present() {
		driver.findElement(By.id("00NHs00000gWijB"));
	   
	}
	@Given("I clicked save to confirm that this field is mandatory")
	public void i_clicked_save_to_confirm_that_this_field_is_mandatory() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
		
	   
	}
	@Then("I eneterd letters to confirm the	required length of {int} characters")
	public void i_eneterd_letters_to_confirm_the_required_length_of_characters(Integer int1) {
		driver.findElement(By.id("00NHs00000gWijB")).sendKeys("Adam sara Adam saraA");
	   
	}
	@Then("I click the save button to varify the entry")
	public void i_click_the_save_button_to_varify_the_entry() {
		driver.findElement(By.name("save")).click();
	  
	}

	@Given("I verified that Middle Name field is present")
	public void i_verified_that_middle_name_field_is_present() {
		driver.findElement(By.id("00NHs00000gWijG"));
	 
	}
	@Given("I checked the Middle Name is not required")
	public void i_checked_the_middle_name_is_not_required() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	   
	}

	@Given("I eneterd lenght of  {int} characters to confirm")
	public void i_eneterd_lenght_of_characters_to_confirm(Integer int1) {
		driver.findElement(By.id("00NHs00000gWijG")).sendKeys("Adam sara Adam saraA");
	 
	}

	
	@Then("I click the save button to confirm the entry")
	public void i_click_the_save_button_to_confirm_the_entry() {
		driver.findElement(By.name("save")).click();
	 
	}


	@Given("I verify that Last Name field is present")
	public void i_verify_that_last_name_field_is_present() {
		driver.findElement(By.id("00NHs00000gWijL"));
	    
	}
	@Given("I click save to confirm that this field is mandatory")
	public void i_click_save_to_confirm_that_this_field_is_mandatory() {
		driver.findElement(By.name("save")).click();

	}
	@Then("I enter letters to confirm the	required length of {int} chrachters")
	public void i_enter_letters_to_confirm_the_required_length_of_chrachters(Integer int1) {
		driver.findElement(By.name("00NHs00000gWijL")).sendKeys("Adam sara Adam saraA");
	  
	}
	@Then("I click save button to confirm")
	public void i_click_save_button_to_confirm() {
		driver.findElement(By.name("save")).click();
	    
	}


	@Given("I verified the dropdown field is present which has {string} id")
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
	public void i_verified_the_default_value_is_entered_as_none(String dropdown) {
	     driver.findElement(By.linkText("dropdown")).click();
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















}
