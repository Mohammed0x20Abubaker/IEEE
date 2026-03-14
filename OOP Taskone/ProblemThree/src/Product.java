public class Product {
    private int price ;
    private boolean inStock;

    public Product(int price , boolean inStock){
        this.price = price;
        this.inStock = inStock ;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price > 0){
            this.price = price;
        }
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
