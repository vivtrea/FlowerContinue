package ucu.edu.ua.lab7.delivery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeliveryTests {

    private static final double PRICE_SMALL = 50.0;
    private static final double PRICE_BIG = 150.0;
    private static final double POST_DELIVERY_FEE = 100.0;
    private static final double DHL_DELIVERY_FEE = 150.0;

    @Test
    void testPostalDelivery() {
        Delivery delivery = new PostalDeliveryStrategy();

        assertEquals(POST_DELIVERY_FEE, delivery.delivery(PRICE_SMALL));
        assertEquals(0, delivery.delivery(PRICE_BIG)); // free over 100
    }

    @Test
    void testDHLDelivery() {
        Delivery delivery = new DHLDeliveryStrategy();

        assertEquals(DHL_DELIVERY_FEE, delivery.delivery(PRICE_SMALL));
        assertEquals(0, delivery.delivery(250)); // free over 200
    }
}
