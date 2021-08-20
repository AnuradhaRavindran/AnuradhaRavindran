package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@data-testid = \"open-registration-form-button\"]")).click();
        driver.findElement(By.name("firstname")).sendKeys("Anu");
        driver.findElement(By.name("lastname")).sendKeys("Ravi");
        driver.findElement(By.name("reg_email__")).sendKeys("anuarvi@1234");
        driver.findElement(By.name("reg_passwd__")).sendKeys("anuaravi123");
        WebElement month = driver.findElement(By.id("month"));
        Select monthDrop = new Select(month);
        monthDrop.selectByVisibleText("Jan");
        WebElement day = driver.findElement(By.id("day"));
        Select dayDrop = new Select(day);
        dayDrop.selectByValue("4");
        WebElement year = driver.findElement(By.id("year"));
        Select yearDrop = new Select(year);
        yearDrop.selectByValue("1980");
        driver.findElement(By.name("sex")).click();
        
        
        

	}

}
