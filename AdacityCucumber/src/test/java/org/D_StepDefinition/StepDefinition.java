package org.D_StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.A_PraveenBaseClass.BaseClass;
import org.B_Locators.A_LoginPageLocators;
import org.B_Locators.B_SearchHotelLocators;
import org.B_Locators.C_RadioButtonLocators;
import org.B_Locators.D_BookPage;
import org.C_Execution.B_SearchHotelPageExe;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends B_SearchHotelPageExe {
	
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
	    BaseClass.browser();
	    
	}

	@Given("Passing Url")
	public void passing_url() {
	    BaseClass.url("https://adactinhotelapp.com/");
	
	    
	}

//	@When("Entering Username")
//	public void entering_username(DataTable dataTable) {
//	   List<List<String>> asLists = dataTable.asLists();
//	  for(int i=0 ;i<100;i++ ) {
//	   BaseClass.typeData(BaseClass.findElementid(LoginPageLocators.username), asLists.get(i).get(0));
//	    
//	}}
//
//	@When("Entering Password")
//	public void entering_password(DataTable dataTable) {
//		List<List<String>> asLists = dataTable.asLists();
//		  for(int i=0 ;i<100;i++ ) {
//		   BaseClass.typeData(BaseClass.findElementid(LoginPageLocators.username), asLists.get(i).get(1));
//		    
//		}}
	
	
//	@When("Entering Username and Entering Password")
//	
//	public void entering_username_and_entering_password(DataTable dataTable) {
//	    
//		List<List<String>> asLists = dataTable.asLists();
//		for(int i=0 ;i<100;i++ ) {
//		   BaseClass.typeData(BaseClass.findElementid(LoginPageLocators.username), asLists.get(i).get(0));
//		  
//		   BaseClass.typeData(BaseClass.findElementid(LoginPageLocators.password), asLists.get(i).get(1));
//		    
//		   loginButton();
//	
//	}}
	
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

		
	@When("Entering Username {string}")
	public void entering_username(String string) {
	    String title = driver.findElement(By.xpath("//td[@class='login_title']")).getText();
		 
	    Assert.assertEquals("Existing User Login - Build ", title );
//		 SoftAssert sa = new SoftAssert();
//		 sa.assertEquals("Existing User Login  Build 1", title );
		 
		BaseClass.typeData(BaseClass.findElementid(A_LoginPageLocators.username), string);
		
	}

	@When("Entering Password {string}")
	public void entering_password(String string) {
	   
		BaseClass.typeData(BaseClass.findElementid(A_LoginPageLocators.password),string);
		
	}
	
	@When("Clicking LoginButton")
	public void clicking_login_button() {
		
		loginButton();
		
	}
	

	@When("Select the Location {string}")
	public void select_the_location(String string) throws InterruptedException {
		Thread.sleep(5000);
		
		BaseClass.implicitylyWait(10, TimeUnit.SECONDS);
//		BaseClass.selectValue(BaseClass.findElementid(B_SearchHotelLocators.location),
//				string);
		WebElement loc = driver.findElement(By.xpath("//select[@name='location']"));
		loc.click();
		Select s = new Select(loc);
		s.selectByValue(string);
	}

	@When("Select the Hotel {string}")
	public void select_the_hotel(String string) {
	   
		BaseClass.selectValue(BaseClass.findElementid(B_SearchHotelLocators.hotels), string);
	}

	@When("Select the RoomType {string}")
	public void select_the_room_type(String string) {
		BaseClass.selectValue(BaseClass.findElementid(B_SearchHotelLocators.RoomType), string);
	    
	}

	@When("Select the NoOfRooms {string}")
	public void select_the_no_of_rooms(String string) {
	   
		BaseClass.selectValue(BaseClass.findElementid(B_SearchHotelLocators.NumberofRooms), string);
	}

	@When("Enter the CheckInDate {string}")
	public void enter_the_check_in_date(String string) {
	   
		BaseClass.clear(BaseClass.findElementid(B_SearchHotelLocators.CheckIn));
    	BaseClass.typeData(BaseClass.findElementid(B_SearchHotelLocators.CheckIn), string);
	}

	@When("Enter the CheckOutDate {string}")
	public void enter_the_check_out_date(String string) {
	   
		BaseClass.clear(BaseClass.findElementid(B_SearchHotelLocators.CheckOut));
    	BaseClass.typeData(BaseClass.findElementid(B_SearchHotelLocators.CheckOut), string);
	}

	@When("Select Adult per Room {string}")
	public void select_adult_per_room(String string) {
	   
		BaseClass.selectValue(BaseClass.findElementid(B_SearchHotelLocators.Adults), string);
	}

	@When("Select Child per Room {string}")
	public void select_child_per_room(String string) {
	   
		BaseClass.selectValue(BaseClass.findElementid(B_SearchHotelLocators.Children), string);
	}

	@Then("Click the SearchButton")
	public void click_the_search_button() {
	   
		BaseClass.click(BaseClass.findElementname(B_SearchHotelLocators.Search));
	}
	
	
	@When("Click the Radio button")
	public void click_the_radio_button() throws InterruptedException {
		
		Thread.sleep(3000);
		BaseClass.click(BaseClass.findElementid(C_RadioButtonLocators.RadioButton));
	}

	@When("Click Search button")
	public void click_search_button() {
		
		BaseClass.click(BaseClass.findElementname(C_RadioButtonLocators.RadioSearch));
	}
	
	
	@When("enter the FirstName {string}")
	public void enter_the_first_name(String string) {
	
		BaseClass.typeData(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.firstName), string );
	}

	@When("enter the LastName {string}")
	public void enter_the_last_name(String string) {
	  
		BaseClass.typeData(BaseClass.findElementid(D_BookPage.secName), string);
	}

	@When("enter the Address {string}")
	public void enter_the_address(String string) {
	   
		BaseClass.typeData(BaseClass.findElementid(D_BookPage.billing),string );
	}

	@When("enter the CreditCard Number {string}")
	public void enter_the_credit_card_number(String string) {
		
		BaseClass.typeData(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.card),string);
	}

	@When("Select CreditCard Type {string}")
	public void select_credit_card_type(String string) {
		
		BaseClass.selectValue(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.CardType),string);
	}

	@When("Select Expiry Date {string}")
	public void select_expiry_date(String string) {
		
		BaseClass.selectValue(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.month),string );
	}

	@When("Select Expiry Year {string}")
	public void select_expiry_year(String string) {
		
		BaseClass.selectValue(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.year), string);
	}

	@When("Enter Cvv Number {string}")
	public void enter_cvv_number(String string) {
		
		BaseClass.typeData(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.ccv), string);
	}
	
	@Then("Click SubmitButton")
	public void click_submit_button() {
		
		BaseClass.click(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.submit));
	}
	
