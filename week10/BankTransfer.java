package week10;

public class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("BankTransfer: Processing payment of " + amount + " in default currency.");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("BankTransfer: Processing payment of " + amount + " in currency: " + currency);
    }
}
