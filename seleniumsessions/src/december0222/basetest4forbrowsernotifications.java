package december0222;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest4forbrowsernotifications 
{
	public static WebDriver driver;
	 public static Properties bachiv;
	 public static String projectpath=System.getProperty("user.dir");

	 public static void init() throws Exception
	 {
		 FileInputStream fis =new FileInputStream(projectpath+"\\data.properties");
		 bachiv=new Properties();
		 bachiv.load(fis);
		String s= bachiv.getProperty("firefoxbrowser");
		 System.out.println(s);
	 }
	 public static void launchbst(String browser)
		{
		 System.out.println(bachiv.getProperty("chromebrowser"));
		 if (bachiv.getProperty(browser).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();	
		}
		else if(bachiv.getProperty(browser).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			//driver.get("https://www.facebook.com/");
			ProfilesIni pr=new ProfilesIni();
			FirefoxProfile profile=pr.getProfile("decemberprofile2022");
			FirefoxOptions option =new FirefoxOptions();
			option.setProfile(profile);
			
	//1.Notifications
		   profile.setPreference("dom.webnotifications.enabled", false);
			
			
	//2.Setting the Firefox binaries path errors if browser is not loading then and only then
			//option.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			
	//3.Certificate errors
			profile.setAcceptUntrustedCertificates(true);
			profile.setAssumeUntrustedCertificateIssuer(false);
			
			//4.How to work with proxy Settings//about:config should be typed in browser of the address bar
			//profile.setPreference("network.proxy.type", 1);
			//profile.setPreference("network.proxy.socks", "192.168.10.1");//Here I gave dummy port number 
			//profile.setPreference("network.proxy.socks_port", 1744);
			driver=new FirefoxDriver();
		}
			
		}
		 public static void navigateurlbb(String url)
			{
				System.out.println(url);
				driver.get(bachiv.getProperty(url));
				System.out.println(3);
			}
		}
			
	

		

