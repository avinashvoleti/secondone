package secondone.secondone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Ecilipse\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rythmos.com/contact-us");
      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("avinash");
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("voleti");
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("avinash.voleti@gmail.com");
      driver.findElement(By.xpath("//input[@value='Go']")).click();
	}
      
	}