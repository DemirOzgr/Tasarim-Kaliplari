public class Main {
    public static void main(String[] args){

        ShopInventory inventory = new ShopInventory();

        inventory.addProduct(new SportProduct("Ball", 75));

        MarketItem marketItem = new MarketItem("Tea", 50);
        inventory.addProduct(new MarketItemAdapter(marketItem));

        System.out.println(inventory.getProducts().get(0).getName()+"  "+inventory.getProducts().get(0).getPrice());
        System.out.println(inventory.getProducts().get(1).getName()+"  "+inventory.getProducts().get(1).getPrice());

    }
}
