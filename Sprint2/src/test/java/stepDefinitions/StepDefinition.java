package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PagePackage.BuyPage;
import PagePackage.CategoryPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	BuyPage BP;
	CategoryPage CP;
	private String URL="https://www.ebay.com/";
	
	@Before
	public void driverSetup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surakris\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		System.out.println("Driver started");
	}
	
	@After
	public void driverClose() {
		driver.close();
		System.out.println("Driver ended");
	}
	
	@Given("^user is in home page$")
    public void user_is_in_home_page() throws Throwable {
        BP=new BuyPage(driver);
        driver.get(URL);
        Thread.sleep(500);
    }

    @When("^user clicks on buy option$")
    public void user_clicks_on_buy_option() throws Throwable {
    	BP=new BuyPage(driver);
    	BP.getBuyPage().click();
    	Thread.sleep(500);
    	BP.checkBuy();
    	Thread.sleep(500);
    }

    @Then("^user selects the category$")
    public void user_selects_the_category() throws Throwable {
    	CP=new CategoryPage(driver);
    	CP.getCategoryPage().click();
    	Thread.sleep(500);
    	CP.checkCategory();
    }
}
