import java.math.BigDecimal;

public class OrderService {

    public static void main(String[] args) {

        Order order = new Order.OrderBuilder().userName("ozgur").customerId("1").msisdn("11111111").customerEmail("160202072@kocaeli.edu.tr")
              .orderState("Siparis kargoda").deliveryAdress("İstanbul").totalPrice(BigDecimal.TEN).build();

        Order order1 = new Order.OrderBuilder().userName("demir").customerId("2").msisdn("04234124")
                .orderState("Siparis Teslim Edildi").totalPrice(BigDecimal.TEN).build();

        System.out.println(order);
        System.out.println(order1);
    }
}
