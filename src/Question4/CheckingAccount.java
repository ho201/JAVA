package Question4;

public class CheckingAccount extends BankAccount {

    private int transactionCount;
//  عدد العمليات اللي اتعملت على الحساب الحالي

    static int noOfFreeTransaction = 3;
//    عدد العمليات المجانية المسموح بيها
    static double transactionFees = 10;
//    الرسوم اللي البنك بياخدها على كل عملية زيادة عن عدد العمليات المجانية

    public CheckingAccount(double balance) {
        super(balance);
        transactionCount = 0;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
    }

    @Override
    public void transfer(BankAccount someone, double amount) {
        super.transfer(someone, amount);
        transactionCount++;
    }

    public void deductFees() {
        int Transactions = transactionCount - noOfFreeTransaction;

        if (Transactions > 0) {
            double fees = Transactions * transactionFees;
            setBalance(getBalance() - fees);
        }

        transactionCount = 0;
    }
}