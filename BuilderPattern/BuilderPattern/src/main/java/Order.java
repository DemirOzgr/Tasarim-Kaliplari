import java.math.BigDecimal;

public class Order {

    private final String msisdn;
    private final String customerId;
    private final String userName;
    private final String customerEmail;
    private final String deliveryAdress;
    private final String orderState;
    private final BigDecimal totalPrice;

    public String getMsisdn() {
        return msisdn;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getUserName() {
        return userName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public String getOrderState() {
        return orderState;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public Order(OrderBuilder orderBuilder) {
        this.msisdn = orderBuilder.msisdn;
        this.customerId = orderBuilder.customerId;
        this.userName = orderBuilder.userName;
        this.customerEmail = orderBuilder.customerEmail;
        this.deliveryAdress = orderBuilder.deliveryAdress;
        this.orderState = orderBuilder.orderState;
        this.totalPrice = orderBuilder.totalPrice;
    }
    @Override
    public String toString() {
        return "Order: " + this.msisdn + ", " + this.customerId + ", " + this.userName + ", " + this.customerEmail + ", " + this.deliveryAdress
                + ", " + this.orderState+ ", " + this.totalPrice;
    }

    public static class OrderBuilder{
        private String msisdn;
        private String customerId;
        private String userName;
        private String customerEmail;
        private String deliveryAdress;
        private String orderState;
        private BigDecimal totalPrice;

        public OrderBuilder() {
        }

        public OrderBuilder msisdn(String msisdn){
            this.msisdn = msisdn;
            return this;
        }
        public OrderBuilder customerId(String customerId){
            this.customerId = customerId;
            return this;
        }
        public OrderBuilder userName(String userName){
            this.userName = userName;
            return this;
        }
        public OrderBuilder customerEmail(String customerEmail){
            this.customerEmail = customerEmail;
            return this;
        }
        public OrderBuilder deliveryAdress(String deliveryAdress){
            this.deliveryAdress = deliveryAdress;
            return this;
        }
        public OrderBuilder orderState(String orderState){
            this.orderState = orderState;
            return this;
        }
        public OrderBuilder totalPrice(BigDecimal totalPrice){
            this.totalPrice = totalPrice;
            return this;
        }
        public Order build() {
            Order order = new Order(this);
            return order;
        }
    }
}