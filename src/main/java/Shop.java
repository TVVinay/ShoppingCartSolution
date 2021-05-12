import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<IProduct> itemList;

    public Shop(){
        itemList = new ArrayList<>();
    }

    public void addProductInCart(IProduct product){
       itemList.add(product);
    }

    public boolean checkItemsAvailable(String items) {
        int stock = 8;
        return itemList.stream().anyMatch((s) -> s.getProductName().equals(items) && s.getQuantity() <= stock);
    }


    public double getProductsTotalAmount(){
        double Total = 0;
       for(int i = 0; i< itemList.size(); i++){
          Total += itemList.get(i).getSubTotal();
       }
        return Total;
    }

    public boolean getPaymentStatus(double amountInWallet){
        EWalletCustomer wallet = new EWalletCustomer(amountInWallet);
        if(wallet.getWalletBalance()>getProductsTotalAmount()){
            double balanceAfterDeduction = wallet.getWalletBalance() - getProductsTotalAmount();
            System.out.println("Balance After deduction from Wallet : "+balanceAfterDeduction);
            return true;
        }
        return false;
    }
}
