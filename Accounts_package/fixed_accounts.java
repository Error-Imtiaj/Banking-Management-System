package Accounts_package;

public class fixed_accounts extends accounts {
    
    private int tentureYear;

    // SET FIXED DEPOSIT ACCOUNT NUMBER AND BALANCE
    fixed_accounts(int accountNumber, double balance, int tentureYear){
        setAccountNumber(accountNumber);
        setBalance(balance);
        setTenture(tentureYear);
    }

    // SET TENTURE YEAR
    private void setTenture(int tentureYear){
        this.tentureYear = tentureYear;
    }

    // GET TENTURE YEAR
    protected int getTenture(){
        return this.tentureYear;
    }

    // SHOW ACCOUNT INFO 
    protected void showInfo(){
        System.out.println("Account Type: Fixed Account");
        System.out.println("Tenture Year: "+ tentureYear);
        System.out.println("Account Number: "+ getAccountNumber());
        System.out.println("Account Balance: "+ getBalance());
    }
}