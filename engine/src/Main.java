void main() {
    Product firstProduct = new Product(1, "Coca-Cola", 0.50f, "DRINK");
    CartLine firstProductCheckout= new CartLine(firstProduct, 5);

    IO.println(firstProductCheckout);
}