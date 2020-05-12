public class ThreadObserveTestService {

    public static void main (String[] args) {

        ThreadSafeDiscount threadSafeDiscount = new ThreadSafeDiscount();
        ThreadSafeDiscount threadSafeDiscount1 = new ThreadSafeDiscount();

        threadSafeDiscount1.registerDiscountAddedListener(new PrintNameDiscountAddedListener());
        threadSafeDiscount1.registerDiscountAddedListener(new ThreadSafeCountingDiscountAddedListener());
        threadSafeDiscount.registerDiscountAddedListener(new PrintNameDiscountAddedListener());
        threadSafeDiscount.registerDiscountAddedListener(new ThreadSafeCountingDiscountAddedListener());

        threadSafeDiscount.addDiscount(new Discount("Gomlek"));
        threadSafeDiscount.addDiscount(new Discount("Pantolon"));
        threadSafeDiscount1.addDiscount(new Discount("Sapka threadSafeDiscount1"));
        threadSafeDiscount.addDiscount(new Discount("Gozluk"));
        threadSafeDiscount1.addDiscount(new Discount("Etek threadSafeDiscount1"));
        threadSafeDiscount.addDiscount(new Discount("Sort"));


    }
}
