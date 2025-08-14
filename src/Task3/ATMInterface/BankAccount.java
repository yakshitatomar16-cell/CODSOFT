package Task3.ATMInterface;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit successfully! Amount added: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Amount withdrawn: ₹" + amount);
            return true;
        } else if(amount > balance) {
            System.out.println("Insufficient balance. Current balance: ₹" + balance);
        } else {
            System.out.println("Invalid withdrawal amount. ");
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
