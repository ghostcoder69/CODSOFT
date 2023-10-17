import java.util.*;
public class Task3
 {
    public static void main(String args[]) 
    {
        BankAccount userAccount = new BankAccount(1000.0); 
        ATM atm = new ATM(userAccount);
        System.out.println("Welcome to the ATM Machine");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    double balance = atm.checkBalance();
                    System.out.println("Current Balance: Rs." + balance);
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: Rs.");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: Rs.");
                    double withdrawalAmount = sc.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM! Have a great day and spend your money wisely :) ");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try Again!");
            }
        }
    }
}