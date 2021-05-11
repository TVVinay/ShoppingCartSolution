public class Cart {


    private Products name;
    private double price;
    private int quantity;
    private double subtotal;

    public Cart(Products name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        subtotal = price * quantity;
    }

    public Products getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }




}
