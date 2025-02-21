import java.util.*;

public abstract class Business {
    public String name;
    public List<PaymentStrategy> acceptedPayments;

    public Business(String name) {
        this.name = name;
        this.acceptedPayments = new ArrayList<>();
    }

    public void addPaymentStrategy(PaymentStrategy payment){
        this.acceptedPayments.add(payment);
    }

    public void processPayment(PaymentStrategy paymentType, double amount){
        if (acceptedPayments.stream().anyMatch(p -> p.getClass().equals(paymentType.getClass()))) {
            paymentType.processPayment(amount);
        }
        else{
            System.out.println("Payment not accepted");
        }
    }
}
