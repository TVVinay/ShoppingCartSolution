import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest {

    @Test
    public void verifyItemAvailablilty(){
        Shop shop = new Shop();
        Apple apple = new Apple("Fresh Apple",1,100);
        shop.addProductInCart(apple);

        boolean checkItemAvailabilty = shop.checkItemsAvailable("Fresh Apple");
        System.out.println("Item available ? "+checkItemAvailabilty);
        Assert.assertEquals(checkItemAvailabilty,true);


        Milk milk = new Milk("Pasteurized Milk",45,10);
        shop.addProductInCart(milk);
        boolean checkItemAvailabilty1 = shop.checkItemsAvailable("Pasteurized Milk");
        System.out.println("Item available ? "+checkItemAvailabilty1);
        Assert.assertEquals(checkItemAvailabilty1,false);


       Newspaper newspaper = new Newspaper("English Newspaper","English",5,5);
        shop.addProductInCart(newspaper);
        boolean checkItemAvailabilty2=shop.checkItemsAvailable("English Newspaper");
        System.out.println("Item available ? "+checkItemAvailabilty2);
        Assert.assertEquals(checkItemAvailabilty2,false);

    }

    @Test
    public void verifySubtotalforEachItem(){

        Apple apple = new Apple("Fresh Apple",1,100);
        System.out.println(apple.getProductName()+" : "+ apple.getSubTotal());
        Assert.assertEquals(apple.getSubTotal(),100.0);

        Milk milk = new Milk("Pasteurized Milk",45,10);
        System.out.println(milk.getProductName()+" : "+ milk.getSubTotal());
        Assert.assertEquals(milk.getSubTotal(),450);

        Newspaper newspaper = new Newspaper("English Newspaper","English",5,5);
        System.out.println(newspaper.getProductName()+" : "+ newspaper.getSubTotal() + " Language : "+newspaper.getLanguage());
        Assert.assertEquals(newspaper.getSubTotal(),26.0);

    }

    @Test
    public void verifyTotalAmount(){

        Shop shop = new Shop();
        Apple apple = new Apple("Fresh Apple",1,100);
        shop.addProductInCart(apple);

        Milk milk = new Milk("Pasteurized Milk",45,10);
        shop.addProductInCart(milk);

        Newspaper newspaper = new Newspaper("English Newspaper","English",5,5);
        shop.addProductInCart(newspaper);

        double totalAmount = shop.getProductsTotalAmount();
        System.out.println("Total Amount Payble is : "+totalAmount);
        Assert.assertEquals(totalAmount,575.0);

    }

    @Test
    public void verifyPaymentStatusViaEWallet(){

        Shop shop = new Shop();
        Apple apple = new Apple("Fresh Apple",1,100);
        shop.addProductInCart(apple);

        Milk milk = new Milk("Pasteurized Milk",45,10);
        shop.addProductInCart(milk);

        Newspaper newspaper = new Newspaper("English Newspaper","English",5,5);
        shop.addProductInCart(newspaper);

        double totalAmount = shop.getProductsTotalAmount();
        System.out.println("Total Amount Payble is : "+totalAmount);

        EWalletCustomer eWallet =  new EWalletCustomer(322);

        boolean paymentStatus = shop.getPaymentStatus(eWallet.getWalletBalance());
        System.out.println("Payment Status from eWallet is : " + paymentStatus);

       Assert.assertEquals(paymentStatus,false);


    }

    @Test
    public void verifyAddWalletBalance(){
        EWalletCustomer eWalletCustomer = new EWalletCustomer(4000);
        eWalletCustomer.addWalletBalance(200);
        System.out.println("Balance in the Wallet after loading the amount : "+eWalletCustomer.getWalletBalance());

    }

}
