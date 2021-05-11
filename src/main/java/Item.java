public class Item {


    private Product name;
    private double price;
    private int quantity;
    private double subtotal;

    public Item(Product name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        subtotal = price * quantity;
    }

    public Product getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }




}
