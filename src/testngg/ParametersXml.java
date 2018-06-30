package testngg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersXml {
	
	public WebDriver driver;
	@Test
	@Parameters({"username","password"})
	public void test(String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
		 // driver.manage().window().maximize();
		  
		  driver.get("http://www.gmail.com");
		  driver.findElement(By.id("identifierId")).sendKeys(username);
		  driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")).click();
	}

}
