package Accounts_package;
public abstract  class accounts {
    
    private int accountNumber;
    private double balance;
    public abstract void showInfo();

    
    // ACCOUNT NUMBER SECTION
    protected void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }

    // BALANCE SECTION 
    protected void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }

    

}