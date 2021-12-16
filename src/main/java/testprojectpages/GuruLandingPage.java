package testprojectpages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GuruLandingPage {
	
	WebDriver driver;
	
	By jmeterImg= By.xpath("//img[@src='Jmeter720.png']");
	By frame=By.xpath("//iframe[@id='a077aa5e']");
	
	public GuruLandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//handle frames
	////h2[text()='Top Tutorials']

	public void switchToFrame()
	{
		driver.switchTo().frame(driver.findElement(frame));
	}
	
	
	public void clickImg()
	{
		driver.findElement(jmeterImg).click();
		
	}
	
	
	public void switchToWindow()
	{
		String windowHandle=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		for(String handle:handles)
		{
			if(!windowHandle.equals(handles))
			{
				driver.switchTo().window(handle);
			}
		}
		
		
	}
	

}
