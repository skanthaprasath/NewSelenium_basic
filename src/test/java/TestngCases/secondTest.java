package TestngCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class secondTest {
	WebDriver driver;
	  @Test(priority=1)
	  public void launch() {
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
	  }
	  @Test(priority=2)
	  public void login() {
		//input[@name='username']
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	  }

}
