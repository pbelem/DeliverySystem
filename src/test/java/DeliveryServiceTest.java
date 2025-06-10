import com.belem.DeliveryService;
import com.belem.Order;
import com.belem.OrderStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DeliveryServiceTest {
    private DeliveryService deliveryService;
    private Order order;

    @BeforeEach
    void setUp() {
        deliveryService = new DeliveryService();
        order = new Order("123", 10.0);
    }

    @Test
    void testCalculateFreight_ValidDistance() {
        double freight = deliveryService.calculateFreight(order);
        assertEquals(25.0, freight, "Frete deve ser 10km * 2.5 = 25.0");
    }

    @Test
    void testCalculateFreight_ZeroDistance() {
        Order invalidOrder = new Order("124", 0.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            deliveryService.calculateFreight(invalidOrder);
        });
        assertEquals("Distância deve ser maior que zero", exception.getMessage());
    }

    @Test
    void testUpdateStatus() {
        deliveryService.updateStatus(order, OrderStatus.PROCESSING);
        assertEquals(OrderStatus.PROCESSING, order.getStatus(), "Status deve ser atualizado para PROCESSING");
    }
}