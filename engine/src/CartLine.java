public class CartLine {
    Product product;
    int amount;

    public CartLine(Product product, int amount){
        this.product = product;
        this.amount = amount;
    }

    public float setTotalPrice(){
        return product.price * amount;
    }

    @Override
    public String toString() {
        float newPrice = setTotalPrice();
        return amount + " x " + product.name + " " + newPrice + "$";
    }
}
