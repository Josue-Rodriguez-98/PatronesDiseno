public class SandwichMealBuilder implements MealBuilder{
    
    private Meal meal = null;

    public SandwichMealBuilder() {
        this.meal = new Meal();
    }

    public SandwichMealBuilder(Meal meal) {
        this.meal = meal;
    }    

    @Override
    public void addSandwich(String sandwich) {
        this.meal.sandwich = sandwich;
    }

    @Override
    public void addSides(String sides) {
        this.meal.sideOrder = sides;
    }

    @Override
    public void addDrink(String drink) {
        this.meal.drink = drink;
    }

    @Override
    public void addOffer(String offer) {
        this.meal.offer = offer;
    }

    @Override
    public void setPrice(double price) {
        this.meal.price = price;
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }
    
}
