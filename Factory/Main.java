public class Main{
    public static void main(String[] args) {
        CarFactory fact = new CarFactory();
        Car car1 = fact.buildCar(CarType.Model.LUXURY);
        System.out.println("The factory built a " + car1.getModel() + " car.");
        Car car2 = fact.buildCar(CarType.Model.SEDAN);
        System.out.println("The factory built a " + car2.getModel() + " car.");
        Car car3 = fact.buildCar(CarType.Model.SMALL);
        System.out.println("The factory built a " + car3.getModel() + " car.");
    }
    
}
