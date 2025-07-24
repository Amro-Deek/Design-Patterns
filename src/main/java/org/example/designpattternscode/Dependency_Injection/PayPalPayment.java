package org.example.designpattternscode.Dependency_Injection;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Pay Pal Payment with amount : "+amount);
    }
}
