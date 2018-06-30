package sele;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div[1]/div/div/h3/a")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div[2]/div/div/h3/a")).click();
		
		driver.close();
	}

}
