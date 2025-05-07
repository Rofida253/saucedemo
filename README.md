# saucedemo
1-search for  dependencies  for selenium & testNG then put them in pom.xml file 
2-Folder Structure Overview
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/              Page Object classes
│   │                   
│
│   └── test/
│       └── java/
│           └── tests/             Test classes
│           └── utils/                Utility classes
│
├── screenshots/                    Screenshots saved on failure
├── drivers                         chromedriver ,geckodriver
├── testng.xml                      TestNG suite configuration
├── pom.xml                         Maven dependencies
└── reports/                        HTML reports generated

3-Tools & Libraries Used
-Selenium WebDriver  for browser automation using java 
 - Maven  to build automation that manage project
-TestNG for test framework for manage test execution and generate reports 


 Screenshots on Test Failure

4-Screenshots captured and saved to the /screenshots/ folder when the test fails
- i create folder to save the imaged in it ,then put path in class helper 
 - Implemented in the @AfterMethod using ITestResult , If a test fails, Selenium takes a screenshot and saves it with the test name
 
 5-Open the HTML file in by click on test-output then open index.html  with  web browser to view detailed test results, including
 - Test names
 - Pass/Fail status
 - Execution time
 - Log messages

