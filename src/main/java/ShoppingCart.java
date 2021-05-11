import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> productList;

    public ShoppingCart(){
        productList = new ArrayList<>();
    }

    public void addProductInCart(Product product){
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public double getProductsTotalAmount(){
        double Total = 0;
       for(int i =0; i<productList.size();i++){
          Total += productList.get(i).getSubtotal();
       }
        return Total;
    }
}
