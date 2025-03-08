package GetOtherMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;

public class Methods {

	public static void main(String[] args)throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//navigate.to
		URL firsturl= new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		URL secondurl = new URL("https://demo.nopcommerce.com/register");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//to get url - get()
		//driver.get("https://demo.opencart.com/");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(firsturl);
		
		//get title
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get Currenturl
		System.out.println(driver.getCurrentUrl());
		
		//DOM html source page return
		System.out.println(driver.getPageSource());
		
		//to get window handle - ID of token or unique id which will randomly generate
		System.out.println(driver.getWindowHandle());
		//Thread.sleep(5000);
		
		
		//handles - another window
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> auth = driver.getWindowHandles();
		System.out.println(auth);
		
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		
		System.out.println(logo.isDisplayed());
		
		//body/div[6]/div[1]/div[2]/div/a/img
		
		WebElement sel = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		
		//sel.click();
		
		System.out.println(sel.isSelected());
		
		//150758
		
		driver.quit();
		
				

	}

}
