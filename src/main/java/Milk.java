public class Milk implements IProduct {

    private String name;
    private double price;
    private int quantity;
    private double subTotalMilk;


    public Milk(String name, double price, int quantity) {
       this.name = name;
        this.price = price;
        this.quantity = quantity;
        subTotalMilk = price * quantity;
    }


    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getSubTotal() {
        return subTotalMilk;
    }

    @Override
    public String getProductName() {
        return name;
    }

}
