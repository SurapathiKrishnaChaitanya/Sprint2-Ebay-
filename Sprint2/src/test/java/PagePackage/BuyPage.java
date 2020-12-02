package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPage {
	
	WebDriver driver;
	boolean result;
	
	@FindBy(xpath="//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[1]/h3/a")
	@CacheLookup
	WebElement Buy;
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div[1]/h1")
	@CacheLookup
	WebElement check;
	
	public BuyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getBuyPage() {
		return Buy;
	}
	
	public void checkBuy()
	{
		result=check.isDisplayed();
		if(result)
		{
			System.out.println("Buy option is selected");
		}
		else
		{
			System.out.println("Buy option is not selected");
		}
	}
	
}
