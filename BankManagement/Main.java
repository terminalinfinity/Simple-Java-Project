package BankManagement;

public class Main {
    public static void main(String[] args) {
        BankManagementSystem bankManagementSystem = new BankManagementSystem();

        bankManagementSystem.addAccount("Savings", 1000);
        bankManagementSystem.addAccount("Checking", 500);

        bankManagementSystem.displayAllAccounts();

        bankManagementSystem.deposit(1, 500);
        bankManagementSystem.withdraw(1, 2000);

        bankManagementSystem.withdraw(2, 1000);

        bankManagementSystem.displayAllAccounts();
    }
}
