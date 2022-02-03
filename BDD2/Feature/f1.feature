Feature:Test the KSRTC application
Scenario Outline:Test the login page with valid details 
Given Open chrome browser and url of the application
When Enter "<Username>" , "<password>" and click on login button
Then Success in login 