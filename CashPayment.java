//Alma Thompson
public class CashPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " with cash");
    }
}
