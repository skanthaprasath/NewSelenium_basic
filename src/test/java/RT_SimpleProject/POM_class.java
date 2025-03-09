package RT_SimpleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_class {
	WebDriver driver;
	POM_class(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loc() {
		By singin = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
		driver.findElement(singin).click();
			}
	
	@FindBy(xpath="//*[@id='form']/div/div/div[1]/div[1]/form/input[2]") WebElement username;
	@FindBy(xpath="//*[@id='form']/div/div/div[1]/div[1]/form/input[3]") WebElement password;
	@FindBy(xpath="//*[@id=\'form\']/div/div/div[1]/div[1]/form/button") WebElement buttonin;
	
	void homepage(String user,String pass)
	{
		loc();
		username.sendKeys(user);
		password.sendKeys(pass);
		buttonin.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);"); // Scroll down 500 pixels
	}
}
