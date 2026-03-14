public class BankAccount {
    //Fields
    private String accountHolder;
    private double accountBalance;

    public BankAccount(String accountHolder, double accountBalance){
        this.accountHolder = accountHolder ;
        this.accountBalance = accountBalance ;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if (accountBalance > 0){
            this.accountBalance += accountBalance;
        }
    }

    public void deposit(double amount){
        this.accountBalance += amount ;
    }

    public void withdraw(double amount){
        this.accountBalance -= amount ;
    }

}
