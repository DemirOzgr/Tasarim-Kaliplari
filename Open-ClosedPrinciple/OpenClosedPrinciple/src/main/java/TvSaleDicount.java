public class TvSaleDicount implements Discount {

    private double tvPoint;
    private double tvPrice;
    private double customerPoint;
    private double dailyDiscount;

    public double getTvPoint() {
        return tvPoint;
    }

    public void setTvPoint(double tvPoint) {
        this.tvPoint = tvPoint;
    }

    public double getTvPrice() {
        return tvPrice;
    }

    public void setTvPrice(double tvPrice) {
        this.tvPrice = tvPrice;
    }

    public double getCustomerPoint() {
        return customerPoint;
    }

    public void setCustomerPoint(double customerPoint) {
        this.customerPoint = customerPoint;
    }

    public double getDailyDiscount() {
        return dailyDiscount;
    }

    public void setDailyDiscount(double dailyDiscount) {
        this.dailyDiscount = dailyDiscount;
    }

    public double getDiscount() {
        return (customerPoint*tvPoint+(dailyDiscount)-(tvPrice*(0.1)))*(0.9);
    }
}
