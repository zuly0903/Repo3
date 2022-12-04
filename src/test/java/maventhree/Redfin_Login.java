package maventhree;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Redfin_Login {
	
	public static WebDriver driver;
	
	@Test
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@Test
	@Parameters({"username","password"})
	public void LoginCredidencial(String username, String password){
		
		
		
		WebElement uname = driver.findElement(By.cssSelector("#login1"));
		uname.sendKeys(username);
		WebElement psw = driver.findElement(By.cssSelector("#password"));
		psw.sendKeys(password);
		
		driver.quit();
	}

}
