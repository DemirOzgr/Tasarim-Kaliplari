public class SportProduct implements Product{

    String itemName;
    double costPerUnit;

    public SportProduct(String itemName, double costPerUnit) {
        this.itemName = itemName;
        this.costPerUnit = costPerUnit;
    }

    public String getName() {
        return itemName;
    }

    public double getPrice() {
        return costPerUnit;
    }
}
