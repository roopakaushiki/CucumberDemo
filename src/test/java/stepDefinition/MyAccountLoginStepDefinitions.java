package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyAccountLoginStepDefinitions {


	public WebDriver driver = null;
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe/");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	    
	}

	@When("^Enter the url \"([^\"]*)\"$")
	public void enter_the_url(String url) throws Throwable {
	    
	   driver.get(url);
	}

	@When("^Click on My Account Menu$")
	public void click_on_My_Account_Menu() throws Throwable {
	    driver.findElement(By.xpath("//a[text()='My Account']")).click();
	}

	/*@When("^Enter registered username and password$")
	public void enter_registered_username_and_password() throws Throwable {
		//driver.findElement(By.xpath("//a[text()='My Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("pavanoltraining");
		driver.findElement(By.id("password")).sendKeys("Test@selenium123");
		   
	}*/
	
	
/*	@When("^Enter registered username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_registered_username_and_password(String user, String pwd) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
	}*/
	
	/*
	@When("^Enter registered username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
		
	List <List <String>>	data = credentials.raw();
	driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
	driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	   
	}*/
	
	//This method is for data table
	/*@When("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
		List <List <String>> data = credentials.raw();
		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}*/
	
	
	//Login with data table method using header
		@When("^Enter registered username and password$")
		public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
			List<Map<String,String>> data = credentials.asMaps(String.class, String.class);
			driver.findElement(By.id("username")).sendKeys(data.get(0).get("user"));
			driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
		}
	
	
	
@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@name='login']")).click();
	   
	}

	@Then("^User must successfully login to the web page$")
	public void user_must_successfully_login_to_the_web_page() throws Throwable {
		String text = driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/strong")).getText();
		//Thread.sleep(3000);
		Assert.assertEquals(true,text.contains("pavanoltraining"));
		driver.quit();
	    
	}
	
	
	//This is for invalid input
	@Then("^Verify login$")
	public void verify_login() throws Throwable {
	   String text=driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/ul")).getText();
		if(text.contains("ERROR")) //Test for invalid input
		{
			Assert.assertTrue("Invalid input - Error Page", true);
		}else {
			Assert.assertTrue(false);
		}
	}
	
	
}
