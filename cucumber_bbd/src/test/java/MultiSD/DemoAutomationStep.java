package MultiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DemoAutomationStep {
	
	

WebDriver driver = null;
	
	@Given("^User need to be on a Demo Site Page$")
	public void User_need_to_be_on_a_Demo_Site_Page ( ) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Oxyzen\\Browser\\driver\\chromedriver2.39.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		}
	
	
	@When("^User enters First Name$")
	public void User_enters_First_Name() throws Exception {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Demo Automation ");
		Thread.sleep(3000);
	}


}
