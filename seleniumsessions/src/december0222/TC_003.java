package december0222;

public class TC_003 extends basetest3for13methods
{

	public static void main(String[] args) throws Exception 
	{
	     init();
	     
		launchb("chromebrowser");
		
		navigateurls("andhrajyothy");
		

		driver.manage().window().maximize(); 
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String st=driver.getCurrentUrl();
		System.out.println(st);
		
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		String winID = driver.getWindowHandle();
		System.out.println(winID);
		//driver.getPageSource();
		
		driver.close();
		
		//driver.quit();	
		
	}

}
