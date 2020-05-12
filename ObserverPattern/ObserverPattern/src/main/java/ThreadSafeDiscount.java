import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ThreadSafeDiscount {

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    protected final Lock readLock = readWriteLock.readLock();
    protected final Lock writeLock = readWriteLock.writeLock();
    private List<Discount> discounts = new ArrayList();
    private List<DiscountAddedListener> listeners = new ArrayList();

    public void addDiscount (Discount discount) {
        this.discounts.add(discount);
        this.notifyDiscountAddedListeners(discount);
    }
    public DiscountAddedListener registerDiscountAddedListener (DiscountAddedListener listener) {
        this.writeLock.lock();
        try {
            this.listeners.add(listener);
        }
        finally {
            this.writeLock.unlock();
        }
        return listener;
    }
    public void unregisterDiscountAddedListener (DiscountAddedListener listener) {
        this.writeLock.lock();
        try {
            this.listeners.remove(listener);
        }
        finally {
            this.writeLock.unlock();
        }
    }
    public void notifyDiscountAddedListeners (Discount discount) {
        this.readLock.lock();
        try {
            this.listeners.forEach(listener -> listener.onDiscountAdded(discount));
        }
        finally {
            this.readLock.unlock();
        }
    }
}
