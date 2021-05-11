import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Cart> cartList;

    public Shop(){
        cartList = new ArrayList<>();
    }

    public void addProductInCart(Cart cart){
       cartList.add(cart);
    }

    public boolean check_itemsAvailable(Products items, int quantity) {
        boolean count = cartList.stream().filter((s) -> s.getName().equals(items) && s.getQuantity() >= quantity).findFirst().isPresent();
        System.out.println(count);
        return count;
    }

    public List<Cart> getProductList() {
        return cartList;
    }

    public double getProductsTotalAmount(){
        double Total = 0;
       for(int i = 0; i< cartList.size(); i++){
          Total += cartList.get(i).getSubtotal();
       }
        return Total;
    }
}
