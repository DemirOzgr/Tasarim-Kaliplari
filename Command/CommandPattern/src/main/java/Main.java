public class Main {
    public static void main(String[] args) {
        Discount discount = new Discount();

        DiscountAdd discountAdd = new DiscountAdd(discount);
        DiscountRemove discountRemove = new DiscountRemove(discount);

        Admin admin = new Admin();
        admin.Commander(discountAdd);
        admin.Commander(discountRemove);

        admin.giveACommand();
    }
}
