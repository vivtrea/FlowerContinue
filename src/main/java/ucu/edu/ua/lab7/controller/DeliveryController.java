package ucu.edu.ua.lab7.controller;

import org.springframework.web.bind.annotation.*;
import ucu.edu.ua.lab7.delivery.*;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    @GetMapping("/postal")
    public double postal(@RequestParam double orderPrice) {
        Delivery delivery = new PostalDeliveryStrategy();
        return delivery.delivery(orderPrice);
    }

    @GetMapping("/dhl")
    public double dhl(@RequestParam double orderPrice) {
        Delivery delivery = new DHLDeliveryStrategy();
        return delivery.delivery(orderPrice);
    }
}
