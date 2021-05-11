import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest {

    @Test
    public void checkItemAvailablilty(){
        Shop shop = new Shop();
        Item item = new Item(Product.Apple,100,1);
        shop.addProductInCart(item);
        boolean checkItemAvailabilty = shop.check_itemsAvailable(Product.Apple,1);
        Assert.assertEquals(checkItemAvailabilty,true);

        Item item1 = new Item(Product.Milk,42,3);
        shop.addProductInCart(item1);
        boolean checkItemAvailabilty1 = shop.check_itemsAvailable(Product.Milk,2);
        Assert.assertEquals(checkItemAvailabilty1,true);

        Item item2 = new Item(Product.Newspaper,5,5);
        shop.addProductInCart(item2);
        boolean checkItemAvailabilty3=shop.check_itemsAvailable(Product.Newspaper,6);
        Assert.assertEquals(checkItemAvailabilty3,false);

    }

    @Test
    public void getSubtotalforEachItem(){

        Item item = new Item(Product.Apple,100,1);
        System.out.println(item.getName()+" : "+ item.getSubtotal());
        Assert.assertEquals(item.getSubtotal(),100.0);

        Item item1 = new Item(Product.Milk,42,3);
        System.out.println(item1.getName()+" : "+ item1.getSubtotal());
        Assert.assertEquals(item1.getSubtotal(),126.0);

        Item item2 = new Item(Product.Newspaper,5,5);
        System.out.println(item2.getName()+" : "+ item2.getSubtotal());
        Assert.assertEquals(item2.getSubtotal(),25.0);

    }

    @Test
    public void getTotalAmount(){

        Shop shop = new Shop();
        Item item = new Item(Product.Apple,100,5);
        System.out.println(item.getName()+" : "+ item.getSubtotal());
        Assert.assertEquals(item.getSubtotal(),500.0);
        shop.addProductInCart(item);

        Item item1 = new Item(Product.Milk,42,3);
        System.out.println(item1.getName()+" : "+ item1.getSubtotal());
        Assert.assertEquals(item1.getSubtotal(),126.0);
        shop.addProductInCart(item1);

        Item item2 = new Item(Product.Newspaper,5,5);
        System.out.println(item2.getName()+" : "+ item2.getSubtotal());
        Assert.assertEquals(item2.getSubtotal(),25.0);
        shop.addProductInCart(item2);

        double totalAmount = shop.getProductsTotalAmount();

        System.out.println("Total Amount Payble is : "+totalAmount);

        Assert.assertEquals(totalAmount,651.0);

    }

    @Test
    public void getPaymentStatusthroughEWallet(){

        Shop shop = new Shop();
        Item item = new Item(Product.Apple,100,5);
        System.out.println(item.getName()+" : "+ item.getSubtotal());
        Assert.assertEquals(item.getSubtotal(),500.0);
        shop.addProductInCart(item);

        Item item1 = new Item(Product.Milk,42,3);
        System.out.println(item1.getName()+" : "+ item1.getSubtotal());
        Assert.assertEquals(item1.getSubtotal(),126.0);
        shop.addProductInCart(item1);

        Item item2 = new Item(Product.Newspaper,5,5);
        System.out.println(item2.getName()+" : "+ item2.getSubtotal());
        Assert.assertEquals(item2.getSubtotal(),25.0);
        shop.addProductInCart(item2);

        double totalAmount = shop.getProductsTotalAmount();

        System.out.println("Total Amount Payble is : "+totalAmount);

        Assert.assertEquals(totalAmount,651.0);

         EWallet eWallet =  new EWallet(totalAmount, 400);

        boolean paymentStatus = eWallet.getPaymentStatus();
        System.out.println("Payment Status from eWallet is : " + paymentStatus);

        Assert.assertEquals(paymentStatus,false);

        eWallet.getPaymentReceipt();

    }

}
