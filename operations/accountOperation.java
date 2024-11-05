import Accounts_package.accounts;
import Management_package.customers;

public class accountOperation extends customers {

    // INSERT ACCOUNT
    public void insertAccount(accounts a) {
        customerAccounts.add(a);
    }

    // DELETE ACCOUNT
    public void removeAccount(accounts a) {
        customerAccounts.remove(a);
    }

    // GET ACCOUNT

    accounts getAccounts(int accountNumber) {
        for (int i = 0; i < customerAccounts.size(); i++) {
            if (customerAccounts.get(i).getAccountNumber() == accountNumber) {
                return customerAccounts.get(i);
            }
        }
        return null;
    }

    // SHOW ALL ACCOUNT
    public void showAllAccount(){
        for (int i = 0; i < customerAccounts.size(); i++) {
            customerAccounts.get(i).showInfo();
        }
    }

}
