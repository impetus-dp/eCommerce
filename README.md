## Test Automation Ready to use Template: Selenium, Cucumber, TestNg, Maven, Extent Reports and Java8 with Page Object Model
## Framework Design Features 

- WebDriver Manager /WebDriver Factory / Browser Factory  

	  •  To start a new web driver with Environment Name: Test can run on Local or on Remote Machine or on cloud.

	  •  Browser Name; Test can ask for any browser; Implicitly Wait; Driver Path
																															
- PageObject Manager 	

	  •  To achieve page's single object creation for all the step definition files.

- FileReader Manager 	

	  •  Singleton Pattern: The Singleton's purpose is to control object creation. Because there is only one singleton instance, any instance fields of a Singleton will
	  		      occur only once per class, just like static fields.

	
		
- Test Context 

	  •  PicoContainer Dependency Injection : Sharing Test Context between Cucumber Step Definitions.
        

- Extent Spark Reports (HTML) and PDF.

## Configuration

- cucumber - 7.0.0
- selenium-java version 3.141.59
- webdrivermanager version 4.4.3
- cucumber-testng version 7.0.0
- cucumber-picocontainer version 7.0.0
- extentreports version 5.0.9
- extentreports-cucumber7-adapter version 1.0.0
- log4j version 4.4.3
