//Alma Thompson
public class GiftCardPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " with a gift card");
    }
}
