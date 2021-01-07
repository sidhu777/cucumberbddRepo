package ShareData_PicocontainerSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareData_PicocontainerStep1 {
	
	WebDriver driver ;
	

	// create a constructor 
	public ShareData_PicocontainerStep1(SharedClass share) {
		
		driver = share.setup();
		
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


}
