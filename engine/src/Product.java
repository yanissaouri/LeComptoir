import enums.Category;

public class Product {
    private int reference;
    private String name;
    private double price;
    private Category category;

    public Product(int reference, String name, double price, Category category) {
        this.reference = reference;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getReference(){
        return reference;
    }

    public void setReference(int reference){
        this.reference = reference;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
