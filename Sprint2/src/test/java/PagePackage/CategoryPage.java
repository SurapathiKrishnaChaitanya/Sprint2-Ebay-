package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {

	WebDriver driver;
	boolean result;
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div[1]/ul/li[5]/a")
	@CacheLookup
	WebElement Category;
	
	@FindBy(xpath="//*[@id=\"collectibles-and-art\"]/a/h2")
	@CacheLookup
	WebElement checkCategory;
	
	public CategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCategoryPage() {
		return Category;
	}
	
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	public void checkCategory() {
		result=checkCategory.isDisplayed();
		if(result)
		{
			System.out.println("category is selected");
		}
		else
		{
			System.out.println("category is not selected");
		}
	}
	
}
