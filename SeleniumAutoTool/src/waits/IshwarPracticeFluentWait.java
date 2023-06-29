package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class IshwarPracticeFluentWait {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		FluentWait<WebDriver> wait =new FluentWait<WebDriver>(driver)
		  .pollingEvery(Duration.ofMillis(1000))
	        .withTimeout(Duration.ofSeconds(120));
		driver.findElement(By.xpath("//*[@id='hidden']")).click();
	}

}
