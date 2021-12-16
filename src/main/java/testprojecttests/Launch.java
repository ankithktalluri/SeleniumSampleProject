package testprojecttests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testprojectpages.GuruLandingPage;

public class Launch {
	
	public WebDriver driver;
	GuruLandingPage landingpage;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void lanuch()
	{
		landingpage = new GuruLandingPage(driver);
		landingpage.switchToFrame();
		landingpage.clickImg();
		landingpage.switchToWindow();
		
	}
	@Test
	public void sample()
	{
		System.out.println("Sample output");
	}
	
}
