public class DiscountRemove implements Commands{

    private final Discount discount;

    public DiscountRemove(Discount discount){
        this.discount = discount;
    }
    public void apply() {
        discount.remove();
    }

}
