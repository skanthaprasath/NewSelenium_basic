package RT_SimpleProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM3 {
	WebDriver driver;
	POM3(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a") WebElement cart;
	@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[3]/button") WebElement pop;
	
	void cartselct() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
		pop.click();
		cart.click();
	}
}
