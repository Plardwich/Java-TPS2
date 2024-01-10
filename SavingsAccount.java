public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }
}
