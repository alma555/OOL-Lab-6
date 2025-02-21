//Alma Thompson Jonathan Zhang
public class Bookstore extends Business {
    public Bookstore(String name) {
        super(name);
        addPaymentStrategy(new CreditCardPayment(null));
    }
}
