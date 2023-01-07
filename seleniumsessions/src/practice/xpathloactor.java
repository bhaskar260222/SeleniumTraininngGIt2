package practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathloactor 
{
public static WebDriver driver;


	public static void main(String[] args) throws Exception
	{

		
		 driver=new ChromeDriver();
		//driver.get("https://training.orangehrm.com/");
		//driver.get("https://starterhelp.orangehrm.com/hc/en-us?flash_digest=30cdd47526eebc0d1385599e4ca9a7f4279225ad");
		driver.get("https://www.amazon.in/");

//1.Absolute Xpath
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/input")).sendKeys("bhaskar");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/input")).click();
		
//2.Relative Xpath

//driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("VARDHAM");
//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
//3.Xpath woth 'or'
		//driver.findElement(By.xpath("//input[@type='searchy' or @name='query']")).sendKeys("boori");
		//driver.findElement(By.xpath("//input[@type='search' or @name='queryq']")).click();
		
//4.Xpath with 'and'
				//driver.findElement(By.xpath("//input[@autocomplete='off' and @aria-label='Search']")).sendKeys("basha");
				//driver.findElement(By.xpath("//input[@autocomplete='off' and @aria-label='Search']")).click();
		
//5.Xpath with 'Contains()' Dynamic xpath it will be usefull.
		//driver.findElement(By.xpath("//input[contains(@type,'ar')]")).sendKeys("bachi");

//6.Xpath with 'Start-With()' Dynamic xpath it will be usefull.
				//driver.findElement(By.xpath("//input[Start-with(@type,'ar')]")).sendKeys("bachi");
				

//7.Xpath with 'text()' Dynamic xpath it will be usefull.
		//Thread.sleep(3000);
				//driver.findElement(By.xpath("//a[text()='OrangeHRM']")).click();
		
		WebElement  Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
				Searchbox.sendKeys("T-Shirts for women");
		
	driver.findElement(By.xpath("//input[@type='submit' ]")).click();
	
	//driver.findElement(By.linkText("Mobiles")).click();
	driver.findElement(By.partialLinkText("Mobi")).click();
				

	}


}
