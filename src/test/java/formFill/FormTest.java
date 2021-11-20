package formFill;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormTest {


	

	@Test ()
	public void getData()
	{
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://demoqa.com/automation-practice-form");
//		Assert.assertEquals("true", "true");
//				driver.findElement(By.id("firstName")).sendKeys("Rupendra");
//		driver.findElement(By.id("lastName")).sendKeys("singh");
//		
//		driver.findElement(By.xpath("//div/input[@id='userEmail']")).sendKeys("rupendras32@gmail.com");
//		driver.findElement(By.id("userNumber")).sendKeys("9713449338");
//
//		
//	driver.findElement(By.xpath(("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"))).sendKeys("Mathematics");
//			driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
//            driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
//            
//		
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("scrollBy(0,600)");
//		
//	    driver.findElement(By.id("dateOfBirthInput")).click();
//	
//	
//        Select year=new Select(driver.findElement(By.className("react-datepicker__year-select")));		
//		year.selectByVisibleText("1990");
//		
//	    Select month=new Select(driver.findElement(By.className("react-datepicker__month-select")));
//	    month.selectByVisibleText("September");
//	
//	    driver.findElement(By.xpath("//div/div[contains(text(),'21')]")).click();           
//           
//		
//		driver.findElement(By.xpath("//div//input[@id='hobbies-checkbox-1']")).click();
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\HP\\Desktop\\guddi mba_to_indb.pdf");
       // driver.findElement(By.id("currentAddress")).sendKeys("C 763 sukhliya indore 452010");
        
	
	
	}
	
}
