public abstract class Account {
    protected static int Counter = 20242001;
    protected int ID;
    protected String Name;
    protected String Type;
    protected double Balance;
    protected final static double MAXBALANCE = 1000000.0;

    // Constructors
    // Default constructor
    protected Account() {
        this.Name = "UnKnown";
        this.Type = "Unknown";
        this.Balance = 0.0;
    }

    // Parameterized constructor
    protected Account(String type) {
        this.Name = "UnKnown";
        this.Type = type;
        this.Balance = 0.0;
    }

    // Parameterized constructor
    protected Account(String name, String type, double balance) {
        this.Name = name;
        this.Type = type;
        this.Balance = balance;
    }

    // Parameterized constructor (Copy constructor)
    protected Account(Account base) {
        this.Name = base.Name;
        this.Type = base.Type;
        this.Balance = base.Balance;
    };

    // Operations
    // Method to deposit an additional amount to the existing account balance
    protected void Deposit(double amount) {};

    // Method to withdraw an amount from the account
    protected void Withdraw(double amount) {};

    // Information Display
    // Method to display the account information
    protected void AccountInformation() {};

    // Setters
    // Method to set the account holder name
    protected abstract void SetName(String name);

    // Getters
    // Method to get the account ID
    protected abstract int GetID();

    // Method to get the account Name
    protected abstract String GetName();

    // Method to get the account Type
    protected abstract String GetType();

    // Method to get the account Balance
    protected abstract double GetBalance();

    // Overrides "toString" for custom SavingAccount information representation
    @Override
    public abstract String toString();
}