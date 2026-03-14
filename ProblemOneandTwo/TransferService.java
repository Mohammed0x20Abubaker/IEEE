public class TransferService {
    public static void transfer(BankAccount accountFrom , BankAccount accountTo , double balanceToBeTransfered){
        if(accountFrom.getAccountBalance() > balanceToBeTransfered){
            accountFrom.withdraw(balanceToBeTransfered);
            accountTo.deposit(balanceToBeTransfered);
            System.out.println("Transaction Completed ");
            return ;
        }
        System.out.println("Transaction Failed");
    }
}
