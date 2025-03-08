package RT_letcode;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TC1 {
	WebDriver driver;
	@BeforeTest
	void bt()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/");
	}
	//a[@class="navbar-item"]/img
	@BeforeMethod
	void bm()
	{
		driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/div[1]/a[1]/img")).click();
	}
	@Test(priority = 1,groups= {"Testcase1"})
	void test1()
	{
		driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/div[2]/div[1]/a[1]")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[1]/div/h1")).getText());
	}
	@Test(priority = 2,groups= {"Testcase1"})
	void test2()
	{
		driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/div[2]/div[1]/a[2]")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/app-root/app-main/section/div/h1")).getText());
	}
	@AfterTest
	void at()
	{
		driver.quit();
	}
	
	
}
