# Graph QL Test NG
**API automation with TestNG and Rest Assured**

1. A test automation framework designed for automating both API testing. 

2. It is built using Java, TestNG, Rest Assured, and Maven.

3. It integrates with Allure Reports for enhanced test result visualization.

4. Plus, example tests for API are included.

**Setup :**

Install Java 8

Install Maven

Install TestNG from Eclipse/Intellij Marketplace

Allure Setup: Follow instructions from Allure's official site (https://docs.qameta.io/allure/)

**Running Tests:**

Step 1: Clone the repository to your local machine using the following command:
"git clone  https://github.com/Aarthi-Chandrasekar/Sample_GraphQL_API.git"

Step 2: Start the Spring Boot Application:
In your command prompt, navigate to the project directory and run the Spring Boot application with the following command:
mvn spring-boot:run

Step 3: Run Test
Execute the tests by running either of the following commands:
mvn clean install

or

Right-click on testng.xml in your IDE, then select "Run as" and choose "TestNG Suite."

**Test Report:**

To view report run the following command: allure serve allure-results
