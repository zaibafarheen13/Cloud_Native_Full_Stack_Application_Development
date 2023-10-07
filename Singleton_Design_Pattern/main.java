package Singleton_Design_Pattern;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Account{
    private final int accountNumber;
    private final  String accountHolder;
    private double balance;

    public Account(int accountNmber,String accountHolder,double balance){
        this.accountNumber=accountNmber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public synchronized void deposit(double amount){
        balance+=amount;
    }

    public synchronized boolean withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            return true;
        }
        return false;
    }

    public synchronized double getBalanace(){
        return balance;
    }
}


class AccountManager{
   private static final AccountManager INSTANCE=new AccountManager();
   private final Map<Integer,Account> accounts=new HashMap<>();

   private AccountManager(){};

   public static AccountManager getInstance(){
    return INSTANCE;
   }

   public synchronized void createAccount(int accountNumber,String accountHolder,double balance){
    if(!accounts.containsKey(accountNumber)){
        accounts.put(accountNumber,new Account(accountNumber, accountHolder, balance));
        System.out.println("Account created successfully");
    }
    else{
        System.out.println("Account already exists");
    }
   }

   public synchronized void deposit(int accountNmber,double amount){
        Account account=accounts.get(accountNmber);
        if(account!=null){
            account.deposit(amount);
            System.out.println("Amount deposited successuflly");
        }
        else{
            System.out.println("No such account exists");
        }
   }

   public synchronized void withdraw(int accountNmber,double balance){
        Account account=accounts.get(accountNmber);
        if(account!=null){
            if(account.withdraw(accountNmber)){
                System.out.println("Withdrawn successfully");
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        else{
            System.out.println("No such account exists");
        }
   }

   public synchronized double getBalanace(int accountNmber){
        Account account=accounts.get(accountNmber);
        if(account!=null){
            return account.getBalanace();
        }
        else{
             System.out.println("No such account exists");
        }
        return 0.0;
   }

}

public class main {
    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);
        AccountManager obj=AccountManager.getInstance();

        while(true){
            System.out.println("\nMenu\n1.Create Account\n2.Deposit\n3.Withdraw\n4.Get Balance\n5.Exit");
            System.out.print("Enter your choice: ");

            int choice=scan.nextInt();

            switch(choice){
                case 1:
                    obj.createAccount(101,"Siya", 5000.0);
                    break;
                
                case 2:
                    obj.deposit(101, 500.0);
                    break;
                
                case 3:
                    obj.withdraw(101,200.0);
                    break;  

                case 4:
                    double amt=obj.getBalanace(101);
                    System.out.println("Balance amount = "+amt);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

    }
}
