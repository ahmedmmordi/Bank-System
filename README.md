# Banking Application System

This is the README file for the Banking Application System, a simple console-based program for managing bank accounts. The system supports operations such as opening new accounts, searching for accounts, depositing and withdrawing funds, and displaying account details.

## Project Structure

### Main.java

The `Main.java` file contains the main function of the Banking Application System. It orchestrates the program's flow, presents a menu of options to the user, and calls functions defined in the `Operations` class to perform various banking operations based on the user's input.

Key functionalities in `Main.java` include:

- Initializing the program with initial account data.
- Displaying the program's menu options.
- Taking user input for their choice.
- Performing operations based on the user's choice, such as opening a new account, searching for an account, depositing, withdrawing, displaying account details, and exiting the program.

### Account.java

The `Account.java` file defines the `Account` class, which serves as the base class for different types of bank accounts. It includes common attributes such as account ID, account holder name, account type, and account balance. The class also provides methods for depositing and withdrawing funds, setting account information, and displaying account details.

### SavingAccount.java

The `SavingAccount.java` file extends the `Account` class to create a specific type of account, a saving account. It includes additional attributes such as an interest rate. The class overrides the `AccountInformation` method to display saving account-specific details.

### CurrentAccount.java

The `CurrentAccount.java` file similarly extends the `Account` class to create another specific type of account, a current account. It includes additional attributes such as an overdraft limit. The class overrides the `AccountInformation` method to display current account-specific details.

### Operations.java

The `Operations.java` file contains the `Operations` class, which encapsulates core functions for manipulating bank accounts. It includes methods for displaying the menu, initializing the program with data, opening a new account, selecting the type of account, setting an initial balance, displaying all accounts, searching for an account, depositing, and withdrawing.

## How to Use the Program

1. **Download and Run the Provided .exe File**:

   - Download the program's executable file (e.g., `Bank.exe`).
   - Run the program by double-clicking on the executable file.

2. **Interact with the Menu**:

   - The program will display a menu with several options.
   - Use the number keys (1 to 6) to select the desired option.
   - Follow the on-screen prompts to perform different banking operations.

3. **Data Validation**:

   - The program performs data validation to ensure that you enter valid information.
   - If you receive an error message, follow the instructions to correct your input.

4. **Available Options**:

   - Open a new account (Option 1): Add a new account with user-specified details.
   - Search for an account (Option 2): Search for an account by its ID.
   - Deposit to an account (Option 3): Add funds to an existing account.
   - Withdraw from an account (Option 4): Remove funds from an existing account.
   - Display all accounts (Option 5): View details of all accounts.
   - Exit the program (Option 6): Terminate the program.

5. **Sample Data**:

   - The program is initialized with two sample accounts (one saving and one current). You can perform various operations on these accounts.

Feel free to use and customize this Banking Application System according to your needs. If you encounter any issues or have further questions, please refer to the source code and this README file for guidance.

## System Analysis and Design

The Banking Application System is crafted with careful consideration for system analysis, design principles, and professional coding practices. Key features include:

### Exception Handling

- **Data Validation:**
  - The program incorporates robust data validation mechanisms to ensure that user inputs are accurate and within expected ranges.
  - For example, when depositing or withdrawing funds, the system checks for non-negative amounts and enforces limits on maximum balances.

- **Exception Handling:**
  - The code utilizes exception handling to gracefully manage unexpected scenarios, providing informative error messages and guiding users on corrective actions.
  - For instance, when attempting to withdraw more funds than available, the system throws an exception indicating insufficient funds.

### Object-Oriented Programming (OOP) Concepts

- **Inheritance:**
  - The system demonstrates the use of inheritance by having a base `Account` class extended by specialized classes such as `SavingAccount` and `CurrentAccount`. This allows for the creation of distinct account types with shared functionalities.

- **Polymorphism:**
  - Polymorphism is exemplified through the overridden `AccountInformation` method in the derived classes (`SavingAccount` and `CurrentAccount`). This enables each account type to present its unique details while adhering to a common interface.

- **Encapsulation:**
  - Encapsulation is employed to encapsulate account-related data and behaviors within classes. Access to data is controlled through getters and setters, promoting data integrity and security.

- **Abstraction:**
  - Introducing a public abstract class `Account` that embodies the concept of abstraction. This class serves as a blueprint for derived classes to implement specific functionalities, guiding the development of unique features for diverse account types.


### Professional Writing Code

The code adheres to professional coding practices, promoting readability, maintainability, and efficiency:

- **Meaningful Variable and Method Names:**
  - Variable and method names are chosen to be descriptive, aiding in code understanding. For example, `Deposit` and `Withdraw` methods clearly convey their purposes.

- **Consistent Code Formatting:**
  - The code maintains a consistent and clean formatting style. Indentation, spacing, and braces placement follow a standard convention, enhancing code readability.

- **Comments and Documentation:**
  - Comments are strategically placed to explain complex logic, ensuring that the code is comprehensible to other developers. Additionally, this README file serves as comprehensive documentation, providing users and developers with usage guidelines and insights into the system's design.

- **Error Handling and User Guidance:**
  - The system provides clear error messages and user prompts, guiding users in the event of invalid inputs or exceptional circumstances. This enhances the overall user experience and reduces the likelihood of unintended errors.

This system is designed not only for functionality but also with an emphasis on maintainability, extensibility, and user-friendly interactions. The integration of exception handling, OOP principles, and professional coding practices contributes to a robust and efficient Banking Application System.

## Disclaimer

This program is a simple educational project and may not cover all aspects of a real-world banking system. Use it responsibly and consider security and validation measures in a production environment.