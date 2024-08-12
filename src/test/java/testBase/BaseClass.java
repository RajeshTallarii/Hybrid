package testBase;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	 public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\RTALLARI\\Downloads\\chromedriver-win64\\chromedrive.exe");		
		//driver= new EdgeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.saucedemo.com");
		//driver.manage().deleteAllCookies();
		
		
		
		
		//driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();;
	}
	

	
}

