class ATM implements ATMOperations
 {
    private BankAccount account;
    public ATM(BankAccount account)
    {
        this.account = account;
    }
    @Override
    public void withdraw(double amount)
    {
        if (amount > 0 && account.withdraw(amount))
            System.out.println("Withdrawal successful. New balance: Rs." + account.getBalance());
        else
            System.out.println("Withdrawal failed. Insufficient funds.");
    }
    @Override
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            account.deposit(amount);
            System.out.println("Deposit successful. New balance: Rs." + account.getBalance());
        } 
        else
            System.out.println("Invalid deposit amount.");
    }
     @Override
    public double checkBalance()
    {
        return account.getBalance();
    }
}