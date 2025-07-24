package org.example.designpattternscode.Dependency_Injection;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment with amount :"+amount);
    }
}
