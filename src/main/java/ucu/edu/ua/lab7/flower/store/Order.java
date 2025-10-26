package ucu.edu.ua.lab7.flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import ucu.edu.ua.lab7.delivery.Delivery;
import ucu.edu.ua.lab7.payment.Payment;

@Data
public class Order {
    private List<Item> items;

    private Delivery delivery;
    private Payment payment;

    public Order() {
        this.items = new ArrayList<>();
    }
    public void addItem(Item item){items.add(item);}

    public double getOrderFinalPrice() {
        double finalPrice = items.stream()
            .mapToDouble(Item::getPrice)
            .sum();
        finalPrice = payment.pay(finalPrice);
        finalPrice += delivery.delivery(finalPrice);
        return finalPrice;
    }
}
