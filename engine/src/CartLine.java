public class CartLine {
    Product product;
    int amount;

    public CartLine(Product product, int amount){
        this.product = product;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return amount + " x " + product.name + " " + product.price + "$";
    }
}
