package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class A {
	
	public void m1(String browser)
	{
		switch(browser)
		{
		case "ff":
			System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Drivers\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://docs.seleniumhq.org/");
			break;
			
		case "gc":
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Drivers\\chromedriver.exe");
			WebDriver drivergc=new ChromeDriver();
			drivergc.manage().window().maximize();
			drivergc.get("http://docs.seleniumhq.org/");
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "D:\\Softwares\\Drivers\\IEDriverServer.exe");
			WebDriver driverie=new InternetExplorerDriver();
			driverie.manage().window().maximize();
			driverie.get("http://docs.seleniumhq.org/");
			break;
		}
	}
	public static void main(String[] args) {
		new A().m1("ff");
	}

}
