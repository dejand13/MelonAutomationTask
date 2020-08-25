# MelonAutomationTask

Selector
All the selectors used in the assignment are placed under main PageObject package in Selectors class. I have used Page object model which make all the code more clear and more understandable

Web Driver Setup 

This class was used for initializing the web driver, which means all of the classes created were extended by this WebDriverSetup class. Data.properties file was used for defining the URL and the browser. 

Test Cases
Three test cases has been created - BabyKinderzimmerTest, ElectronicComputerTest, VideospieleTest. All of them are navigating into the desired category, choosing list view and switching the products sorting regarding newly arrived products, ascending and   descending price. 

Gherkin
Using the Gherkin syntax in a feature file-like style Electronic -> Computer page test has been created including the task described steps - Navigation to AllProducts , then to computer page , choosing list view and playing with the products sorting. Also additional verification was added - assertion in order to verify that the desired steps has been executed.
