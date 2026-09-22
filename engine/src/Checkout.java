public class Checkout{
    Cart cart;

    public Checkout(Cart cart){
        this.cart = cart;
    }
    public void displayTicket(){
        for (CartLine cartLine : cart.getCartline()){
            IO.println(cartLine);
        }
        IO.println("Total: " + cart.getTotalPrice() + "$");
    }
}
