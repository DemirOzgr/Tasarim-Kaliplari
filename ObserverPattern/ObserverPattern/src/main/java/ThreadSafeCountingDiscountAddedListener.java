import java.util.concurrent.atomic.AtomicLong;

public class ThreadSafeCountingDiscountAddedListener implements DiscountAddedListener{

    private static AtomicLong discountsAddedCount = new AtomicLong(0);

    public void onDiscountAdded (Discount discount) {
        discountsAddedCount.incrementAndGet();
        System.out.println("Toplam eklenen indirim adedi: " + discountsAddedCount);
    }
}
