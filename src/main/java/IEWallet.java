public interface IEWallet {

    double getWalletBalance();
    void addWalletBalance(double loadBalance);
    void deductAmount(double amount);

}
