// import java.util.Scanner;

public class BankAccount {
   private String owner;
   private double balance;
   
    
   BankAccount(String owner, double initBalance){
        this.owner = owner;
        // this.balance = balance;

        // let's make the balance positive only.
        this.balance = Math.max(initBalance, 0);
   }
   
   public double withdraw(double amount){

    if(amount <= this.balance){
        this.balance = this.balance - amount;
        return amount;
    }
    return 0;

   }

   public double deposit(double amount){
        if(amount > 0){
            this.balance = this.balance + amount;
            return amount;
        }
        return 0;
   }

   public String getOwner(){
       return owner;
   }

   public double getBalance(){
       return balance;
   }
}
