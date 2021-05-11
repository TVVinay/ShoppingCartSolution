import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest {

    @Test
    public void checkProductAvailableInCart(){
        Shop shop = new Shop();
        Cart cart = new Cart(Products.Apple,100,1);
        shop.addProductInCart(cart);
        boolean checkItemAvailabilty = shop.check_itemsAvailable(Products.Apple,1);
        Assert.assertEquals(checkItemAvailabilty,true);

        Cart cart1 = new Cart(Products.Milk,42,3);
        shop.addProductInCart(cart1);
        boolean checkItemAvailabilty1 = shop.check_itemsAvailable(Products.Milk,2);
        Assert.assertEquals(checkItemAvailabilty1,true);

        Cart cart2 = new Cart(Products.Newspaper,5,5);
        shop.addProductInCart(cart2);
        boolean checkItemAvailabilty3=shop.check_itemsAvailable(Products.Newspaper,6);
        Assert.assertEquals(checkItemAvailabilty3,false);

    }

    @Test
    public void getSubtotalforEachProduct(){

        Cart cart = new Cart(Products.Apple,100,1);
        System.out.println(cart.getName()+" : "+ cart.getSubtotal());
        Assert.assertEquals(cart.getSubtotal(),100.0);

        Cart cart1 = new Cart(Products.Milk,42,3);
        System.out.println(cart1.getName()+" : "+ cart1.getSubtotal());
        Assert.assertEquals(cart1.getSubtotal(),126.0);

        Cart cart2 = new Cart(Products.Newspaper,5,5);
        System.out.println(cart2.getName()+" : "+ cart2.getSubtotal());
        Assert.assertEquals(cart2.getSubtotal(),25.0);

    }

    @Test
    public void getTotalAmount(){

        Shop shop = new Shop();
        Cart cart = new Cart(Products.Apple,100,5);
        System.out.println(cart.getName()+" : "+ cart.getSubtotal());
        Assert.assertEquals(cart.getSubtotal(),500.0);
        shop.addProductInCart(cart);

        Cart cart1 = new Cart(Products.Milk,42,3);
        System.out.println(cart1.getName()+" : "+ cart1.getSubtotal());
        Assert.assertEquals(cart1.getSubtotal(),126.0);
        shop.addProductInCart(cart1);

        Cart cart2 = new Cart(Products.Newspaper,5,5);
        System.out.println(cart2.getName()+" : "+ cart2.getSubtotal());
        Assert.assertEquals(cart2.getSubtotal(),25.0);
        shop.addProductInCart(cart2);

        double totalAmount = shop.getProductsTotalAmount();

        System.out.println("Total Amount Payble is : "+totalAmount);

        Assert.assertEquals(totalAmount,651.0);

    }

    @Test
    public void getPaymentStatusthroughEWallet(){

        Shop shop = new Shop();
        Cart cart = new Cart(Products.Apple,100,5);
        System.out.println(cart.getName()+" : "+ cart.getSubtotal());
        Assert.assertEquals(cart.getSubtotal(),500.0);
        shop.addProductInCart(cart);

        Cart cart1 = new Cart(Products.Milk,42,3);
        System.out.println(cart1.getName()+" : "+ cart1.getSubtotal());
        Assert.assertEquals(cart1.getSubtotal(),126.0);
        shop.addProductInCart(cart1);

        Cart cart2 = new Cart(Products.Newspaper,5,5);
        System.out.println(cart2.getName()+" : "+ cart2.getSubtotal());
        Assert.assertEquals(cart2.getSubtotal(),25.0);
        shop.addProductInCart(cart2);

        double totalAmount = shop.getProductsTotalAmount();

        System.out.println("Total Amount Payble is : "+totalAmount);

        Assert.assertEquals(totalAmount,651.0);

         EWallet eWallet =  new EWallet(totalAmount, 400);

        boolean paymentStatus = eWallet.getPaymentStatus();
        System.out.println("Payment Status from eWallet is : " + paymentStatus);

        Assert.assertEquals(paymentStatus,false);

    }

}
