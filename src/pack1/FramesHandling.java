package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("iframe2");
		
		WebElement ele=driver.findElement(By.xpath(".//*[@id='post-9']/header/h1"));
		String str=ele.getText();
		System.out.println(str);
		driver.switchTo().defaultContent();
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='content']/p[4]"));
		String str1=element.getText();
		System.out.println(str1);
		
	}

}
