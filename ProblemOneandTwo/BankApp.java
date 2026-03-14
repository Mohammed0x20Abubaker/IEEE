public class BankApp {
    public static void main(String[] args) {
        BankAccount mohammed = new BankAccount("mohammed", 1000);
        BankAccount ahmed = new BankAccount("ahmed", 500);

        TransferService.transfer(mohammed, ahmed ,2000 );
        System.out.println(mohammed.getAccountHolder() + " : " + mohammed.getAccountBalance());
        System.out.println(ahmed.getAccountHolder() + " : " + ahmed.getAccountBalance());
    }

}
