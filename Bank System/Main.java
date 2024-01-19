public class Main {
    public static void main(String []Args) {
        Operations.InitialData();

        Operations.Menu();
        int choice = Operations.cin.nextInt();
        switch(choice) {
            case 1: {
                Operations.Open_NewAccount();
                System.out.println("All customers data is: ");
                Operations.Display();
                break;
            }
            case 2: {
                System.out.print("- Enter the ID of the customer you want to search about: ");
                int ID = Operations.cin.nextInt();
                Operations.Search(ID);
                break;
            }
            case 3: {
                System.out.print("- Enter the ID of the customer: ");
                int ID = Operations.cin.nextInt();
                Operations.Deposit(ID);
                break;
            }
            case 4: {
                System.out.print("- Enter the ID of the customer: ");
                int ID = Operations.cin.nextInt();
                Operations.Withdraw(ID);
                break;
            }
            case 5: {
                System.out.println("All customers data is: ");
                Operations.Display();
                break;
            }
            case 6: {
                Operations.cin.close();
                break;
            }
            default: {
                System.out.println("Invalid choice, Please try again.");
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