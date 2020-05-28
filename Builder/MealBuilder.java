public interface MealBuilder {
    
    public void addSandwich(String sandwich);
    public void addSides(String sides);
    public void addDrink(String drink);
    public void addOffer(String offer);
    public void setPrice(double price);
    public Meal getMeal();
    
}
