package org.example.designpattternscode.Dependency_Injection;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new PayPalPayment();
        PaymetProcess ps = new PaymetProcess(paymentStrategy);


        ps.checkout(1000);

        PaymentStrategy paymentStrategy1 = new CreditCardPayment();
        ps.setPaymentStrategy(paymentStrategy1);
        ps.checkout(1200);
    }
}