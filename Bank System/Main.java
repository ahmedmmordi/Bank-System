public class Main {
    public static void main(String []Args) {
        Operations.InitialData();
        Operations.Menu();

        int choice = Operations.IsValidChoice();
        switch(choice) {
            case 1: {
                Operations.Open_NewAccount();
                System.out.println("All customers data is: ");
                Operations.Display();
                break;
            }
            case 2: {
                int ID = Operations.IsValidID();
                Operations.Search(ID);
                break;
            }
            case 3: {
                int ID = Operations.IsValidID();
                Operations.Deposit(ID);
                break;
            }
            case 4: {
                int ID = Operations.IsValidID();
                Operations.Withdraw(ID);
                break;
            }
            case 5: {
                System.out.println("All customers data is: ");
                Operations.Display();
                break;
            }
            case 6: {
                break;
            }
        }

        System.out.println("Thanks for using our system.");
        try {
            Thread.sleep(15000);
        }
        catch (InterruptedException except) {}
        Operations.cin.close();
    }
}