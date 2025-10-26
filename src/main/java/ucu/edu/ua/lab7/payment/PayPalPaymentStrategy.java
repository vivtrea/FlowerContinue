package ucu.edu.ua.lab7.payment;

public class PayPalPaymentStrategy implements Payment {
    private double COMMISION = 5.;
    @Override
    public double pay(double price) {
        return price + COMMISION;
    }
}
