package ucu.edu.ua.lab7.payment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentTests {

    private static final double PRICE = 100.0;
    private static final double CREDIT_CARD_COMMISSION = 3.0;
    private static final double PAYPAL_COMMISSION = 5.0;

    @Test
    void testCreditCardPayment() {
        Payment payment = new CreditCardPaymentStrategy();
        double result = payment.pay(PRICE);
        assertEquals(PRICE + CREDIT_CARD_COMMISSION, result);
    }

    @Test
    void testPayPalPayment() {
        Payment payment = new PayPalPaymentStrategy();
        double result = payment.pay(PRICE);
        assertEquals(PRICE + PAYPAL_COMMISSION, result);
    }
}
