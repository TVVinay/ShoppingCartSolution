import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Item> itemList;

    public Shop(){
        itemList = new ArrayList<>();
    }

    public void addProductInCart(Item item){
       itemList.add(item);
    }

    public boolean check_itemsAvailable(Product items, int quantity) {
        boolean count = itemList.stream().filter((s) -> s.getName().equals(items) && s.getQuantity() >= quantity).findFirst().isPresent();
        System.out.println(count);
        return count;
    }

    public List<Item> getProductList() {
        return itemList;
    }

    public double getProductsTotalAmount(){
        double Total = 0;
       for(int i = 0; i< itemList.size(); i++){
          Total += itemList.get(i).getSubtotal();
       }
        return Total;
    }
}
