package december0222;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chomeDynamically {

 
public static void main(String[] args)
	
{
	
//How to set a dynamic path for script
	
	
 WebDriver driver;
 
 String projectpath=System.getProperty("user.dir");
 
System.setProperty("webdriver.chrome.drive",projectpath+"\\Drivers\\ChromeDriver.exe");

driver=new ChromeDriver();
driver.get("https://netbanking.hdfcbank.com/netbanking/");
	}

}
