void main() {
    Product coca = new Product(1, "Coca-Cola", 0.50f, "DRINK");
    CartLine test= new CartLine(coca, 5);

    IO.println(test);
}