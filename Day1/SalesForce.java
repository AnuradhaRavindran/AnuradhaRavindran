package Week2.Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Anu");
		driver.findElement(By.name("UserLastName")).sendKeys("Ravi");
		driver.findElement(By.name("UserEmail")).sendKeys("ravikh@gmail.com");
		WebElement drop = driver.findElement(By.name("UserTitle"));
		Select dropDwn = new Select(drop);
		List<WebElement> options = dropDwn.getOptions();
		int size = options.size();
		System.out.println("The No of jobTitle optins are : "+size);
		for(int i =1;i<size;i++)
		{   
			
			WebElement eachElement = options.get(i);
			String text = eachElement.getText();
			System.out.print("The Options in JobTitle are: ");
			System.out.println(text);
			
		
		}
		
		dropDwn.selectByValue("Sales_Manager_AP");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		WebElement drop1 = driver.findElement(By.name("CompanyEmployees"));
		Select dropDwn1 = new Select(drop1);
		dropDwn1.selectByVisibleText("Employees");
		driver.findElement(By.name("UserPhone")).sendKeys("53276352745");
		WebElement drop2 = driver.findElement(By.name("CompanyCountry"));
		Select dropDwn2 = new Select(drop2);
		dropDwn2.selectByIndex(2);
		driver.findElement(By.className("checkbox-ui")).click();
		Thread.sleep(1000);
		//driver.close();

	}

}
