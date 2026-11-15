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