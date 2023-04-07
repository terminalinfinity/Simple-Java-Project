package BankManagement;

import java.util.ArrayList;

public class BankManagementSystem {
    private ArrayList<Account> accounts = new ArrayList<>();
    private int nextAccountId = 1;

    public void addAccount(String accountType, double balance) {
        Account account = new Account(nextAccountId++, accountType, balance);
        accounts.add(account);
        System.out.println("Account added: " + account);
    }

    public void displayAllAccounts() {
        System.out.println("All Accounts:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public void displayAccount(int accountId) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                System.out.println("Account found: " + account);
                return;
            }
        }
        System.out.println("Account not found for accountId: " + accountId);
    }

    public void deposit(int accountId, double amount) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                account.deposit(amount);
                System.out.println("New balance: " + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found for accountId: " + accountId);
    }

    public void withdraw(int accountId, double amount) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                account.withdraw(amount);
                System.out.println("New balance: " + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found for accountId: " + accountId);
    }
}
