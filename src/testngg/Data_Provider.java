package testngg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	public WebDriver driver;
	@Test(dataProvider="getdata")
	public void login(String username,String password) throws InterruptedException
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
	@DataProvider
	public Object [][] getdata()
	{
		Object [][] data=new Object[3][2];
		data[0][0]="pqrs9747@gmail.com";
		data[0][1]="ram.krishna@";
		
		data[1][0]="crk801@gmail.com";
		data[1][1]="ram.krishna";
		
		data[2][0]="crk468@gmail.com";
		data[2][1]="ram.krishna@468";
		return data;
		
	}

}
