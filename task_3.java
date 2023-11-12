import java.util.*;

class ATM{
    public static int balance;
    public static void withdraw(int amount){
        if(balance<amount)
        {
            System.out.println("Insufficient Balance:(");
            return;
        }
        else{
            balance = balance - amount;
             System.out.println("Withdrawl Successful:)");
        }
        
    }
    public static void deposit(int amount){
        balance = balance + amount;
         System.out.println("Transaction Successful.");
        
        
    }
    public static void checkBalance(){
        System.out.println("Balance : "+balance);
    }
}

class user_bank_account{
    static String user_name = "";
    static int account_number;
   
    public static void get_info()
    {
        ATM atm_obj = new ATM();
        System.out.println("\t\t***Enter Your Bank Details:***");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Account Holder Name:");
        user_name = sc.nextLine();
        System.out.println("Enter the Bank Account Number :");
        account_number = sc.nextInt();
        System.out.println("Min deposit of $500:\nEnter Y to continue or N to exit.");
        atm_obj.balance = atm_obj.balance + 500;
        char ch = sc.next().charAt(0);
        if(ch == 'Y' || ch == 'y')
        {
            return;
        }
        else{
            System.exit(0);
        }
    }
}

class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        user_bank_account user_obj = new user_bank_account();
        ATM atm_obj = new ATM();
        System.out.println("\t\t\t\t~~~~Welcome~~~~");
        System.out.println("To proceed further enter your basic bank details first: ");
        user_obj.get_info();
        while(true)
        {
             System.out.println("1.Withdraw Money\n2.Deposit Money\n3.Check Balance");
             int ch = sc.nextInt();
             if(ch==1)
             {
                 System.out.println("Enter the amount you like to Withdraw");
                 int amount = sc.nextInt();
                 atm_obj.withdraw(amount);
             }
             else if(ch==2)
             {
                  System.out.println("Enter the amount you like to Deposit");
                 int amount = sc.nextInt();
                 atm_obj.deposit(amount);
             }
             else if(ch==3){
                 atm_obj.checkBalance();
            }
            else{
                 System.out.println("Invalid choice");
                 System.exit(0);
            }
        }
    }
}
