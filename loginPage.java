package pageObjects;

import Utilities.Utilities;


public class loginPage {
	//Utilities r = new Utilities();	
	   public void loginMethod(String applicationName) throws Exception {
			
			System.out.println("Inside the Login Method");		
			if(applicationName.toLowerCase().trim().equals("Edmunds")) {
				Utilities.driver.get(Utilities.p.getProperty("Edmund_application"));}
			else if(applicationName.toLowerCase().trim().equals("Kbb")) {
				Utilities.driver.get(Utilities.p.getProperty("kbb_application"));}
				else if(applicationName.toLowerCase().trim().equals("freedcamp")) {
					Utilities.driver.get(Utilities.p.getProperty("freedcamp_application"));}
			
				else if(applicationName.toLowerCase().trim().equals("learntoautomate")) {
					Utilities.driver.get(Utilities.p.getProperty("LearnToAutomate_application"));}	}		
		}
	}


