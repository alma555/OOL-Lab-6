public class CreditCardPayment implements PaymentStrategy{
    public String credCardName;

    public CreditCardPayment(String name) {
        this.credCardName = name;
    }
    
    @Override
    public void processPayment(double amount) {

    }
}
