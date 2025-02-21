
public class SmallBusiness extends Business {

    public SmallBusiness(String name) {
        super(name);
        addPaymentStrategy(new CreditCardPayment(null));
        addPaymentStrategy(new CashPayment());
    }
}
