package december0222;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class edge {

	public static void main(String[] args) {
		

//Through WebDriver Manager
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://axisbank.com");

	}

}