//	@When("enter the FirstName")
//	public void enter_the_first_name(io.cucumber.datatable.DataTable dataTable) {
//	  
//	}
//
//	@When("enter the LastName")
//	public void enter_the_last_name(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("enter the Address")
//	public void enter_the_address(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("enter the CreditCard Number")
//	public void enter_the_credit_card_number(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Select CreditCard Type")
//	public void select_credit_card_type(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Select Expiry Date")
//	public void select_expiry_date(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Select Expiry Year")
//	public void select_expiry_year(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Enter Cvv Number")
//	public void enter_cvv_number(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	    throw new io.cucumber.java.PendingException();
//	}
	
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	
//	@When("Entering Username and Entering Password")
//	public void entering_username_and_entering_password(DataTable dataTable) {
//	   
//		List<Map<String,String>> asMaps = dataTable.asMaps();
//		
//		BaseClass.typeData(BaseClass.findElementid(A_LoginPageLocators.username), asMaps.get(0).get("Username"));
//		BaseClass.typeData(BaseClass.findElementid(A_LoginPageLocators.password), asMaps.get(0).get("Password"));
//	}
	

//	@When("Clicking LoginButton")
//	public void clicking_login_button() {
//		
//		loginButton();
//		
//	}	

	
	
	
	
	
	
	
	
	
	
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    
	    
	}

	

}
