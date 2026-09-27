import enums.Category;

public class Checkout{
    Cart cart;
    private TvaCalculator tva;

    public Checkout(Cart cart, TvaCalculator tva){
        this.cart = cart;
        this.tva = tva;
    }
    public void displayTicket(){
        for (CartLine cartLine : cart.getCartline()){
            IO.println(cartLine);
        }

        double totalHT = cart.getTotalPrice();
        double foodTVA = tva.getFoodTVA();
        double drinkTVA = tva.getDrinkTVA();
        double totalTTC = tva.getTotalTTC();

        IO.println(String.format("HT: %.2f$", totalHT));
        IO.println(String.format("TVA: 5.5%% %.2f$ food", foodTVA));
        IO.println(String.format("TVA: 20%% %.2f$ drink", drinkTVA));
        IO.println(String.format("TTC: %.2f$", totalTTC));
    }
}
