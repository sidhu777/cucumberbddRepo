package ShareData_PicocontainerSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {

	WebDriver driver;
	
	@Before
	public WebDriver setup() {
		if(driver==null) {
		System.out.println("in before1");
		System.setProperty("webdriver.chrome.driver", "D:\\Oxyzen\\Browser\\driver\\chromedriver2.39.exe");
		driver = new ChromeDriver();
	}
	return driver;
}
	
	
	
	
	
	@After
	public void tearDown1()
	{
		/*driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
		Thread.sleep(5000);*/
		System.out.println("in after1");
		driver.quit();
		driver=null;
	}
	
}
