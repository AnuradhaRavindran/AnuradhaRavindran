package Week2.Day1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	    String actualTitle = "My Leads | opentaps CRM";
	    String title1 = driver.getTitle();
	    System.out.println(title1);
	    if(actualTitle.equals(title1))
	    {
	    	System.out.println("Title is Matched");
	    }
	    else
	    {
	    	System.out.println("Not Matched");
	    }
	    System.out.println();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	    WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
	     countryCode.clear();
	     countryCode.sendKeys("5");
	     WebElement drop = driver.findElement(By.id("createLeadForm_dataSourceId"));
	     Select dropDwn = new Select(drop);
	     dropDwn.selectByIndex(1);
	     int size = dropDwn.getOptions().size();
	     System.out.println("Size of source is : " +size);
	     WebElement drop1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	     Select dropDwn1 = new Select(drop1);
	     dropDwn1.selectByValue("CATRQ_AUTOMOBILE");
	     WebElement drop2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	     Select dropDwn2 = new Select(drop2);
	     dropDwn2.selectByVisibleText("Computer Hardware");
	     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ram");
	     driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Raj");
	     driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLeafApplication");
	     driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("200000");
	     WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	     Select dropDown3 = new Select(drop3);
	     dropDown3.selectByIndex(2);
	     driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("23456");
	     driver.findElement(By.id("createLeadForm_description")).sendKeys("Good luck");
	     driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("All cases tested");
	     driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("234516");
	     driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("12345");
	     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aersgty@gmail.com");
	     driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Raja");
	     driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Nehrucolony");
	     driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
	     driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600004");
	     driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("12345");
	     driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("ravi");
	     driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/04/2021");
	     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computers");
	     WebElement drop4 = driver.findElement(By.id("createLeadForm_currencyUomId"));
	     Select dropDown4 = new Select(drop4);
	     dropDown4.selectByValue("ALL");
	     driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("60");
	     driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("87@34");
	     driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("876543234");
	     driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Query");
	     driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
	     driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("ram");
	     driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Nanganallur");
	     WebElement drop5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	     Select dropDown5 = new Select(drop5);
	     dropDown5.selectByValue("AL");
	     WebElement drop6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	     Select dropDown6 = new Select(drop6);
	     dropDown6.selectByVisibleText("Algeria");
	     driver.findElement(By.name("submitButton")).click();
	     String attribute = driver.findElement(By.className("requiredField")).getAttribute("class");
	     System.out.println("Attribute value for firstname is : " +attribute);
	     String title2 = driver.getTitle();
	     System.out.println(title2);
	     String actualTitle1 = "View Lead | opentaps CRM";
	     if(actualTitle1.equals(title2))
	     {
	    	 System.out.println("ViewLead Page verified");
	     }
	     else
	     {
	    	 System.out.println("ViewLead page is not verified");
	     }
	     
	      
	   
	    
	  
	     
	     
	     
	     
	    
	     
	    
	}

}
