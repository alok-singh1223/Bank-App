public interface BankAccountInterface {
    String fetchBalance(String password);
    String tranjactionMoney(double amount);
    String withDrawMoney(double amount, String password);
    String changePassword(String oldPassword, String newPassword);
    double calculateInterest(int year);
}
