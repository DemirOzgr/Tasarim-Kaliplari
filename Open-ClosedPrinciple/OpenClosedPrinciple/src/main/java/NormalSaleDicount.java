public class NormalSaleDicount implements Discount{

    private double customerPoint;
    private double dailyDiscount;
    private double productPoint;
    private double productAmount;

    public double getDiscount() {
        return ((customerPoint*productPoint)+(dailyDiscount)-(productAmount/5.0))*0.9;
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

    public double getProductPoint() {
        return productPoint;
    }

    public void setProductPoint(double productPoint) {
        this.productPoint = productPoint;
    }

    public double getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(double productAmount) {
        this.productAmount = productAmount;
    }
}
