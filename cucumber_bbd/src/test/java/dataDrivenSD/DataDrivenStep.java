package dataDrivenSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDrivenStep {
	
	WebDriver driver ;
	
	@Given("^User need to be on a Facebook Login Page$")
	public void User_need_to_be_on_a_Facebook_Login_Page ( ) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Oxyzen\\Browser\\driver\\chromedriver2.39.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		}
			
	
	/*@When("^User enters user\"([^\"]*)\"first name$")
	public void user_enters_user_first_name(String username) throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys(username);
			
	}*/
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String username) throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys(username);
	   
	}

	
	
	
	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() throws Throwable {
    String username_actual = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).getAttribute("value");
    System.out.println("getting attribute value as " + username_actual);
    Assert.assertEquals("sidhu", username_actual);
    Thread.sleep(3000);
	
	}
	
		
	@Then("^close browser$")
	public void close_browser() {
		driver.quit();
		driver = null;
	}

	
		@When("^User enters \"([^\"]*)\" password$")
	public void user_enters_password(String password) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		Thread.sleep(2000);
	}
	

	@When("^click on the Login$")
	public void click_on_the_Login() throws Throwable {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	}

	@Then("^Logout from the Account$")
	public void logout_from_the_Account() throws Throwable {
	  
		//driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}