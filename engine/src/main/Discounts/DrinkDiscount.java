package main.Discounts;

import main.Cart;
import main.CartLine;

import java.util.ArrayList;
import java.util.List;

public class DrinkDiscount {

    public double calculateDrinkDiscount(Cart cart){
        ArrayList<CartLine> drinks = cart.cartlineDrinks();

        int totalDrinks = 0;
        for (CartLine drink : drinks){
            totalDrinks += drink.amount();
        }

        int packs = totalDrinks / 3;
        double totalDrinkDiscount = 0;
        for (int i = 0; i < packs ; i++){
            CartLine cheapest = null;
            for(CartLine cartLine : drinks){
                if (cheapest == null || cartLine.product().getPrice() < cheapest.product().getPrice()){
                    cheapest = cartLine;
                }
            }
            if (cheapest != null){
                totalDrinkDiscount += cheapest.product().getPrice();
                drinks.remove(cheapest);
            }
        }
        return totalDrinkDiscount;
    }
}
