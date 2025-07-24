package org.example.designpattternscode.Dependency_Injection;

public class PaymetProcess {
    private PaymentStrategy paymentStrategy;

    public PaymetProcess(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(double amount){
        System.out.println("Checking out ...");
        paymentStrategy.pay(amount);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }


}
