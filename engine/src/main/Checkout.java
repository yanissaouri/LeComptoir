package main;

import main.Discounts.DiscountManager;
import main.Discounts.DrinkDiscount;

public class Checkout{
    private Cart cart;

    public Checkout(Cart cart){
        this.cart = cart;
    }
    public void displayTicket(){
        for (CartLine cartLine : cart.getCartline()){
            IO.println(cartLine);
        }

        double totalHT = cart.getTotalPrice();

        DiscountManager manager = new DiscountManager();
        double bestDiscount = manager.getBestDiscount(cart);
        double totalAfterDiscount = totalHT - bestDiscount;
        TvaCalculator tva = new TvaCalculator(totalAfterDiscount, cart.getCartline());


        IO.println(String.format("HT: %.2f$", totalHT));
        IO.println(String.format("TVA: 5.5%% %.2f$ food", tva.getFoodTVA()));
        IO.println(String.format("TVA: 20%% %.2f$ drink", tva.getDrinkTVA()));
        IO.println(String.format("TTC: %.2f$", tva.getTotalTTC()));
    }
}
