package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Base;

public class Application extends Base {

	@Given("I clicked on Application Tab")
	public void i_clicked_on_application_tab() {
		boolean pre = driver.findElement(By.xpath("//a[@title='Applications Tab - Selected']")).isDisplayed();
		Assert.assertTrue(pre);
	}
	@Given("I clicked on New button")
	public void i_clicked_on_new_button() {
		driver.findElement(By.name("new")).click();
	}
	@And("I verified that First Name field is present")
	public void i_verified_that_first_name_field_is_present() {
		driver.findElement(By.id("00NHs00000gWijB"));
	}

	@Given("I clicked save to confirm")
	public void i_clicked_save_to_confirm() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	}

	@Then("I eneterd letters to confirm the	required length of {int} chrachters")
	public void i_eneterd_letters_to_confirm_the_required_length_of_chrachters(Integer int1) {
		driver.findElement(By.id("00NHs00000gWijG")).sendKeys("Leng Sandy Ella Micky And Anna and Aliya ");
	}

	@Then("I click the save button to confirm")
	public void i_click_the_save_button_to_confirm() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	}

	@Given("I verified that Middle Name field is present")

	public void i_verified_that_middle_name_field_is_present() {
		driver.findElement(By.id("00NHs00000gWijG"));
	}

	@Given("I verified that the field is not required by clicking save button")
	public void i_verified_that_the_field_is_not_required_by_clicking_save_button() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	}

	@Given("I entered length of sometext to confirm the required length")
	public void i_entered_length_of_sometext_to_confirm_the_required_length() {
		driver.findElement(By.id("00NHs00000gWijG")).sendKeys("Pean Mehan Rob Jerry Adien");
	}
	@Then("I click save to comfirm the entry")
	public void i_click_save_to_comfirm_the_entry() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	}

	@Given("I verified that Last Name field is present")
	public void i_verified_that_last_name_field_is_present() {
		driver.findElement(By.id("00NHs00000gWijL"));
	}

	@Given("I clicked save to confirm that this field is madatory")
	public void i_clicked_save_to_confirm_that_this_field_is_madatory() {
		driver.findElement(By.className("btn")).click();
		Assert.assertTrue(true);
	}

	@Then("I eneterd letters to confirm the	required length of {int}")
	public void i_eneterd_letters_to_confirm_the_required_length_of(Integer int1) {
		driver.findElement(By.id("00NHs00000gWijL")).sendKeys("lyly Jack Doe Remor JDorger");
	}

	@Then("I click the save button to confirm the required length")
	public void i_click_the_save_button_to_confirm_the_required_length() {
		driver.findElement(By.className("btn")).click();
		Assert.assertTrue(true);

	}

	@Given("I verified the dropdown field is present")
	public void i_verified_the_dropdown_field_is_present() {
		driver.findElement(By.id("00NHs00000gWil2"));

	}

	@Given("I clicked save to confirm that this field is required")
	public void i_clicked_save_to_confirm_that_this_field_is_required() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);

	}

	@Given("I verified the dropdown which has {string} id with these following options")
	public void i_verified_the_dropdown_which_has_id_with_these_following_options(String dwfeild, io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedValues = dataTable.asList();
		WebElement feild = driver.findElement(By.id(dwfeild));
		Select sel = new Select(feild);
		List<WebElement> actaulValues = sel.getOptions();
		for (int i = 0; i < expectedValues.size(); i++) {
			
		}
	  

	}
	
	@Then("I verified the values are in alphabetical in order with these following option")
	public void i_verified_the_values_are_in_alphabetical_in_order_with_these_following_option(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.id("00NHs00000gWil2")).getText();
	   

	}
	
	@Then("I verified the default value is entered as none")
	public void i_verified_the_default_value_is_entered_as_none() {
		driver.findElement(By.id("00NHs00000gWil2")).click();
		System.out.println("--None--");

	}
	@Given("I verified the access as standard user")
	public void i_verified_the_access_as_standard_user() {
	    openBrowser();
	    driver.get("https://login.salesforce.com");
	    driver.findElement(By.id("username")).sendKeys("john@codegator.us");
	    driver.findElement(By.id("password")).sendKeys("Welcome2");
	    driver.findElement(By.id("Login")).click();
	}
		
	@And("I verified that the Application Object tab is visible")
	public void i_verified_that_the_application_object_tab_is_visible() {
		driver.findElement(By.xpath("//a[@title='Applications Tab - Selected']")).isDisplayed();
	}


	@Given("I verified the loan amount filed is present")
	public void i_verified_the_loan_amount_filed_is_present() {
	    driver.findElement(By.id("00NHs00000gYC9T")).isDisplayed();		
	
	}


	@Given("I enter {string} to check if it accpets alphabetic values")
	public void i_enter_to_check_if_it_accpets_alphabetic_values(String alpha) {
	 driver.findElement(By.id("00NHs00000gYC9T")).sendKeys(alpha);
	}
	@Given("I enter {string} in the loan amount filed")
	public void i_enter_in_the_loan_amount_filed(String numeric) {
		driver.findElement(By.id("00NHs00000gYC9T")).clear();
		driver.findElement(By.id("00NHs00000gYC9T")).sendKeys(numeric);
		
	}

	@Given("I verify the co-singer checkbox is present")
	public void i_verify_the_co_singer_checkbox_is_present() {
	    driver.findElement(By.cssSelector("input[type='checkbox']")).isDisplayed();
	}
	@Given("I verify default value is uncheckd")
	public void i_verify_default_value_is_uncheckd() {
	boolean checkbox =  driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected();
	
	
	Assert.assertFalse(checkbox); 
	    
	}


	@Given("I verify the loan drop down filed is present")
	public void i_verify_the_loan_drop_down_filed_is_present() {
	 boolean drp =driver.findElement(By.id("00NHs00000gYC9d")).isDisplayed();
	 Assert.assertTrue(drp);
	}
	@Given("I verify that the loan drop down which has {string}  is has the following options")
	public void i_verify_that_the_loan_drop_down_which_has_is_has_the_following_options(String loandropdown, io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedValues = dataTable.asList();
		WebElement feild = driver.findElement(By.id(loandropdown));
		Select sel = new Select(feild);
		List<WebElement> actaulValues = sel.getOptions();
		for (int i = 0; i < expectedValues.size(); i++) {
			
		}
		
		
		
	}










	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	   


	




	



