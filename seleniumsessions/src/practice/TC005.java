package practice;

import java.util.List;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;

public class TC005 extends basetestlocators{

	

	public static void main(String[] args) throws Exception
		
		{
	init();
browserlaunchingconstruct("chromebrowser");
launcherconstruct("Amazon");
selectoption("searchDropdownBox","furniture");
typeText("field-keywords","sofa com bed");
ElementClick("//*[@id=\"nav-search-submit-button\"]");



 //  WebElement loc = driver.findElement(By.id("searchDropdownBox"));
 //  loc.sendKeys("furniture");
 // driver.findElement(By.name("field-keywords")).sendKeys("sofa com bed");
 driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
 Thread.sleep(3000);
 //driver.findElement(By.linkText("Customer Service")).click();
 driver.findElement(By.partialLinkText("Customer")).click();
  List<WebElement> links = driver.findElements(By.tagName("a"));
 for(int i=0;i<links.size();i++)
 {
	 if(!links.get(i).getText().isEmpty())
	 {
	 System.out.println(links.get(i).getText());
 }
	  List<WebElement> lks = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
	  for(int j=0;j<lks.size();j++)
	{
	 	 System.out.println(links.get(j).getText());
	  }
 }
		

		
 }
		}
