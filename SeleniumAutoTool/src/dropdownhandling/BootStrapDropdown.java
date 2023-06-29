package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) 
	{
		// bootstrap dropdown for "Bsnl"
		
		////*[@tabindex='1']//*[@type='text']
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
		
		
		WebElement operator = driver.findElement(By.xpath("//*[@tabindex='1']//*[@type='text']"));
	
		operator.click();
			
//	driver.findElement(By.xpath("//*[@tabindex='1']//*[@type='text']")).click();
         // we can call also
		
		driver.findElement(By.xpath("//div[@class='_3xI1']//*[text()= 'BSNL']")).click();
		
		//
	}//

}
