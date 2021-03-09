package ttdrugsStepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ttdrugsPageActions.CompareDrugsActions;
import ttdrugsPageActions.DrugsHomePageActions;

public class CompareDrugsStepDef {
	
	DrugsHomePageActions DrugsHomePageActionsObj = new DrugsHomePageActions();
	CompareDrugsActions CompareDrugsActionsObj = new CompareDrugsActions();

	@When("^clicks on Compare Drugs$")
	public void clicks_on_Compare_Drugs() throws Throwable {
		System.out.println("clicks on Compare Drugs");
		DrugsHomePageActionsObj.equals(CompareDrugsActionsObj);
	}


	@When("^user should land on compare Drugs page$")
	public void user_should_land_on_compare_Drugs_page() throws Throwable  {
		System.out.println("user should land on compare Drugs page");
		DrugsHomePageActionsObj.equals(CompareDrugsActionsObj);
	} 
	    
	

	@When("^user clicks on Claritin vs Zyrtec$")
	public void user_clicks_on_Claritin_vs_Zyrtec()throws Throwable  {
	System.out.println("user clicks on Claritin vs Zyrtec");
	DrugsHomePageActionsObj.equals(CompareDrugsActionsObj);

	}
	
	@Then("^user should be able to see the compare between Claritin vs Zyrtec$")
	public void user_should_be_able_to_see_the_compare_between_Claritin_vs_Zyrtec() throws Throwable {
		System.out.println("user should be able to see the compare between Claritin vs Zyrtec");
		DrugsHomePageActionsObj.equals(CompareDrugsActionsObj);
	}


}
