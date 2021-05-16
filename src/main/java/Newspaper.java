public class Newspaper implements IProduct {

    private String name;
    private Categories type;
    private double price;
    private int quantity;

    public Newspaper(String name , Categories type, double price, int quantity) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public enum Categories{
        EnglishNewspaper,
        HindiNewspaper
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
