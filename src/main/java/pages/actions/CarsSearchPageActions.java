package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {

	CarSearchPageLocators carSearchPageLocators = null;

	public CarsSearchPageActions() {

		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);

	}

	public void selectCarMake(String make) {

		Select select = new Select(carSearchPageLocators.carMakeDropDown);
		select.selectByVisibleText("BMW");
	}

	public void selectCarModel(String model) {

		Select select = new Select(carSearchPageLocators.carMakeDropDown);
		select.selectByVisibleText("1 Series");
	}

	public void selectCarLocation(String location) {

		Select select = new Select(carSearchPageLocators.carLocationDropDown);
		select.selectByVisibleText("Any Location");
	}

	public void selectCarPrice(String price) {

		Select select = new Select(carSearchPageLocators.carMaxPriceDropDown);
		select.selectByVisibleText("$200,000");
	}
	
	public void clickOnFindMyNextCarButton() {

		carSearchPageLocators.findMyNextCarButton.click();
	}

}
