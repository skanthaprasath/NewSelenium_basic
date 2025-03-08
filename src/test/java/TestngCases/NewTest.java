package TestngCases;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
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
  @Test(priority=3)
  public void check() throws InterruptedException {
	//input[@name='username']
	  //Thread.sleep(5000);
	  String head = driver.findElement(By.xpath(" //*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	  System.out.println(head);
	  Thread.sleep(5000);
	  if(head == "Dashboard")
	  {
		  System.out.println("Logged in to the dashboard success...");
	  }
	
  }
  @Test(priority=4)
  public void logout() {
	  
	  driver.quit();
	}
  
}
