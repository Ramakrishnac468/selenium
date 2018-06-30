package webtables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cell_Value 
{				
	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement baseTable=driver.findElement(By.tagName("table"));
		
		WebElement tableRow=baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		
		String rowText=tableRow.getText();
		System.out.println(rowText);
		
		
		WebElement cell=tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		
		String valueNeed=cell.getText();
		System.out.println(valueNeed);
		
		driver.close();
	}

}
