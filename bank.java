import java.util.Scanner;

public class bank {
    private static void menu() {
        System.out.println("1. Employee Management\r\n" + //
                "2. Customer Management\r\n" + //
                "3. Customer Account Management\r\n" + //
                "4. Account Transactions\r\n" + //
                "5. Exit\n\n");
    }

    private static void employeeMenu() {
        System.out.println("1. Insert New Employee 2. Remove Existing Employee 3. Show All Employees\r");
    }

    private static void customerManagemenu() {
        System.out.println("1. Insert New Customer 2. Remove Existing Customer 3. Show All Customer");
    }

    private static void customerAccountManagementmenu() {
        System.out.println("1. Insert New Account 2. Remove Existing Account 3. Show All Accounts\r");
    }

    private static void transactionMenu() {
        System.out.println("1. Deposit Money 2. Withdraw Money 3. Transfer Money");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OUTER: while (true) {
            menu();
            System.out.println("Please Select your command");
            int command = input.nextInt();
            switch (command) {
                case 1 -> employeeMenu();

                case 2 -> customerManagemenu();
                case 3 -> customerAccountManagementmenu();
                case 4 -> transactionMenu();
                case 5 -> {
                    break OUTER;
                }
                default -> System.out.println("Invalid Command");

            }

        }
    }
}
