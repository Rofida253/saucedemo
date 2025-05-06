# saucedemo
1-search for  dependencies  for selenium & testNG then but them in pom.xml file 
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
 • Selenium WebDriver – for browser automation
 • TestNG – test framework
 • WebDriverManager – automatic driver management

 Screenshots on Test Failure

4-Screenshots are automatically captured and saved to the /screenshots/ folder whenever a test fails
 - Implemented in the @AfterMethod hook using ITestResult.
 - If a test fails, Selenium takes a screenshot and saves it with the test name
 
 5-Open the HTML file in by click on test-output then open index.html  with  web browser to view detailed test results, including
 - Test names
 - Pass/Fail status
 - Execution time
 - Log messages
