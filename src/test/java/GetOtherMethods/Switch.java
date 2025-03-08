package GetOtherMethods;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Switch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//URL myurl = new URL("https://letcode.in/windows");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		System.out.println(driver.getCurrentUrl());
		List<String> swit = new ArrayList<String>(handles);
		driver.switchTo().window(swit.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(swit.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		Thread.sleep(5000);
		
		
		
		
		driver.quit();
		

	}

}
