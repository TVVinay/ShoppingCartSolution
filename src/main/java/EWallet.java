public class EWallet implements IEWallet{

    private double balance;

    public EWallet(double amount) {
        this.balance = amount;
    }

    @Override
    public double getWalletBalance() {
        return balance;
    }

    @Override
    public double addWalletBalance(double loadBalance) {
        return balance+=loadBalance;
    }

    @Override
    public double deductAmount(double amount) {
       if(balance>amount){
           return this.balance-=amount;
       }
       else {
           System.out.println("InSuffucient balance!!! Please load you Wallet");
       }
        return 0;
    }
}




