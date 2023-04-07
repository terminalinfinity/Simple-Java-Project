package BankManagement;

public class Account {
    private int accountId;
    private String accountType;
    private double balance;

    public Account(int accountId, String accountType, double balance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                '}';
    }
}
