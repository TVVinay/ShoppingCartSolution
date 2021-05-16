public class Milk implements IProduct {

    private String name;
    private double price;
    private int quantity;
    private Categories type;

    public Milk(String name,Categories type, double price, int quantity) {
       this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    public enum Categories{
        CreamedMilk,
        PasteurizedMilk
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
    public String getName() {
        return name;
    }


}
