import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest {

    @Test
    public void getSubtotalforEachProduct(){

        Product product = new Product("Apple",100,1);
        System.out.println(product.getName()+" : "+product.getSubtotal());
        Assert.assertEquals(product.getSubtotal(),100.0);

        Product product1 = new Product("Milk",42,3);
        System.out.println(product1.getName()+" : "+product1.getSubtotal());
        Assert.assertEquals(product1.getSubtotal(),126.0);

        Product product2 = new Product("Newspaper",5,5);
        System.out.println(product2.getName()+" : "+product2.getSubtotal());
        Assert.assertEquals(product2.getSubtotal(),25.0);

    }

    @Test
    public void getTotalAmount(){

        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product("Apple",100,5);
        System.out.println(product.getName()+" : "+product.getSubtotal());
        Assert.assertEquals(product.getSubtotal(),500.0);
        shoppingCart.addProductInCart(product);

        Product product1 = new Product("Milk",42,3);
        System.out.println(product1.getName()+" : "+product1.getSubtotal());
        Assert.assertEquals(product1.getSubtotal(),126.0);
        shoppingCart.addProductInCart(product1);

        Product product2 = new Product("Newspaper",5,5);
        System.out.println(product2.getName()+" : "+product2.getSubtotal());
        Assert.assertEquals(product2.getSubtotal(),25.0);
        shoppingCart.addProductInCart(product2);

        double totalAmount = shoppingCart.getProductsTotalAmount();

        System.out.println("Total Amount Payble is : "+totalAmount);

        Assert.assertEquals(totalAmount,651.0);

    }

    @Test
    public void getPaymentStatusthroughEWallet(){

        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product("Apple",100,5);
        System.out.println(product.getName()+" : "+product.getSubtotal());
        Assert.assertEquals(product.getSubtotal(),500.0);
        shoppingCart.addProductInCart(product);

        Product product1 = new Product("Milk",42,3);
        System.out.println(product1.getName()+" : "+product1.getSubtotal());
        Assert.assertEquals(product1.getSubtotal(),126.0);
        shoppingCart.addProductInCart(product1);

        Product product2 = new Product("Newspaper",5,5);
        System.out.println(product2.getName()+" : "+product2.getSubtotal());
        Assert.assertEquals(product2.getSubtotal(),25.0);
        shoppingCart.addProductInCart(product2);

        double totalAmount = shoppingCart.getProductsTotalAmount();

        System.out.println("Total Amount Payble is : "+totalAmount);

        Assert.assertEquals(totalAmount,651.0);

         EWallet eWallet =  new EWallet(totalAmount, 400);

        boolean paymentStatus = eWallet.getPaymentStatus();
        System.out.println("Payment Status from eWallet is : " + paymentStatus);

        Assert.assertEquals(paymentStatus,false);

    }

}
