package ucu.edu.ua.lab7.delivery;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public double delivery(double orderPrice) {
        System.out.println("DHL delivery");
            if (orderPrice >200) {
                return 0;
            }
            return 150;
        }
    }

