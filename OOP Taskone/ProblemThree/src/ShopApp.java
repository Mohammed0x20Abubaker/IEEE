public class ShopApp {
    public static void main(String[] args) {
        Customer customer = new Customer(100,0);
        Product phone = new Product(150,true);
        Product book = new Product(30,false);

        PurchaseService.transfer(customer,book);
        PurchaseService.transfer(customer,phone);
    }
}
