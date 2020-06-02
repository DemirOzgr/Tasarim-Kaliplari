public class TelesalesDiscount implements Discount{

    private double telesalesPoint;
    private double customerPoint;
    private double dailyDiscount;

    public double getTelesalesPoint() {
        return telesalesPoint;
    }

    public void setTelesalesPoint(double telesalesPoint) {
        this.telesalesPoint = telesalesPoint;
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
        return (telesalesPoint*customerPoint+(dailyDiscount))*(0.9);
    }
}
