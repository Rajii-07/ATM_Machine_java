package ATM_Machine_JAVA;

public class Main {
    public static void main(String[]args){
        Account account=new Account("1234567", 10000);
        ATM atm=new ATM(account);
        atm.start();

    }
}
