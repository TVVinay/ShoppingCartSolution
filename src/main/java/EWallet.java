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

    public void getPaymentReceipt(){
        if(getPaymentStatus()){
            System.out.println("Paid, Successfully from you EWallet");
        }
        else
            System.out.println("Insufficient Amount!! Please load you Wallet with balance");
    }




}
