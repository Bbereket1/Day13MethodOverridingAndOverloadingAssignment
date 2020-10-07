import java.util.Scanner;

public class Main {
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

    Decrease accountBalance by $20.
    Print a message saying that the userId has been charged a late payment fee of $20 along with their new accountBalance


    Create a VipUser class to represent highly valued users (users with a lot of money) -
    this should inherit from the User class. No need to add additional fields (but you can if you want to).
    Override the latePayment() method to do the following:

    Print a warning to the user stating that they have an overdue balance that needs to be paid.


    Create a LowIncomeUser class that inherits from the User class. Override the latePayment() method to do the following:

    Decrease accountBalance by $40.
    Print a message saying the user has been charged a late payment fee of $40 along with their new accountBalance


    Bonus for 5 points

    Create a method called guessingGame(). Generate a random number from 0-10.
    Use the Scanner class to ask the user to guess the number. If they were wrong, print "Wrong.
    The correct number was " + the number. If they were right, print "Correct!"
     */
    public static void main(String[] args) {
        User firstUser = new User("Bereket", "Bekele", 333.7, "bb1022");
        LowIncomeUser secondUser = new LowIncomeUser("Max", "Adam", 90, "580AD22");
        VipUser thirdUser = new VipUser("Thomas", "Ben", 0, "56789");

        System.out.println(firstUser.getFirstName());
        firstUser.latePayment();
        secondUser.latePayment();
        thirdUser.latePayment();
        guessingGame();

    }
    public static void  guessingGame() {
        double num = Math.random()*11;
        System.out.println(num);
        Scanner S = new Scanner(System.in);
        System.out.println("Guess the number");
        int user = S.nextInt();

            if (user > 10) {
                System.out.println("Wrong. The correct number was " + num);
            } else {
                System.out.println("Correct!");
            }

    }

}
