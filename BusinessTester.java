public class BusinessTester {
    public static void main(String[] args) {
        Business trinkets = new SmallBusiness("Trinkets Shop");
        Business burgerStand = new Restaurant("Burger Stand");
        Business bookstore = new Bookstore("Books Galore");

        PaymentStrategy creditCard = new CreditCardPayment("Visa");
        PaymentStrategy cash = new CashPayment();
        PaymentStrategy giftCard = new GiftCardPayment();

        System.out.println("Trying out the credit card...");

        trinkets.processPayment(creditCard, 4.27);
        burgerStand.processPayment(creditCard, 8.00);
        bookstore.processPayment(creditCard, 12.99);

        System.out.println("Trying out the cash...");
        trinkets.processPayment(cash, 7.00);
        burgerStand.processPayment(cash, 3.00);
        bookstore.processPayment(cash, 3.00);

        System.out.println("Trying out the gift card...");
        trinkets.processPayment(giftCard, 5.00);
        burgerStand.processPayment(giftCard, 6.00);
        bookstore.processPayment(giftCard, 6.00);
    }
}
