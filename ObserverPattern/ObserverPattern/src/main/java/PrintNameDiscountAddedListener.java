public class PrintNameDiscountAddedListener implements DiscountAddedListener {

    public void onDiscountAdded(Discount discount) {
        System.out.println("Yeni bir indirim eklendi '" + discount.getName() + "'");
    }
}
