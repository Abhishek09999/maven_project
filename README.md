# maven_project
# Simple Maven DevOps Project 

This is a beginner-friendly Java Maven project to showcase basic DevOps concepts like unit testing, GitLab CI/CD, and automation.

---

##  Project Features

- Java CLI app with two features:
  - Check if a string is a **palindrome**
  - Count **vowels** in a string
- Built using **Apache Maven**
- Includes **JUnit tests**
- Fully integrated with **GitLab CI/CD** pipeline
- Runs automatically on each push 

---

##  How to Run Locally

```bash
# Clone the repository
git clone <your-repo-url>
cd simple-maven-devops

# Build and test
mvn clean test

# Run the application
mvn exec:java -Dexec.mainClass="com.example.PalindromeChecker"
