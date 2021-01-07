package MultiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {

WebDriver driver = null;
	
	@Given("^User need to be on a Google Page$")
	public void User_need_to_be_on_a_Google_Page ( ) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Oxyzen\\Browser\\driver\\chromedriver2.39.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		}
	
	
	@When("^User enters search string$")
	public void User_enters_search_string() throws Exception {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("apple iphone ");
		Thread.sleep(3000);
	}

	
}
