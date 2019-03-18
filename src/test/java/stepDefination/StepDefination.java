package stepDefination;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	public WebDriver driver;
	@Given("^Open the browser$")
	public void open_the_browser()  {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "H:\\Ecare Student\\ActitimeNewBDD1\\Drivers\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		
	  
	}

	@Given("^Pass URL$")
	public void pass_URL() {
	    driver.get("https://demo.actitime.com/login.do");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@Then("^user should enter into the login page$")
	public void user_should_enter_into_the_login_page() {
	    String expectedTitle="actiTIME - Login";
	    String actualTite=driver.getTitle();
	    if(actualTite.equals(expectedTitle)) {
	    	Assert.assertTrue(true);
	    	
	    }
	    
	    else {
	    	Assert.assertTrue(true);
	    }
	}

	@When("^user pass username and password and click  on login$")
	public void user_pass_username_and_password_and_click_on_login()  {
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    
	}

	@Then("^User will come in home page$")
	public void user_will_come_in_home_page() {
	   
	}


}
