import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        NormalSaleDicount normalSaleDicount = new NormalSaleDicount();
        normalSaleDicount.setCustomerPoint(Double.valueOf(5));
        normalSaleDicount.setDailyDiscount(Double.valueOf(4));
        normalSaleDicount.setProductAmount(Double.valueOf(100));
        normalSaleDicount.setProductPoint(Double.valueOf(25));

        TelesalesDiscount telesalesDiscount = new TelesalesDiscount();
        telesalesDiscount.setCustomerPoint(Double.valueOf(10));
        telesalesDiscount.setDailyDiscount(Double.valueOf(5));
        telesalesDiscount.setTelesalesPoint(Double.valueOf(20));

        TvSaleDicount tvSaleDicount = new TvSaleDicount();
        tvSaleDicount.setCustomerPoint(Double.valueOf(15));
        tvSaleDicount.setDailyDiscount(Double.valueOf(10));
        tvSaleDicount.setTvPoint(Double.valueOf(1));
        tvSaleDicount.setTvPrice(Double.valueOf(30));

        ArrayList<Discount> arrayList = new ArrayList<Discount>();
        arrayList.add(normalSaleDicount);
        arrayList.add(telesalesDiscount);
        arrayList.add(tvSaleDicount);


        DiscountService discountService = new DiscountService();
        System.out.println(discountService.calculateDiscount(arrayList));
    }
}
