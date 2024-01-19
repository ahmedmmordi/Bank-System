public class SavingAccount extends Account {
    private double InterestRate;
    private static final String ACCOUNT_TYPE = "Saving";
    private static final double DEFAULT_INTERESTRATE = 15.0;

    // Constructors
    // Default constructor
    public SavingAccount() {
        super(); // Calling the constructor of the base class (Account)
        this.ID = Account.Counter++;
        this.InterestRate = DEFAULT_INTERESTRATE;
    }

    // Parameterized constructor
    public SavingAccount(String name, double interestRate) {
        this.ID = Account.Counter++;
        this.Name = name;
        this.Type = ACCOUNT_TYPE;
        this.Balance = 0.0;
        this.InterestRate  = interestRate;
    }

    // Parameterized constructor
    public SavingAccount(String name, double balance, double interestRate) {
        this.ID = Account.Counter++;
        this.Name = name;
        this.Type = ACCOUNT_TYPE;
        this.Balance = balance;
        this.InterestRate  = interestRate;
    }

    // Parameterized constructor (Copy constructor)
    public SavingAccount(SavingAccount base) {
        super(base);
        this.ID = Account.Counter++;
        this.InterestRate = base.GetInterestRate();
    }

    // Operations
    // Method to deposit an additional amount to the existing account balance
    @Override
    protected void Deposit(double amount) {
        if (amount<0) {
            throw new IllegalArgumentException("Deposit amount must be non-negative.");
        }
        else if (this.GetBalance()+amount>Account.MAXBALANCE) {
            throw new IllegalArgumentException("Cannot deposit more than the maximum allowed balance.");
        }
        else {
            // Update the account balance with the deposited amount
            this.Balance += amount;
            System.out.println("Deposit successful. Updated balance: " + this.Balance);
        }
    }

    // Method to withdraw an amount from the account
    @Override
    protected void Withdraw(double amount) {
        if(this.Balance-amount<0) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        else {
            // Deduct the specified amount from the account balance
            this.Balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + this.Balance);
        }
    }

    // Information Display
    // Method to display the account information
    protected void AccountInformation() {
        System.out.println(" - Account ID: " + this.GetID());
        System.out.println(" - Account holder name: " + this.GetName());
        System.out.println(" - Account type: " + this.GetType());
        System.out.println(" - Account balance: " + this.GetBalance() + '$');
        System.out.println(" - Interest rate: " + this.GetInterestRate() + '%');
        System.out.println("---------------------------");
    };

    // Setters
    // Method to set the account holder name
    protected void SetName(String name) {
        this.Name = name;
    }

    // Method to set the interest rate
    protected void SetInterestRate(double interestRate) {
        this.InterestRate = interestRate;
    }

    // Getters
    // Method to get the account ID
    @Override
    protected int GetID() {
        return this.ID;
    };

    // Method to get the account holder Name
    @Override
    protected String GetName() {
        return this.Name;
    }

    // Method to get the account type
    @Override
    protected String GetType() {
        return ACCOUNT_TYPE;
    }

    // Method to get the account balance
    @Override
    protected double GetBalance() {
        return this.Balance;
    }

    // Method to get the interest rate
    protected double GetInterestRate() {
        return this.InterestRate;
    }

    // Overrides "toString" for custom SavingAccount information representation
    @Override
    public String toString() {
        return "Account ID: " + this.GetID() +
                ", Account holder name: " + this.GetName() +
                ", Account type: " + GetType() +
                ", Account balance: " + this.GetBalance() + '$' +
                ", Interest rate: " + this.GetInterestRate() + '%';
    }
}