public class Main {

    public static void main(String[] args) {
        MealDirector director = new MealDirector();
        MealBuilder builder = new SandwichMealBuilder();
        director.makeMeal(builder);
        System.out.println(builder.getMeal().toString());
    }
}