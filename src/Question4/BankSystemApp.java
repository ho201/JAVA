package Question4;

import java.util.Arrays;
import java.util.Comparator;

public class BankSystemApp {

    public static void main(String[] args) {

        BankAccount[] accounts = {
                new SavingsAccount(1000, 5),
                new SavingsAccount(2000, 10),
                new CheckingAccount(3000),
                new CheckingAccount(4000)
        };

        SavingsAccount s1 = (SavingsAccount) accounts[0];
        SavingsAccount s2 = (SavingsAccount) accounts[1];

        CheckingAccount c1 = (CheckingAccount) accounts[2];
        CheckingAccount c2 = (CheckingAccount) accounts[3];

        // Deposit and Withdraw
        s1.deposit(500);
        s1.withdraw(200);

        s2.deposit(300);
        s2.withdraw(100);

        // Add Interest
        s1.addInterest();
        s2.addInterest();

        System.out.println("Savings Accounts:");
        System.out.println(s1.getBalance());
        System.out.println(s2.getBalance());

        System.out.println("-----------------------------------------------");

        // Transfers
        c1.transfer(s1, 500);
        c1.transfer(c2, 300);

        // Deduct Fees
        c1.deductFees();
        c2.deductFees();

        System.out.println("Balances After Transfers and Fees:");

        for (BankAccount account : accounts) {
            System.out.println(account.getBalance());
        }

        // Sort Descending
        Arrays.sort(accounts, new Comparator<BankAccount>() {

            @Override
            public int compare(BankAccount a, BankAccount b) {
                return Double.compare(b.getBalance(), a.getBalance());
            }
        });

        System.out.println("Accounts After Sorting:");

        for (BankAccount account : accounts) {
            System.out.println(account.getBalance());
        }
    }
}