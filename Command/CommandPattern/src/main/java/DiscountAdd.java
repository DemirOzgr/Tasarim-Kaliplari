public class DiscountAdd implements Commands{

    private final Discount discount;

    public DiscountAdd(Discount discount){
        this.discount = discount;
    }
    public void apply() {
            discount.add();
    }
}
