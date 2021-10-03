public class MainBankAccount {
   
    public static void main(String[] args) {

        BankAccount owner1 = new BankAccount("Rory", 10000.0);
        
        BankAccount owner2 = new BankAccount("Dean", 5000.0);

        System.out.println(owner1.getOwner()+ "'s initial balance: "+ owner1.getBalance());
        System.out.println(owner2.getOwner()+ "'s initial balance: "+ owner2.getBalance());


        owner1.deposit(1000);
        System.out.println(owner1.getOwner()+ "'s new balance after deposit: "+ owner1.getBalance());

        owner2.withdraw(2500);
        System.out.println(owner2.getOwner()+ "'s new balance after withdraw: "+ owner2.getBalance());
    }



}
