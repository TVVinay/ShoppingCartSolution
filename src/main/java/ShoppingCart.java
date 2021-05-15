import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<IProduct> items;
    public ShoppingCart(){
        items = new ArrayList<>();
    }

    public void addProduct(IProduct product){
        items.add(product);
    }

    public List<IProduct> getProduct(){
        return items;
    }

    public double getSubTotal(IProduct product){
        return product.getPrice() * product.getQuantity();
    }

    public void removeProduct(IProduct product){
        items.remove(product);
    }

    public double getTotalAmount(){
       /* double total = 0;
        for(IProduct product : items){
            total+= product.getPrice() * product.getQuantity();
            return total;
        }
        return total;*/
        double Total = 0;
        for(IProduct product : items){
            Total+=getSubTotal(product);
        }
        return Total;
    }

    public boolean checkItemsAvailable(String item) {
        int stock = 8;
        return getProduct().stream().anyMatch((s) -> s.getProductName().equals(item)
                && s.getQuantity() <= stock);
    }

    public boolean getPaymentStatus(double amountInWallet, double totalAmount){
        EWallet wallet = new EWallet(amountInWallet);
        if(wallet.getWalletBalance()>totalAmount){
            return true;
        }
        return false;
    }


}
