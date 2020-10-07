public class LowIncomeUser extends User {

    /*
    Create a LowIncomeUser class that inherits from the User class. Override the latePayment() method to do the following:

    Decrease accountBalance by $40.
    Print a message saying the user has been charged a late payment fee of $40 along with their new accountBalance

   */

    public LowIncomeUser(String firstName, String lastName, double accountBalance, String accountId) {
        super(firstName, lastName, accountBalance, accountId);

    }

    @Override
    public void latePayment() {
        //super.latePayment();
        getAccountBalance();
       System.out.println(this.getFirstName() + " has been charged a late payment fee of $40 along with " + getAccountBalance());

    }

}
