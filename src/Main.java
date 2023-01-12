import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        System.out.println("Enter your balance:");
        double balance = sc.nextDouble();

        //SBIUser user = new SBIUser(name, balance, password);
        HDFCUser user = new HDFCUser(name,balance,password);

        // add amount

        System.out.println("Enter amount to add to your account: ");
        int amt = sc.nextInt();
        String message = user.addMoney(amt);
        System.out.println(message);

        // withdraw
        System.out.println("Enter amount to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter the password");
        String pass = sc.next();

        System.out.println(user.withdrawMoney(money, pass));

        // rate of Interest
        System.out.println("Enter the number of years for the interest:");
        int y = sc.nextInt();
        System.out.println("The Interest after " +y +" years will be: "+user.calculateInterest(y)+" rupees");



    }
}

