//Jonathan Zhang
public class Restaurant extends Business{
    public Restaurant(String name) {
        super(name);
        addPaymentStrategy(new CreditCardPayment(null));
        addPaymentStrategy(new CashPayment());
        addPaymentStrategy(new GiftCardPayment());
    }
}
