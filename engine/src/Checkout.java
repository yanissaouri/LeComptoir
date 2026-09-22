public class Checkout{
    Cart cart;

    public Checkout(Cart cart){
        this.cart = cart;
    }
    public void displayTicket(){
        for (CartLine cartLine : cart.getCartline()){
            IO.println(cartLine);
        }
        double totalHT = cart.getTotalPrice();

        double foodHT = 0;
        for(CartLine cartLine : cart.getCartline()){
            if(cartLine.product.category.equals("FOOD")){
                foodHT += cartLine.setTotalPrice();
            }
        }

        double foodTVA = foodHT * 0.055;
        double drinkHT = totalHT - foodHT;
        double drinkTVA = drinkHT * 0.2;
        double totalTTC = totalHT + foodTVA + drinkTVA;

        IO.println(String.format("HT: %.2f$", totalHT));
        IO.println(String.format("TVA: 5.5%% %.2f$ food", foodTVA));
        IO.println(String.format("TVA: 20%% %.2f$ drink", drinkTVA));
        IO.println(String.format("TTC: %.2f$", totalTTC));
    }
}
