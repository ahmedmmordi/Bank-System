// Import the packages
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Operations {
    protected static Scanner cin = new Scanner(System.in); // Scanner object for user input
    private static List<Account> Accounts = new ArrayList<>(); // List to store accounts in the banking system

    // Method to initialize the program with data
    protected static void InitialData() {
        SavingAccount One = new SavingAccount("Ahmed Mordi", 4000, 16);
        Accounts.add(One);
        CurrentAccount Two = new CurrentAccount("Mohamed Saad", 5000.0, 2500);
        Accounts.add(Two);
    }

    // Method to display the available options in the system
    protected static void Menu() {
        System.out.println("******************************************************");
        System.out.println("              Banking Application System              ");
        System.out.println("******************************************************");
        System.out.println("1- Open a new account.");
        System.out.println("2- Search about an account.");
        System.out.println("3- Deposit.");
        System.out.println("4- Withdraw.");
        System.out.println("5- Display all accounts details.");
        System.out.println("6- Exit.");
    }

    // Method to check the given choice
    protected static int IsValidChoice() {
        int choice = 0;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = Operations.cin.nextInt();
                if (!(choice>=1 && choice<=6)) {
                    System.out.println("Invalid input. Please enter a number from 1 and 6.");
                }
            }
            catch (Exception except) {
                System.out.println("Invalid input. Please enter a valid number.");
                Operations.cin.nextLine();
            }
        } while (!(choice>=1 && choice<=6));
        return choice;
    }

    // Method to check the given ID
    protected static int IsValidID() {
        int ID = 0;
        do {
            System.out.print("- Enter the ID of the customer: ");
            try {
                ID = Operations.cin.nextInt();
                if (ID<=0) {
                    System.out.println("Invalid input. the IDs are only positive numbers.");
                }
            }
            catch (Exception except) {
                System.out.println("Invalid input. Please enter a valid number.");
                Operations.cin.nextLine();
            }
        } while (ID<=0);
        return ID;
    }

    // Method to check the given amount
    protected static double IsValidAmount() {
        boolean Valid = false;
        double amount = 0.0;
        do {
            System.out.print("      - Enter the amount: ");
            try {
                amount = Operations.cin.nextDouble();
                if (amount>0) {
                    Valid = true;
                }
                else {
                    System.out.println("Invalid input. The amount should be a non-negative number.");
                }
            }
            catch (Exception except) {
                System.out.println("Invalid input. Please enter a valid amount.");
                Operations.cin.nextLine();
            }
        } while (!Valid);
        return amount;
    }

    // Method to open a new account in the system
    protected static void Open_NewAccount() {
        int type = Operations.SelectAccType();
        Account New_Acc = (type==1 ? new SavingAccount() : new CurrentAccount());
        System.out.println("- Enter the data of the account number: " + New_Acc.GetID());
        System.out.print("   - Enter the name of the account holder: ");
        String Name = Operations.cin.next();
        New_Acc.SetName(Name);
        boolean InitialBalance = Operations.SetInitialBalance();
        if (InitialBalance==true) {
            double amount = Operations.IsValidAmount();
            New_Acc.Deposit(amount);
        }
        Accounts.add(New_Acc);
        System.out.println("Account added successfully to the bank system.");
    }

    // Method to select the type of the account
    private static int SelectAccType() {
        int type = 0;
        do {
            System.out.println("- Select the type of the account:");
            System.out.println("   1- Saving Account.");
            System.out.println("   2- Current Account.");
            System.out.print("- Enter the number of the account type: ");
            try {
                type = Operations.cin.nextInt();
                if (type!=1 && type!=2) {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                }
            }
            catch (Exception except) {
                System.out.println("Invalid input. Please enter a valid number.");
                Operations.cin.nextLine();
            }
        } while (type!=1 && type!=2);
        return type;
    }

    // Method to set an initial balance
    private static boolean SetInitialBalance() {
        int choice = 0;
        do {
            System.out.println("   - Do you want to set an initial balance?");
            System.out.println("      1- Yes.");
            System.out.println("      2- No.");
            System.out.print("   - Enter your choice: ");
            try {
                choice = Operations.cin.nextInt();
                if (choice!=1 && choice!=2) {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                }
            }
            catch (Exception except) {
                System.out.println("Invalid input. Please enter a valid number.");
                Operations.cin.nextLine();
            }
        } while (choice!=1 && choice!=2);
        return choice==1;
    }

    // Method to search about an account by its ID
    protected static void Search(int ID) {
        for(Account account : Accounts) {
            if(account.GetID()==ID) {
                System.out.println("The customer information is: ");
                account.AccountInformation();
                return;
            }
        }
        System.out.println("The account not found.");
    }

    // Method to deposit to an account by its ID
    protected static void Deposit(int ID) {
        for(Account account : Accounts) {
            if(account.GetID()==ID) {
                // System.out.print("  - Enter the amount you want to deposit: ");
                double Amount = Operations.IsValidAmount();
                account.Deposit(Amount);
                return;
            }
        }
        System.out.println("  - The account not found.");
    }

    // Method to withdraw an amount from an account by its ID
    protected static void Withdraw(int ID) {
        for(Account account : Accounts) {
            if(account.GetID()==ID) {
                // System.out.print("  - Enter the amount you want to withdraw: ");
                double Amount = Operations.IsValidAmount();
                account.Withdraw(Amount);
                return;
            }
        }
        System.out.println("  - The account not found.");
    }

    // Method to print the information of each account
    protected static void Display() {
        for(Account account : Accounts) {
            account.AccountInformation();
        }
    }
}