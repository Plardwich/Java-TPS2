public class CheckingAccount extends Account {

    protected double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolder, double overdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.overdraftLimit = overdraft;
    }

    public double getOverDraftLimit() {
        return this.overdraftLimit;
    }
}
