public class Bank1 { 
    static int currentBalance = 1000;
    public static void greetCustomer() {
        System.out.println("Hello, Welcome to the banking application");
    }
    public void deposit(int amount) {
        currentBalance = currentBalance + amount;
        System.out.println("Amount is deposited sucessfully");
    }    
    public static void withdrawl(int amount) {
        currentBalance = currentBalance - amount;
        System.out.println("Amount is withdrawl sucessfully");
    }
    public int getCurrentBalance() {
        return currentBalance;
    }
    public static void main(String[] args) {
        Bank1 bank = new Bank1();
        greetCustomer();
        System.out.println("Current balance is : "+bank.getCurrentBalance());
        bank.deposit(500);
        System.out.println("Current balance is : "+bank.getCurrentBalance());
        withdrawl(300);
        System.out.println("Current balance is : "+bank.getCurrentBalance());

    }

}
