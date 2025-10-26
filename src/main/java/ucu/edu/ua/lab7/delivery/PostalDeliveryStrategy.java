package ucu.edu.ua.lab7.delivery;

public class PostalDeliveryStrategy implements Delivery{

    @Override
    public double delivery(double orderPrice) {
        System.out.println("Postal delivery");
        if (orderPrice >100) {
            return 0;
        }
        return 100;
    }

}
