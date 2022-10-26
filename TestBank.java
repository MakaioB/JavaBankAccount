public class TestBank {
    public static void main(String[] args) {
        BankAccount appTest = new BankAccount(200.00, 1000.00);

        System.out.println(" ");
        System.out.printf("Your Checking Account Balance Is: $%s", appTest.getCheckingBalance());

        System.out.println(" ");
        System.out.printf("Your Savings Account Balance Is: $%s", appTest.getSavingsAccount());

        appTest.depositChecking(50.00);

        appTest.depositSavings(100.00);

        appTest.withdrawChecking(150.00);
        appTest.withdrawChecking(300.00);

        appTest.withdrawSavings(300.00);
        appTest.withdrawSavings(3000.00);

        appTest.veiwTotalBalance();
    }
}
