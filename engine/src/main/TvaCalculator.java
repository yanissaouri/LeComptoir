package main;

import main.enums.Category;

import java.util.List;

public class TvaCalculator {

    private final double totalHT;
    private final double foodTVA ;
    private final double drinkHT ;
    private final double drinkTVA ;
    private final double totalTTC ;
    private double foodHT = 0;


    public TvaCalculator(double totalHT, List<CartLine> cartLines){
        this.totalHT = totalHT;
        this.foodHT = foodHT;


        for (CartLine cartLine : cartLines) {
            if (cartLine.product().getCategory().equals(Category.FOOD)) {
                foodHT += cartLine.totalPrice();
            }
        }
        this.drinkHT = totalHT - foodHT;
        this.foodTVA = foodHT * 0.055;
        this.drinkTVA = drinkHT * 0.2;
        this.totalTTC = totalHT + foodTVA + drinkTVA;
    }


    public double getFoodTVA() {
        return foodTVA;
    }

    public double getDrinkHT() {
        return drinkHT;
    }

    public double getDrinkTVA() {
        return drinkTVA;
    }

    public double getTotalTTC() {
        return totalTTC;
    }

    public double getFoodHT() {
        return foodHT;
    }

    public double getTotalHT() {
        return totalHT;
    }
}