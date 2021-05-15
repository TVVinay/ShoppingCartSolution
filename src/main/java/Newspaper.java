public class Newspaper implements IProduct {

    private String name;
    private String language;
    private double price;
    private int quantity;
    private double subTotalNewsPaper;

    public Newspaper(String name , String language, double price, int quantity) {
        this.name = name;
        this.language = language;
        this.price = price;
        this.quantity = quantity;
    }

    public String getLanguage() {
        return language;
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
    public String getProductName() {
        return name;
    }
}
