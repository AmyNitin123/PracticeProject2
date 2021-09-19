package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {

	
	@FindBy(how=How.XPATH,using="//a[normalize-space()='buy + sell']")
	public WebElement buySellLink;
	
	@FindBy(how=How.LINK_TEXT,using="reviews")
	public WebElement reviewsLink;
	
	@FindBy(how=How.LINK_TEXT,using="news")
	public WebElement newsLink;
	
	@FindBy(how=How.LINK_TEXT,using="advice")
	public WebElement adviceLink;
	
	@FindBy(how=How.LINK_TEXT,using="pricing + specs")
	public WebElement pricingSpecsLink;
	
	@FindBy(how=How.LINK_TEXT,using="Search Cars")
	public WebElement searchCarsLink;
}
