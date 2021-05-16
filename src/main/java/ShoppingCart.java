import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<IProduct> products;
    public ShoppingCart(){
        products = new ArrayList<>();
    }

    public void addProduct(IProduct product){
        products.add(product);
    }

    public List<IProduct> getProduct(){
        return products;
    }

    public double getSubTotal(IProduct product){
        return product.getPrice() * product.getQuantity();
    }

    public void removeProduct(IProduct product){
        products.remove(product);
    }

    public double getTotalAmount(){
        double Total = 0;
        for(IProduct product : getProduct()){
            Total+=getSubTotal(product);
        }
        return Total;
    }

    public boolean isItemAvailable(String item) {
        int stock = 8;
        return getProduct().stream().anyMatch((s) -> s.getName().equals(item)
                && s.getQuantity() <= stock);
    }
}
