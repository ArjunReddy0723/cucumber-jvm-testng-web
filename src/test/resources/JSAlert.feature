Feature:A WebDriver way to handle JS popups 

Scenario:Launch the url and handle the ok confirmation button 
Given Url is "C:\Users\badri\Documents\NetBeansProjects\CumcumberJVMWeb\src\test\resources\JSPopup.html" and "ok" button is pressed
Then The alert boxes should be closed successfully

Scenario:Launch the url and handle the cancel confirmation button 
Given Url is "C:\Users\badri\Documents\NetBeansProjects\CumcumberJVMWeb\src\test\resources\JSPopup.html" and "Cancel" button is pressed
Then The Cancel button is pressed successfully
