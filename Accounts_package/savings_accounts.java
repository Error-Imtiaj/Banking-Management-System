package Accounts_package;

public class savings_accounts extends accounts{
    private double interestRate;


    // CONSTRUCTOR METHOD
    savings_accounts(int accountNumber, double balance, double interestRate){
        setAccountNumber(accountNumber);
        setBalance(balance);
        setInterestRate(interestRate);
    }

    // SET INTEREST RATE 
    private void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    // GET INTEREST RATE
    protected double getIntersetRate(){
        return this.interestRate;
    }

    // SHOW ACCOUNT INFO 
    protected void showInfo(){
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: "+ interestRate);
        System.out.println("Account Number: "+ getAccountNumber());
        System.out.println("Account Balance: "+ getBalance());
    }
}
