class BankAccount 
{
    private double balance;
    public BankAccount(double initialBalance) 
    {
        balance = initialBalance;
    }
    public double getBalance() 
    {
        return balance;
    }
    public void deposit(double amount) 
    {
        balance += amount;
    }
    public boolean withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            return true;
        }
        else
        return false;
    }
}