public class RBI{
	
    private static double balance = 1300.24;

    public static void getAccountBalance(int accountNumber) {
       
        System.out.println("Account Balance = " + balance);
    }

    public static void getAccountHolderName(int accountNumber) {
        
        System.out.println("Account Holder Name = Rajeshwari");
    }

    public static void depositAmount(int accountNumber, double amount) {
        
        balance += amount;
        System.out.println("Balance after Deposit = " + balance);
    }

    public static void withdrawAmount(int accountNumber, double amount) {
     
        balance -= amount;
        System.out.println("Balance after Withdrawal = " + balance);
    }

    public static void getRemainingBalance(int accountNumber) {
      
        System.out.println("Remaining Balance = " + balance);
    }
}



