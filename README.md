# CS-320-Software-Test-Automation-QA

CS 320 Software Test, Automation, and Quality Assurance portfolio

## CS 320 Reflection

### How can I ensure that my code, program, or software is functional and secure?

I can help make sure my software is functional by testing it against the requirements instead of only checking if it runs. In this course, I used JUnit tests to check valid and invalid inputs, edge cases, duplicate IDs, null values, and other situations that could cause problems. I also checked test coverage so I could see whether important parts of the code were actually being tested. For security and reliability, I think it is important to validate inputs, reject invalid data, and keep testing as the code changes.

### How do I interpret user needs and incorporate them into a program?

I start by reading the requirements carefully and turning them into specific rules that the program must follow. For example, in the contact, task, and appointment services, the requirements included limits on ID lengths, required fields, valid phone numbers, and appointment dates that could not be in the past. I used those requirements to guide both the code and the JUnit tests. This helped me make sure I was building what the customer asked for instead of just what I thought the program should do.

### How do I approach designing software?

I try to break the software into smaller parts that each have a clear responsibility. In this course, the contact, task, and appointment objects handled their own data and validation, while the service classes handled actions such as adding, deleting, and updating objects. I also try to think about testing while I am designing the code instead of waiting until the end. This makes it easier to find problems early and helps keep the software organized, maintainable, and easier to improve later.
