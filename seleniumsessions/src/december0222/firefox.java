package december0222;


import org.openqa.selenium.firefox.FirefoxDriver;



public class firefox {

	public static void main(String[] args)
	{
//Through Script

	System.setProperty("webdriver.chrome.driver","C:\\Users\\saila\\SeleniumSessions\\seleniumsessions\\Drivers\\firefoxdriver.exe");
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://onlinesbi.com");
	}

}

