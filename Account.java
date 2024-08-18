package ATM_Machine_JAVA;

public class Account {
    private String accountNumber;
    public double balance;
    
    Account(String accountNumber,double initialbalance){
        this.accountNumber=accountNumber;
        this.balance=initialbalance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited:" +amount);
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    public void withdraw(double amount){
        if(balance>=amount && amount>0){
            balance-=amount;
            System.out.println("Amount Withdrawn"+amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
