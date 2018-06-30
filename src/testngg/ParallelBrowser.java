package testngg;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowser {
	
	public WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void openBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get("http://www.dolistore.com/");
	}
	@Test
	@Parameters({"username","password"})
	public void login(String username,String password) throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email")).sendKeys("pqrs9747@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("passwd")).sendKeys("ram.krishna@");
		Thread.sleep(3000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(3000);
		
	}
	

}
