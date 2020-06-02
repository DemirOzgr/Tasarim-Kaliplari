import java.util.ArrayList;
import java.util.List;

public class DiscountService {

    ArrayList<Double> arrayList = new ArrayList<Double>();
    double price;
    public List calculateDiscount(List<Discount> discounts) {
        for (Discount discount: discounts){
            price = discount.getDiscount();
            arrayList.add(price);
        }
        return arrayList;
    }
}
