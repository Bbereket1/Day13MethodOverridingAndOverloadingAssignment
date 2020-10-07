public class User {

    /*

    Banks hire delinquency payments (late payments) differently for different types of users.
    For example, a user with low income and a small amount in their account will be penalized
    more than a wealthy user with a lot of money. Create a User class - this will be the
    super class that all other classes inherit from. Add the following fields:



        firstName
        lastName
        accountBalance
        accountId

    Add a constructor, getters, setters. And add the a latePayment() method that does the following:
     */

    private String firstName;
    private String lastName;
    private double accountBalance;
    private String accountId;

    public User(String firstName, String lastName, double accountBalance, String accountId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = accountBalance;
        this.accountId = accountId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance() {
        this.accountBalance = accountBalance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {

        this.accountId = accountId;
    }
    public void latePayment(){
        this.accountBalance -= 20;
        System.out.println(this.getFirstName() + " has been charged a late payment fee of $20 along with " + "$"+ accountBalance +".");
    }

}
