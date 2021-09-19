package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	
	CarsSearchPageActions carsSearchPageActions=new CarsSearchPageActions();
	
	@Given("^User is on home page of \"([^\"]*)\" Cars Guide Website$")
	public void user_is_on_home_page_of_cars_guide_website(String webSiteURL) {

		
		SeleniumDriver.openPage(webSiteURL);
	}

	@When("^User navigate to the menu$")
	public void user_navigate_to_the_menu(List<String> list) throws InterruptedException {
		
		
		String actualTitle=SeleniumDriver.getDriver().getTitle();
		
		System.out.println(actualTitle);
		String menu=list.get(1);
		
		System.out.println(menu);
		carsGuideHomePageActions.moveToBuySellMenu();
	    
	}

	@And("User clicks on \"([^\"]*)\" link$")
	public void user_clicks_on_link(String searchCars) throws InterruptedException {
	   
		
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^Selects make as \"([^\"]*)\" from the dropdown$")
	public void selects_make_as_from_the_dropdown(String make) {
		carsSearchPageActions.selectCarMake(make);
	    
	}

	@And("^Selects model as \"([^\"]*)\" from the dropdown$")
	public void selects_model_as_from_the_dropdown(String model) {
		
		carsSearchPageActions.selectCarModel(model);
	   
	}

	@And("^Selects location as \"([^\"]*)\" from the dropdown$")
	public void selects_location_as_from_the_dropdown(String loc) {
		
		carsSearchPageActions.selectCarLocation(loc);
	   
	}

	@And("^Selects price max as \"([^\"]*)\"$")
	public void selects_price_max_as(String price) {
		
		carsSearchPageActions.selectCarPrice(price);
	   
	}

	@And("^Click on \"([^\"]*)\" button$")
	public void click_on_button(String string) {
		carsSearchPageActions.clickOnFindMyNextCarButton();
	    
	}
	
	@Then("^Validate the page title as \"([^\"]*)\"$")
	public void validate_the_page_title_as(String expectedTitle) {
		
		String actualTitle=SeleniumDriver.getDriver().getTitle();
		
		System.out.println(actualTitle);

	}


	@And("^validate the list of search cars in the result page$")
	public void validate_the_list_of_search_cars_in_the_result_page() {
	   
	}

}
