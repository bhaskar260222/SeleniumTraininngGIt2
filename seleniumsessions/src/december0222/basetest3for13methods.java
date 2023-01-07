package december0222;
import java.io.FileInputStream;


import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest3for13methods
{
public static WebDriver driver;
public static String projectpath=System.getProperty("user.dir");
public static Properties pt;
public static void init() throws Exception

{
	FileInputStream fiss=new FileInputStream(projectpath+"\\data.properties");
	pt=new Properties();
	pt.load(fiss);	
	String s=pt.getProperty("andhrajyothy");
	System.out.println(s);
			
}
	public static void launchb(String stbrowser)
	{
		System.out.println(stbrowser);
	 if (pt.getProperty(stbrowser).equals("chrome"))
	{
		driver =new ChromeDriver();
		WebDriverManager.chromedriver().setup();
	}
	 
	 else if (pt.getProperty(stbrowser).equals("firefox"))
	{
		driver =new FirefoxDriver();
		WebDriverManager.firefoxdriver().setup();
	}
}
public static void navigateurls(String url)
	
	{
	     System.out.println(url);
		//driver.get(pt.getProperty(url));
	     driver.navigate().to(pt.getProperty(url));
	}
	
	}

/*
Get(01)
Manage(02)
Navigate(03)
Quit(04)
Close(05)
GetTitle(06)
GetCurrentUrl(07)
GetPageSource(08)

FindElement()
FindElements()
GetWindowHandle()
GetWindowHandles()
SwithchTo()*/

