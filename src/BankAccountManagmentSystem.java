import java.util.HashMap;
import java.util.Map;

public class BankAccountManagmentSystem {

    private final Map< String,Double> accounts;

    public BankAccountManagmentSystem(){
        accounts  = new HashMap<>();
    }
             public void creatAccount(String accountNumber) {
                 if (accounts.containsKey(accountNumber)) {
                     System.out.println("Account already exists.");
                 } else {
                     accounts.put(accountNumber, 0.0);
                     System.out.println("Account created successfully.");
                 }
             }

               public void deposit (String accountNumber , double amount){
                   if (accounts.containsKey(accountNumber)){
                       double balance = accounts.get(accountNumber);
                       balance += amount ;
                       accounts.put(accountNumber,balance);
                       System.out.println("Deposit successful.");
                   }else {
                       System.out.println("Account does not exist.");
                   }
                 }

               public void withdraw (String accountNumber , double amount){
                   if (accounts.containsKey(accountNumber)){
                       double balance = accounts.get(accountNumber);
                    if(balance >= amount) {
                        balance -= amount;
                        accounts.put(accountNumber, balance);
                        System.out.println("(Withdrawal successful.");
                    }else {
                        System.out.println("Insufficient balance.");
                    }
                   }else{
                       System.out.println("Account does not exist.");
                   }
                 }

               public void checkBalance (String accountNumber){
                   if(accounts.containsKey(accountNumber)){
                    double balance = accounts.get(accountNumber);
                       System.out.println("Account Balance: "+ balance);
                   }else {
                       System.out.println("Account does not exist");
                   }





                 }


    }







