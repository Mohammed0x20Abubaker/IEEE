public class PurchaseService {
    public static void transfer(Customer customer , Product product) {
        if (product.isInStock()){
            if(customer.getBalance() > product.getPrice()){
                customer.withdraw(product.getPrice());
                System.out.println("Done..");
            }
            System.out.println("Insufficient funds ");
            return ;
        }
        System.out.println("Product not available ");
    }
}


