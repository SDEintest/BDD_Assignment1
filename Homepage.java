package pageObjects;

import org.openqa.selenium.By;
import Utilities.Utilities;

public class Homepage {
	//Utilities u = new Utilities();
	
	public void EdmundclickButton(String buttonName)
	{
		//if(buttonName.toLowerCase().trim().contains("edmund")) {
			Utilities.driver.findElement(By.id(Utilities.p.getProperty("Edmundloginbutton_XPath"))).click();
		//else if(buttonName.toLowerCase().trim().contains("cars for sell"))
			Utilities.driver.findElement(By.id(Utilities.p.getProperty("EdmundEmailtextbox_ID"))).sendKeys("EdmundEmailname");
			Utilities.driver.findElement(By.id(Utilities.p.getProperty("EdmundContinuebtn_ID"))).click();
			Utilities.driver.findElement(By.id(Utilities.p.getProperty("EdmundPasswordtextbox_ID"))).sendKeys("EdmundPassword");
			Utilities.driver.findElement(By.id(Utilities.p.getProperty("EdmundSubmitbtn_ID"))).click();
	}
	
	public void validateEdmundHomePage() {		
		String textFromHomePage = Utilities.driver.findElement(By.xpath(Utilities.p.getProperty("Edmundlogo_XPath"))).getText();
		if(textFromHomePage.contains("Edmund")) 
			System.out.println("Home page was displayed successfully");
		else
			System.out.println("Home page was not displayed successfully");
	}
	
}



