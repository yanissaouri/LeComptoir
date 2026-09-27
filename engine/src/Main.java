import enums.Category;

void main() {
    Product firstProduct = new Product(1, "Coca-Cola", 0.50, Category.DRINK);
    Product secondProduct = new Product(2, "pizza", 10, Category.FOOD);
    CartLine firstProductCheckout= new CartLine(firstProduct, 3);
    CartLine secondProductCheckout = new CartLine(secondProduct, 3);

    Cart cart = new Cart();
    cart.addCartline(firstProductCheckout);
    cart.addCartline(secondProductCheckout);

    TvaCalculator tva = new TvaCalculator(cart.getTotalPrice(), cart.getCartline());
    Checkout checkout = new Checkout(cart, tva);
    checkout.displayTicket();
}