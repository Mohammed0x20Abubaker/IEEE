public class Customer {
    private int balance ;
    private int itemsCount ;

    public Customer(int balance , int itemsCount){
        this.balance = balance ;
        this.itemsCount = itemsCount ;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance > 0 ){
            this.balance = balance;
        }
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        if(itemsCount > 0){
            this.itemsCount = itemsCount;
        }
    }

    public void withdraw(int amount){
        if(this.balance > amount){
            this.balance -= amount ;
        }
    }
    public void addItems(int itemsCount){
        this.itemsCount += itemsCount;
    }
}
