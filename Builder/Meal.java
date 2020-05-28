public class Meal {
    
    public String sandwich;
    public String sideOrder;
    public String drink;
    public String offer;
    public double price;

    public Meal() {}

    public Meal(String sandwich, String sideOrder, String drink, String offer, double price) {
        this.sandwich = sandwich;
        this.sideOrder = sideOrder;
        this.drink = drink;
        this.offer = offer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Meal:\n" + "1) Sandwich: " + sandwich + "\n2) Side Order: " + sideOrder + "\n3) Drink: " + drink + "\n4) Offer: " + offer + "\n5) Price: " + price;
    }  
}
