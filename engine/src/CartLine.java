public class CartLine {
    Product product;
    int amount;

    public CartLine(Product product, int amount){
        this.product = product;
        this.amount = amount;
    }

    public double totalPrice(){
        return product.getPrice() * amount;
    }

    @Override
    public String toString() {
        double newPrice = totalPrice();
        return amount + " x " + product.getName() + " " + newPrice + "$";
    }
}
