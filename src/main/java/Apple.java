public class Apple implements IProduct {

    private int quantity;
    private double amount;
    private double subTotal;
    private String name;


    public Apple(String name , int quantity, double amount) {
        this.name = name;
        this.quantity = quantity;
        this.amount = amount;
        subTotal = amount * quantity;
    }


    @Override
    public int getQuantity() {
        return quantity;
    }


    @Override
    public double getPrice() {
        return amount;
    }

    @Override
    public double getSubTotal() {
        return subTotal;
    }

    @Override
    public String getProductName() {
        return name;
    }
}
