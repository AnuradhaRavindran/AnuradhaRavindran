package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("input-username")).sendKeys("Anuravi");
		driver.findElement(By.id("input-firstname")).sendKeys("Anu");
		driver.findElement(By.id("input-lastname")).sendKeys("Ravi");
		driver.findElement(By.id("input-email")).sendKeys("anuravi123@gmail.com");
		WebElement drop = driver.findElement(By.id("input-country"));
		Select dropDwn = new Select(drop);
		dropDwn.selectByVisibleText("India");
		driver.findElement(By.id("input-password")).sendKeys("anuravi123");
		driver.close();
		
		
		

	}

}
