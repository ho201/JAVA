package Question4;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() {
        //حساب الفايدة
        setBalance(getBalance() + (getBalance() * interestRate / 100));
    }
}