package ATM_Machine_JAVA;
import java.util.Scanner;

public class ATM {
    public Account account;
    Boolean exit=false;
    
    public ATM(Account account){
        this.account=account;
    }
    public void start(){
        Scanner sc =new Scanner(System.in);
        while(!exit){
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice =sc.nextInt();
            switch (choice){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(sc);
                    break;
                case 3:
                    withdraw(sc);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }
    }
    private void checkBalance() {
        System.out.println("Current balance: $" + account.getBalance());
    }

    private void deposit(Scanner sc) {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    private void withdraw(Scanner sc) {
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}
