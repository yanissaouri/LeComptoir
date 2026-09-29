package main.Discounts;
import main.Cart;

public class DiscountManager {
    public double getBestDiscount(Cart cart){
        TenPercentDiscount tenPercent = new TenPercentDiscount();
        DrinkDiscount drink = new DrinkDiscount();

        double discountTenPercent = tenPercent.calculateTenPercentDiscount(cart.getTotalPrice());
        double discountDrink = drink.calculateDrinkDiscount(cart);

        return Math.max(discountTenPercent, discountDrink);
    }
}
