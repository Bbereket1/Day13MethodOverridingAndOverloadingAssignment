public class VipUser extends User{
    /*
    Create a VipUser class to represent highly valued users (users with a lot of money) -
    this should inherit from the User class. No need to add additional fields (but you can if you want to).
    Override the latePayment() method to do the following:

    Print a warning to the user stating that they have an overdue balance that needs to be paid.
     */
    public VipUser(String firstName, String lastName, double accountBalance, String accountId) {
        super(firstName, lastName, accountBalance, accountId);
    }


    @Override
    public void latePayment() {
        //super.latePayment();
        System.out.println("WARNING: " + this.getFirstName() + " has an overdue balance that needs to be paid.");
    }
}
