public class Main {
    public static void main(String args[]) throws InsufficentFundsException {
        Account myAccount = new Account(12345, "Jason");

        System.out.println(myAccount.toString());
        myAccount.deposit(5.0);
        System.out.println(myAccount.toString());
        myAccount.withdraw(3.2);
        System.out.println(myAccount.toString());
    }
}
