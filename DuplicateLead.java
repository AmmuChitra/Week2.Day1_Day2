package week2_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	    public static void main(String[] args) {
	    	
		WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayachitra");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Annamalai");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Chitra.A");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");

		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium_Program");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Jayachitra.annamalai@gmail.com");

		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select dropDown = new Select(state);

		dropDown.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
		
        driver.findElement(By.linkText("Duplicate Lead")).click();
        
        driver.findElement(By.id("viewLead_companyName_sp")).clear();
        
        driver.findElement(By.id("viewLead_companyName_sp")).sendKeys("Hexawaver");
        
        driver.findElement(By.name("submitButton")).click();
        
    	System.out.println(driver.getTitle());
    	


	}

}
