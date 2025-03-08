package dataprovider;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@Test(dataProvider = "log1")
	void dat(String user,String pwd) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		//navigate.to
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		 
	}
	
	@DataProvider(name ="log1")
	Object[][] credlogin() {
		Object data[][] = {		
								{"qwer","jsjs"},
								{"Admin","admin123"},
						  };
		return data;
	}
	

}
