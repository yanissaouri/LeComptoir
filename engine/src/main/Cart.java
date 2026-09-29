package main;

import main.enums.Category;

import java.util.ArrayList;

public class Cart {
    ArrayList<CartLine> cartLines;

    public Cart(){
        this.cartLines = new ArrayList<>();
    }

    public ArrayList<CartLine> getCartline(){
        return this.cartLines;
    }

    public void addCartline(CartLine cartLine){
        cartLines.add(cartLine);
    }

    public ArrayList<CartLine> cartlineDrinks(){
        ArrayList<main.CartLine> drinks = new ArrayList<>();
        for (main.CartLine cartLine : cartLines){
            if(cartLine.product().getCategory().equals(Category.DRINK)){
                drinks.add(cartLine);
            }
        }
        return drinks;
    }

    public double getTotalPrice(){
        double total = 0;
        for (CartLine cartLine : cartLines) {
            total += cartLine.totalPrice();
        }
        /* if (total >= 50){
            total = total * 0.9 ;
        }
        ArrayList<main.CartLine> drinks = new ArrayList<>();
        for (main.CartLine cartLine : cartLines){
            if(cartLine.product().getCategory().equals(Category.DRINK)){
                drinks.add(cartLine);
            }
        }
        int totalDrinks = 0;
        for(main.CartLine drink : drinks){
            totalDrinks += drink.amount();
        }
        int packs = totalDrinks / 3;
        for(int i = 0; i < packs; i++){
            main.CartLine cheapest = null;
            for(main.CartLine cartLine : drinks){
                if(cheapest == null || cartLine.product().getPrice() < cheapest.product().getPrice()){
                    cheapest = cartLine;
                }
            }
            if(cheapest !=null) {
                total -= cheapest.product().getPrice();
                drinks.remove(cheapest);
            }
        }
*/
        return total;
    }
}
