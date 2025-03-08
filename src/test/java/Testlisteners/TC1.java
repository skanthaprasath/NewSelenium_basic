package Testlisteners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.*;

public class TC1 implements ITestListener {
	WebDriver driver;
	@BeforeTest
	void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.automationexercise.com/");
	}
	
	@Test
	void Testcase1()
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		//*[@id="form"]/div/div/div[1]/div[1]/form/input[2]
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[2]")).sendKeys("skantha@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[3]")).sendKeys("qwer");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button")).click();
	}
	@Test
	void Testcase2()
	{
		String s = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")).getText();
		Assert.assertEquals(s,"Logged in as skantha");
		System.out.println("passed");
	}
	
	@AfterTest
	void closing()
	{
		driver.quit();
	}
	

}
