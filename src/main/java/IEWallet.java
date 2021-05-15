public interface IEWallet {

    double getWalletBalance();
    double addWalletBalance(double loadBalance);
    double deductAmount(double amount);

}
