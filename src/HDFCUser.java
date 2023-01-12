import java.util.Objects;
import java.util.UUID;

public class HDFCUser implements BankInterface {

    private String name;
    private String accountNo;
    private String password;
    private double balance;
    private static double rateOfInterest;

    // Constructor


    public HDFCUser(String name,  double balance, String password) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateOfInterest = 7.0;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        HDFCUser.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "Your balance is ; " + balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance){
                return "Insufficient balance";
            }
            else{
                balance = balance-amount;
                return "Amount withdrawn, your balance is :"+ balance;
            }
        }
        else {
            return "Wrong Password, please enter the correct password";
        }

    }

    @Override
    public double calculateInterest(int years) {
        double interest = (balance*years*rateOfInterest)/100;
        return interest;
    }
}
