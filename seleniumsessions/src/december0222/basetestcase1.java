package december0222;

import java.io.FileInputStream;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class basetestcase1
{
 public static WebDriver driver;
 public static Properties bachi;
 public static String projectpath=System.getProperty("user.dir");

 public static void init() throws Exception
 {
	 FileInputStream fis =new FileInputStream(projectpath+"\\data.properties");
	 bachi=new Properties();
	 bachi.load(fis);
	String s= bachi.getProperty("firefoxbrowser");
	 System.out.println(s);
 }
 public static void launch(String browser)
	{
	 System.out.println(bachi.getProperty("chromebrowser"));
	 if (bachi.getProperty(browser).equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();	
	}
	else if(bachi.getProperty(browser).equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		 driver =new FirefoxDriver();	
	}
	}
	public static void navigateurl(String url)
	{
		System.out.println(url);
		driver.get(bachi.getProperty(url));
		System.out.println(3);
	}
}
	
	
