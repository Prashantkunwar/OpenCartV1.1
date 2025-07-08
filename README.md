# TutorialsNinja Test Automation Framework

This project is an automated test suite for the **TutorialsNinja Demo eCommerce Site** ([tutorialsninja.com/demo](https://tutorialsninja.com/demo/)). It is built using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**, with a Page Object Model (POM) design pattern for scalable and maintainable test code.

---

## 📝 About TutorialsNinja Demo

[TutorialsNinja Demo](https://tutorialsninja.com/demo/) is a practice eCommerce web application often used for testing and learning purposes. It replicates key online shopping features like:

* Product listing
* Add to cart
* Checkout process
* User registration & login
* Admin dashboard (if used)

---

## 🧪 Testing Features

This framework includes automated test cases that validate the following features:

* ✅ User login/logout
* 🛒 Add to cart functionality
* 🔍 Product search and filtering
* 🧾 Checkout process validation
* 📝 Registration and form submission
* ❌ Negative test scenarios (invalid login, missing inputs)
* 🌍 Cross-browser testing (Chrome, Firefox)
* 🧪 TestNG test suite execution
* 📋 Data-driven tests using Excel (Apache POI)
* 📊 HTML reports via ExtentReports

---

## 📁 Project Structure

```
TutorialsNinjaTest/
│
├── src/                         # Java source code (pages, tests, utilities)
├── testData/                    # Excel or CSV test inputs
├── config.properties            # Configuration file (browser, URL, login)
├── pom.xml                      # Maven dependencies and plugins
├── .gitignore                   # Git ignored files
├── run.bat                      # Batch file for Windows test execution
└── testng.xml                   # Main TestNG test suite
```

---

## 🛠️ Prerequisites

* Java 8 or higher
* Maven 3.6+
* ChromeDriver or GeckoDriver available in system PATH
* Internet connection for Maven to download dependencies

---

## ▶️ Running Tests

* **With Maven**

  ```bash
  mvn clean test
  ```

* **Specify TestNG suite**

  ```bash
  mvn clean test -DsuiteXmlFile=testng.xml
  ```

* **Run via batch file (Windows)**

  ```bash
  run.bat
  ```

---

## 📊 Test Reports

After test execution, reports are available at:

```
target/test-output/
```

You can find detailed test execution results, including ExtentReports if configured.


Thanks for using this framework!
**Happy testing! 🚀**
