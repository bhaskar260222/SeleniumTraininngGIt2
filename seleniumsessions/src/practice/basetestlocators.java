package practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class basetestlocators 
{
 public static WebDriver driver;
 public static Properties bachior;
 public static String projectpath=System.getProperty("user.dir");

 public static void init() throws Exception
 {
	 FileInputStream fiso =new FileInputStream(projectpath+"\\or.properties");
	 bachior=new Properties();
	 bachior.load(fiso);
	String s= bachior.getProperty("firefoxbrowser");
	System.out.println(s);
 }
 public static void browserlaunchingconstruct(String browser)
	{
	System.out.println(bachior.getProperty("chromebrowser"));
	 if (bachior.getProperty(browser).equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();	
	}
	else if(bachior.getProperty(browser).equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		 driver =new FirefoxDriver();	
	}
	}
	public static void launcherconstruct(String url)
	{
		System.out.println(url);
		driver.get(bachior.getProperty(url));
		System.out.println(3);
	}
	
	
public static void selectoption(String locator,String option)
	{
	driver.findElement(By.id(locator)).sendKeys(option);
	}
	

public static void typeText(String locator, String text)
{
	driver.findElement(By.name(locator)).sendKeys(text);
		
	}

public static void ElementClick(String locator) 
{
driver.findElement(By.xpath(locator)).click();	
}

}




/*=============================
I.WebDriver Methods
===================================
1.Get(01)
2.Manage(02)
3.Navigate(03)
4.Quit(04)
5.Close(05)
6.GetTitle(06)
7.GetCurrentUrl(07)
8.GetPageSource(08)



9.find Element ()
10.find elements()
11.getwindowhandle()
12.getwindowhandles()
13.swithTo()
===============================
II.Locators
=============================
1.id ()
2.name(()
3.ClassName()
4.xpath()
5.cssSelector()
6.linkText()
7.partiallinktext()
8.tagname()
===========================================================
III.operations/actions on Webelements
=========================================================
1.click
2.sendkeys
3.clear
4.gettext application
5.get attribute
6.get location
7.getloaction x coordinate
8.getloaction y coordinate
9.get size
10.get tagname
11.Isdisplated
12.Isselected
13.Isenabled*
=================================================================*/
