package Calcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calculator {
	private static final String ActualResult = null;
	static WebDriver driver;
	@BeforeMethod
	public void bMethod()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium  req\\chromedriver_win32 (4)\\chromedriver.exe");
		 driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://www.calculator.net/");
	}
  @Test
  public void Cal()
  {
	//Multification//
	  
	  driver.findElement(By.xpath("//span[text()='4']")).click();
	  driver.findElement(By.xpath("//span[text()='2']")).click();
	  driver.findElement(By.xpath("//span[text()='3']")).click();
	  driver.findElement(By.xpath("//span[text()='×']")).click();
	  driver.findElement(By.xpath("//span[text()='5']")).click();
	  driver.findElement(By.xpath("//span[text()='2']")).click();
	  driver.findElement(By.xpath("//span[text()='5']")).click();
	  driver.findElement(By.xpath("//span[text()='=']")).click();
	 WebElement result=driver.findElement(By.id("sciOutPut"));
     String actualResult=result.getText().trim();	  
	 String expectedResult="222075";
	AssertJUnit.assertTrue(actualResult.equals(expectedResult));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.close();
  }
	@Test
	  public void Div()
	  {
	 //Division//
	  driver.findElement(By.xpath("//span[text()='4']")).click();
	  driver.findElement(By.xpath("//span[text()='0']")).click();
	  driver.findElement(By.xpath("//span[text()='0']")).click();
	  driver.findElement(By.xpath("//span[text()='0']")).click();
	  driver.findElement(By.xpath("//span[text()='/']")).click();
	  driver.findElement(By.xpath("//span[text()='2']")).click();
	  driver.findElement(By.xpath("//span[text()='0']")).click();
	  driver.findElement(By.xpath("//span[text()='0']")).click();
	  driver.findElement(By.xpath("//span[text()='=']")).click();
	  WebElement result1= driver.findElement(By.id("sciOutPut"));
	  String actualResult1=result1.getText().trim();
	  String expectedResult1="20";
	  AssertJUnit.assertTrue(actualResult1.equals(expectedResult1));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.close();
  }
    //Addition //	
	 @Test
	  public void Add() 
	  {
		  driver.findElement(By.xpath("//span[text()='–']")).click();
		  driver.findElement(By.xpath("//span[text()='2']")).click();
		  driver.findElement(By.xpath("//span[text()='3']")).click();
		  driver.findElement(By.xpath("//span[text()='4']")).click();
		  driver.findElement(By.xpath("//span[text()='2']")).click();
		  driver.findElement(By.xpath("//span[text()='3']")).click();
		  driver.findElement(By.xpath("//span[text()='4']")).click();
		  driver.findElement(By.xpath("//span[text()='+']")).click();
		  driver.findElement(By.xpath("//span[text()='3']")).click();
		  driver.findElement(By.xpath("//span[text()='4']")).click();
		  driver.findElement(By.xpath("//span[text()='5']")).click();
		  driver.findElement(By.xpath("//span[text()='3']")).click();
		  driver.findElement(By.xpath("//span[text()='4']")).click();
		  driver.findElement(By.xpath("//span[text()='5']")).click();
		  driver.findElement(By.xpath("//span[text()='=']")).click();
		  WebElement result=driver.findElement(By.id("sciOutPut"));
		  String actualResult=result.getText().trim();
		  String expectedResult="111111";
		  AssertJUnit.assertTrue(actualResult.equals(expectedResult));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          driver.close();
		 
	  }
	 //Substraction//
	 @Test
	  public void Sub() 
	  {
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='8']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='–']")).click();
		driver.findElement(By.xpath("//span[text()='–']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='9']")).click();
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='8']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		WebElement result=driver.findElement(By.id("sciOutPut"));
		String actualResult=result.getText().trim();
		String expectedResult="23329646";
		  AssertJUnit.assertTrue(actualResult.equals(expectedResult));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		  driver.close();

	  }

}
