import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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

    public double getTotalPrice(){
        double total = 0;
        for (CartLine cartLine : cartLines){
            total += cartLine.setTotalPrice();
        }
        return total;
    }
}
