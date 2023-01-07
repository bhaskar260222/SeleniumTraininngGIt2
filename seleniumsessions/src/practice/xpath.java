package practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;


public class xpath {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception 
	{
	
	
		WebDriverManager.edgedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://amazon.in");
	// Thread.sleep(4000);
	// driver.findElement(By.xpath("//button[text()='Forgot email?']")).sendKeys("bhaskar.var@gmail.com");
	
	 //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'] ")).click();
	
	 //driver.findElement(By.xpath("//a[text()='About Us']")).click();
	 driver.findElement(By.xpath("//a[text()=' Electronics']")).click();
	 
	//form[@id='nav-search']//descendant::div
	 //driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("books");
	 //driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @name='field-keywords']")).sendKeys("tables");
	//driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'],//parent :: div")).sendKeys("mobiles");

	 
	 
	// =========================================================================================================================================================================================//
	 // driver.findElement(By.xpath("//input[@name='//input[@class='nav-input nav-progressive-attribute']")).sendKeys("water bottle");
	 //driver.findElement(By.xpath("///span[text()='V67aGc']")).sendKeys("bhaskar.var@gmail.com");
	 //driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
	 //driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhaskar.var@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akshay2010$");
		//driver.findElement(By.xpath("//button[@value=1]")).click();
	}

	
	
	/*public static void chapter1()
	
	{
		driver.get("https://w3schools.com");
		driver.findElement(By.xpath("//div[@class='sn-b-def sn-blue']")).click();
		driver.findElement(By.xpath("/html/body/div[3]/a[4]"));
	}

	
	
	
	public static void chaper8() throws Exception
	{
		Thread.sleep(6000);
driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
driver.manage().window().maximize();
Thread.sleep(6000);
driver.findElement(By.xpath("//a[text()='Sign in']")).click();
Thread.sleep(6000);
	}*/
	
	}

