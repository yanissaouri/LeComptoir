package Discounts;

public class TenPercentDiscount {

    private Double totalPrice;

    public double getTotalPrice(){
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double calculateTenPercentDiscount(double totalPrice){
        if (totalPrice >= 50){
            return totalPrice * 0.1;
        }
        return 0;
    }
}

