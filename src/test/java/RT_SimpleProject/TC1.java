package RT_SimpleProject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import Utility.readmethod;

public class TC1 {
	WebDriver driver;
	@BeforeTest
	void launch() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationexercise.com");
		String titletext = driver.getTitle();
		System.out.println(titletext);
	}
	@Test(priority = 0)
	void login() throws IOException{
		POM_class pm=new POM_class(driver);
		String username = readmethod.uti("sheet1", 3, 0);
		String pass = readmethod.uti("sheet1", 3, 1);
		pm.homepage(username,pass);
	}
	
	@Test(priority = 1)
	void sectselct() throws InterruptedException
	{
		POM2 p2 = new POM2(driver);
		p2.selct();
		p2.hovr();
	}
	
	@Test(priority = 2)
	void carti()
	{
		POM3 p3 = new POM3(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		p3.cartselct();
	}
	
	@AfterTest
	void exit()
	{
		driver.quit();
	}
	

}
