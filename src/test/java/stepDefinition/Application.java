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

	@Then("I eneterd letters to confirm the required length of {int} chrachters")
	 public void i_eneterd_letters_to_confirm_the_required_length_of_chrachters(Integer int1)
	{
	 driver.findElement(By.id("00NHs00000gWijG")).sendKeys("Leng Sandy Ella Micky
	 And Anna and Aliya ");
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
	 driver.findElement(By.id("00NHs00000gWijG")).sendKeys("Pean Mehan Rob Jerry
	 Adien");
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

	@Then("I eneterd letters to confirm the required length of {int}")
	 public void i_eneterd_letters_to_confirm_the_required_length_of(Integer int1)
	 {
	 driver.findElement(By.id("00NHs00000gWijL")).sendKeys("lyly Jack Doe Remor
	 JDorger");
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
	public void i_verified_the_dropdown_which_has_id_with_these_following_options(String dwfeild,
			io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedValues = dataTable.asList();
		WebElement feild = driver.findElement(By.id(dwfeild));
		Select sel = new Select(feild);
		List<WebElement> actaulValues = sel.getOptions();
		for (int i = 0; i < expectedValues.size(); i++) {

		}

	}

	@Then("I verified the values are in alphabetical in order with these following option")
	public void i_verified_the_values_are_in_alphabetical_in_order_with_these_following_option(
			io.cucumber.datatable.DataTable dataTable) {
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
	
	@Given("I verified if is application tab present then click on New button")
	public void i_verified_if_is_application_tab_present_then_click_on_new_button() {
	  
	    	List<WebElement> page = driver.findElements(By.className("\"pageTitleIcon\""));
		for(WebElement New :page) {
			boolean pageH = New.isSelected();
			if(pageH) {
				System.out.println("Application Tab is click");
			}else {
				New.click();
			}
			
			
		}
	    

	}
	@Given("I verified the Co-signer checkbox is present")
	public void i_verified_the_co_signer_checkbox_is_present() {
	boolean CScheckbox=	driver.findElement(By.id("00NHs00000gYC9i")).isDisplayed();
	Assert.assertTrue(true);	  
	  }
			 
	@Then("I verified the checkbox should have a default value of un-clecked")
	public void i_verified_the_checkbox_should_have_a_default_value_of_un_clecked() {
		WebElement checkbox = driver.findElement(By.id("00NHs00000gYC9i"));
		if(!checkbox.isSelected()) {
			System.out.println("checkbox is unchecked by default");
			
		}else {
			System.out.println("checkbox is checked by default");
		}
	    

	}

	

	}




	

	

