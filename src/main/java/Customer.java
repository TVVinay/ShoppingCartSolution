public class Customer {

    private ShoppingCart shoppingCart;
    private EWallet eWallet;

    public Customer(EWallet eWallet){
        this.eWallet = eWallet;
       shoppingCart = new ShoppingCart();
    }

    public void addToCart(IProduct product){
        shoppingCart.addProduct(product);
    }

    public void removeProductFromCart(IProduct product){
        shoppingCart.removeProduct(product);
    }

    public double getWalletBalance(){
       return eWallet.getWalletBalance();
    }

    public void addWalletBalance(double amount){
        eWallet.addWalletBalance(amount);
    }


}
