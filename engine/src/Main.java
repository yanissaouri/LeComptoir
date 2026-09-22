void main() {
    Product firstProduct = new Product(1, "Coca-Cola", 10.50, "DRINK");
    Product secondProduct = new Product(2, "mikado", 3, "FOOD");
    CartLine firstProductCheckout= new CartLine(firstProduct, 5);
    CartLine secondProductCheckout = new CartLine(secondProduct, 4);

    Cart cart = new Cart();
    cart.addCartline(firstProductCheckout);
    cart.addCartline(secondProductCheckout);

    Checkout checkout = new Checkout(cart);
    checkout.displayTicket();
}