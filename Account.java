public class Account {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(){}

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficentFundsException {
        if ((this.balance - amount) < 0) {
            throw new InsufficentFundsException();
        }
        this.balance -= amount;
    }

    public String toString() {
        return "Account Number: " + this.accountNumber + "\n"
                + "Account Holder: " + this.accountHolder + "\n"
                + "Balance: " + round(this.balance);
    }

    private double round(double num) {
        return ((int) (num * 100)) / 100.0;
    }
}
