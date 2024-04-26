class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of Rs " + amount + " successful.");
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of Rs " + amount + " successful.");
        }
        else 
        {
            throw new InsufficientFundsException("Not Sufficient Funds. Available balance: Rs " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Account account = new Account(25000);

        try {
            account.withdraw(20000);
            account.withdraw(4000);
            account.withdraw(1001); // This should throw an exception
        } catch (InsufficientFundsException e) {
       System.out.println("Exception caught: " + e.getMessage());
        }
    System.out.println("Final balance: Rs " + account.getBalance());
    }
}
