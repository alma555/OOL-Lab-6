//Jonathan Zhang
public class CreditCardPayment implements PaymentStrategy{
    public String credCardName;

    public CreditCardPayment(String name) {
        this.credCardName = name;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " with a " + this.credCardName + " credit card");
    }
}
