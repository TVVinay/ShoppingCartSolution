public class EWallet {

    private double totalAmount;
    private double amountInWallet;

    public EWallet(double totalAmount, double amountInWallet){
        this.totalAmount = totalAmount;
        this.amountInWallet = amountInWallet;
    }

    public double getAmount() {
        return totalAmount;
    }

    public double getAmountInWallet() {
        return amountInWallet;
    }

    public boolean getPaymentStatus(){
       if(getAmountInWallet()>getAmount()){
           double balanceAfterDeduction = getAmountInWallet() - getAmount();
           System.out.println("Balance After deduction from Wallet : "+balanceAfterDeduction);
           return true;
       }
        return false;
    }


}
