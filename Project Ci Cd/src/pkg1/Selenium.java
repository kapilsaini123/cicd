package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium
{
	ChromeDriver driver;
	@Test
	public void OpenBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","../Project Ci Cd/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement video=driver.findElement(By.id("video-title"));
		video.click();
	
	}
}
