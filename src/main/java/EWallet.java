public class EWallet {

    private double amount;
    private double amountInWallet;

    public EWallet(double amount, double amountInWallet){
        this.amount = amount;
        this.amountInWallet = amountInWallet;
    }

    public double getAmount() {
        return amount;
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
