This framework uses **ExtentReports** for detailed test execution reporting.

Features:
- HTML report generated at: `test-output/ExtentReport.html`
- On test failures, screenshots are:
  - Captured automatically
  - Saved to `test-output/screenshots/`
  - Attached to the report

Project structure

project-root/
│
├── pom.xml
├── testng.xml
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── utils/
│   │           └── DriverFactory.java
│
│   └── test/
│       └── java/
│           ├── pages/
│           │   ├── HomePageV0.java
│           │   └── W3SchoolsPage.java
│           │
│           ├── tests/
│           │   ├── BaseTest.java           
│           │   ├── SearchInputTest.java
│           │   └── SignUpButtonTest.java
│           │
│           └── utilities/
│               ├── ExtentManager.java      =
│               ├── ExtentTestListener.java 
│               └── ScreenshotUtil.java     
│
├── test-output/
│   ├── ExtentReport.html         
│   └── screenshots/               

How It Works:
- 'ExtentManager' initializes the report
- 'ExtentTestListener' listens to TestNG events and adds logs/screenshots
- 'ScreenshotUtil' handles screenshot capture
- 'BaseTest' provides the WebDriver reference for reporting

To Run Tests:
```bash
mvn clean test
# or
Right click testng.xml > Run

