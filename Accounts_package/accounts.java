package Accounts_package;
public abstract  class accounts {
    
    private int accountNumber;
    private double balance;
    
    // ACCOUNT NUMBER SECTION
    protected void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    protected int getAccountNumber(){
        return this.accountNumber;
    }

    // BALANCE SECTION 
    protected void setBalance(double balance){
        this.balance = balance;
    }
    protected double getBalance(){
        return this.balance;
    }

}