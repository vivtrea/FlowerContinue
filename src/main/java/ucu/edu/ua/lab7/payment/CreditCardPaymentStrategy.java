package ucu.edu.ua.lab7.payment;

public class CreditCardPaymentStrategy implements Payment {
    private double COMMISION = 3.;
    @Override
    public double pay(double price) {
        return price + COMMISION;
    }
}

