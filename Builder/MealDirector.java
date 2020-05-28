import java.util.Scanner;

public class MealDirector {
    
    public MealDirector(){}
    
    public void makeMeal(MealBuilder builder){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el sandwich de la orden (N/A para ninguno): ");
        String sandwich = entrada.next();
        System.out.println("Ingrese los extras de la orden (N/A para ninguno): ");
        String sides = entrada.next();
        System.out.println("Ingrese la bebida de la orden (N/A para ninguno): ");
        String drink = entrada.next();
        System.out.println("Ingrese el cupon que canjeara (N/A para ninguno): ");
        String offer = entrada.next();
        System.out.println("Ingrese el total a pagar: ");
        double price = entrada.nextDouble();
        //Se empieza a construir el meal
        System.out.println("Estamos preparando su comida...");
        builder.addSandwich(sandwich);
        builder.addSides(sides);
        builder.addDrink(drink);
        builder.addOffer(offer);
        builder.setPrice(price);   
        System.out.println("Listo!");
    }
}
