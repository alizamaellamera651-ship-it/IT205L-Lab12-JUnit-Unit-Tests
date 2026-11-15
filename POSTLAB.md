# Laboratory Activity 12 – JUnit Unit Testing

## Post-Lab Questions and Answers

**1. What makes a good unit test name?**

A good unit test name clearly describes what is being tested and the expected result. It should be easy to understand without reading the entire test code. For example, `createsEquipment_withValidDetails()` describes the expected behavior.

**2. Why isolate the unit from slow external systems?**

We isolate a unit from slow external systems because unit tests should run quickly and consistently. This makes testing easier and helps developers identify errors in a specific part of the program without depending on databases, networks, or other external services.

**3. Describe Arrange–Act–Assert using one of your tests.**

In my `updatesQuantity_withValidValue()` test:

- Arrange: Create an Equipment object with an initial quantity of 10.
- Act: Call `updateQuantity(15)`.
- Assert: Check whether the new quantity is 15 using `assertEquals()`.

This structure makes the test organized and easier to understand.

**4. What did assertThrows verify in your suite?**

`assertThrows()` verified that the program correctly throws an `IllegalArgumentException` when invalid values are provided. For example, it checks whether the program rejects a negative equipment quantity.

**5. How will these tests support Final Defense quality gates?**

These tests help ensure that important parts of the system work correctly before the final defense. They can detect errors early, verify expected behavior, and provide evidence that the system has been tested. This improves the reliability and quality of our project.

## Discussion: Why should tests not require manual console typing?

Unit tests should run automatically without requiring users to type information manually into the console. Automated tests save time, produce consistent results, and can be repeated whenever the code changes. They also make it easier to identify errors and verify whether the program still works correctly.

# Lab 13 – Post-Lab Questions and Answers

### 1. Why is CLI test automation stronger evidence than “it ran on my laptop once”?

CLI test automation provides repeatable and consistent results. It allows tests to run automatically and shows clear evidence of whether the program passes or fails. Other developers can also run the same tests on their computers.

### 2. What information in a failing test report helps locate defects quickly?

A failing test report shows the test class, method name, line number, expected result, actual result, and error message. These details help developers identify where the problem occurred.

### 3. List three items on the defense regression checklist.

1. Clean compilation and successful test execution.
2. All automated tests pass through the command line.
3. No passwords, API keys, or other secrets are included in the repository.

### 4. How does automation support YAGNI and refactoring confidence?

Automation helps developers avoid adding unnecessary features because they can test only what the project currently needs. It also provides confidence when changing existing code because automated tests can check whether the changes affected existing functionality.

### 5. What would you add next to approach a simple CI pipeline?

I would add a GitHub Actions workflow that automatically runs `mvn clean test` whenever code is pushed to GitHub or a pull request is created. This helps detect errors before changes are merged.