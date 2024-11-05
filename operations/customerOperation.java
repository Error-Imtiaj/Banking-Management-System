import Management_package.customers;
import java.util.*;

public class customerOperation {
    int i = 0;
    customers[] customerList;

    // INSERT CUSTOMER
    public void insertCustomer(customers c) {
        customerList[i] = c;
        i++;
    }

    // REMOVE CUSTOMER
    public void removeCustomer(customers c) {
        for (int j = 0; j < customerList.length; j++) {
            if (customerList[j].getNid() == c.getNid()) {
                customerList[j] = customerList[i - 1];
                i--;
                break;
            }
        }
    }

    // CUSTOMER INFO GET
    public customers getCustomer(int nid) {
        for (int k = 0; k < customerList.length; k++) {
            if (customerList[k].getNid() == nid) {
                return customerList[k];
            }
        }
        return null;
    }

    // SHOW ALL CUSTOMER
    public void showAllCustomer() {
        for (int j = 0; j < customerList.length; j++) {
            System.out.println(
                    "Customer Name: " + customerList[j].getName() + "\nCustomer Id: " + customerList[j].getNid());
        }
    }
}