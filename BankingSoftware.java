import java.util.Scanner;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public void showBalance() {
        System.out.printf("Current Balance: $%.2f%n", balance);
    }
}

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 100.00;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f to Savings Account%n", amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            System.out.printf("Withdrew $%.2f from Savings Account%n", amount);
        } else {
            System.out.println("Invalid withdrawal amount or minimum balance requirement not met");
        }
    }
}

class CreditCardAccount extends BankAccount {
    private static final double CREDIT_LIMIT = 5000.00;

    public CreditCardAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance -= amount; // Paying down credit card balance
            System.out.printf("Paid $%.2f to Credit Card Account%n", amount);
        } else {
            System.out.println("Invalid payment amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + amount) <= CREDIT_LIMIT) {
            balance += amount; // Increasing credit card debt
            System.out.printf("Charged $%.2f to Credit Card Account%n", amount);
        } else {
            System.out.println("Invalid charge amount or credit limit exceeded");
        }
    }

    @Override
    public void showBalance() {
        System.out.printf("Current Credit Card Balance: $%.2f (Available Credit: $%.2f)%n",
                balance, CREDIT_LIMIT - balance);
    }
}

public class BankingSoftware {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize accounts
        SavingsAccount savings = new SavingsAccount(500.00);
        CreditCardAccount creditCard = new CreditCardAccount(0.00);

        while (true) {
            System.out.println("\nBanking Software Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Thank you for using our banking software!");
                break;
            }

            System.out.println("\nSelect Account Type:");
            System.out.println("1. Savings Account");
            System.out.println("2. Credit Card Account");
            System.out.print("Enter account type: ");
            int accountType = scanner.nextInt();

            BankAccount account = (accountType == 1) ? savings : creditCard;

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.showBalance();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}