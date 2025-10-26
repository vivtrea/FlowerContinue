package ucu.edu.ua.lab7.controller;

import org.springframework.web.bind.annotation.*;
import ucu.edu.ua.lab7.payment.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @GetMapping("/credit")
    public double payWithCredit(@RequestParam double price) {
        Payment payment = new CreditCardPaymentStrategy();
        return payment.pay(price);
    }

    @GetMapping("/paypal")
    public double payWithPayPal(@RequestParam double price) {
        Payment payment = new PayPalPaymentStrategy();
        return payment.pay(price);
    }
}
