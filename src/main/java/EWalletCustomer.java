public class EWalletCustomer implements IEWallet{

    private double amountInWallet;

    public EWalletCustomer(double amountInWallet) {
        this.amountInWallet = amountInWallet;
    }

    @Override
    public double getWalletBalance() {
        return amountInWallet;
    }

    @Override
    public double addWalletBalance(double loadBalance) {
        return amountInWallet+=loadBalance;

    }
}




