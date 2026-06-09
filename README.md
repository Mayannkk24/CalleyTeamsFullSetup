# Calley Teams Full Setup Automation

## Project Overview

This project automates the core functionalities of the Calley platform using Selenium WebDriver, TestNG, Java, and Maven following the Page Object Model (POM) design pattern.

The automation framework was developed as part of the Automation Testing Internship Machine Test.

---

## Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* WebDriverManager
* Page Object Model (POM)

---

## Project Structure

```
CalleyTeamsFullSetup
│
├── pom.xml
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── base
│   │   │   │   └── BaseClass.java
│   │   │   │
│   │   │   ├── pages
│   │   │   │   ├── RegistrationPage.java
│   │   │   │   ├── LoginPage.java
│   │   │   │   ├── AgentPage.java
│   │   │   │   ├── CSVUploadPage.java
│   │   │   │   └── DashboardPage.java
│   │   │   │
│   │   │   └── utils
│   │   │       ├── ConfigReader.java
│   │   │       ├── ExcelUtils.java
│   │   │       └── ScreenshotUtils.java
│   │
│   ├── resources
│   │   ├── data.properties
│   │   └── testdata.xlsx
│   │
│   └── test
│       └── java
│           ├── RegistrationTest.java
│           └── FullSetupTest.java
│
└── test-output
```

---

## Implemented Test Scenarios

### 1. User Registration

* Navigate to Registration Page
* Enter Name
* Enter Email
* Enter Password
* Enter Mobile Number
* Submit Registration Form

### 2. User Login

* Navigate to Login Page
* Enter Valid Credentials
* Login Successfully
* Verify Dashboard Access

### 3. Agent Management Framework

Page Object structure for Agent Management has been implemented.

### 4. CSV Upload Framework

Page Object structure for CSV Upload has been implemented.

---

## How To Run

### Clone Repository

```bash
git clone <repository-url>
```

### Navigate To Project

```bash
cd CalleyTeamsFullSetup
```

### Execute Tests

```bash
mvn clean test
```

---

## Design Pattern

This framework follows the Page Object Model (POM) pattern to improve maintainability, reusability, and readability of automation scripts.

---

## Notes

* Registration automation fills all required fields.
* Login automation successfully logs into the application.
* Google reCAPTCHA requires manual verification and cannot be automated.
* The account available during testing was provisioned under the Calley Personal plan.
* Team Management features such as Agent Creation and CSV Upload are available under the Calley Teams plan. Corresponding framework structure and page objects have been implemented for these modules.

---

## Author

Mayank Goley

Automation Testing Internship Assignment
