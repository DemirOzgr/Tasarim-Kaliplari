public class MarketItemAdapter implements Product {

    private MarketItem marketItem;

    public MarketItemAdapter(MarketItem marketItem) {
        this.marketItem = marketItem;
    }

    public MarketItem getMarketItem() {
        return marketItem;
    }

    public void setMarketItem(MarketItem marketItem) {
        this.marketItem = marketItem;
    }

    public String getName() {
        return marketItem.getItemName();
    }

    public double getPrice() {
        return marketItem.getCostPerUnit();
    }

}
