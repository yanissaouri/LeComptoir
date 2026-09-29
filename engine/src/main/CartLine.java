package main;

public record CartLine(Product product, int amount) {

    public double totalPrice() {
        return product().getPrice() * amount();
    }

    @Override
    public String toString() {
        double newPrice = totalPrice();
        return amount() + " x " + product().getName() + " " + newPrice + "$";
    }
}
