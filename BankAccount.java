public class BankAccount {
    //attributes
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalBalance = 0; //checkingBalance + savingsBalance

    //constructor
    BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance; //Or should they be self?
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
    }

    //methods
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsAccount() {
        return this.savingsBalance;
    }

    public double depositChecking(double depositAmount) {
        checkingBalance = checkingBalance + depositAmount;
        System.out.println("Updated Checking Balance: " + checkingBalance);
        return this.checkingBalance;
    }

    public double depositSavings(double depositAmount) {
        savingsBalance = savingsBalance + depositAmount;
        System.out.println("Updated Savings Balance: " + this.savingsBalance);
        return this.savingsBalance;
    }

    public double withdrawChecking(double withdrawAmount) {
        if (checkingBalance > withdrawAmount) {
            this.checkingBalance = checkingBalance - withdrawAmount;
            System.out.println("Updated Checking Balance: " + this.checkingBalance);
        } else {
            System.out.println("Insufficient funds");
        }
        return this.checkingBalance;
    }

    public double withdrawSavings(double withdrawAmount) {
        if (savingsBalance > withdrawAmount) {
            this.savingsBalance = savingsBalance - withdrawAmount;
            System.out.println("Updated Savings Balance: " + this.savingsBalance);
        } else {
            System.out.println("Insufficient funds");
        }
        return this.savingsBalance;
    }

    public double veiwTotalBalance() {
        totalBalance = checkingBalance + savingsBalance;
        System.out.println("Toatl Balance is: " + totalBalance);
        return totalBalance;
    }
}

