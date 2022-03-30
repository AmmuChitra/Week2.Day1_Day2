package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Jayachitra");
		
		driver.findElement(By.name("lastname")).sendKeys("Annamalai");
		
		driver.findElement(By.name("reg_email__")).sendKeys("8778919915");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Texture20@");
		
		WebElement date = driver.findElement(By.id("day"));
		
				Select dateOfTheMonth = new Select(date);
				
				dateOfTheMonth.selectByVisibleText("5");
				
				WebElement birthMonth = driver.findElement(By.id("month"));
				
				Select dropDown=new Select(birthMonth);
				
				dropDown.selectByVisibleText("May");
				
				WebElement dropYear = driver.findElement(By.id("year"));
				
				Select bYear=new Select(dropYear);
				
				bYear.selectByVisibleText("1990");
				
				
				driver.findElement(By.name("sex")).click();
				
				
			

	}

}
