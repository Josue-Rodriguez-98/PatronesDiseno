public class Main{
    public static void main(String[] args) {
        CarFactory fact = new CarFactory();
        Car car1 = fact.buildCar(CarType.Model.LUXURY);
        System.out.println(car1.getModel());
        Car car2 = fact.buildCar(CarType.Model.SEDAN);
        System.out.println(car2.getModel());
        Car car3 = fact.buildCar(CarType.Model.SMALL);
        System.out.println(car3.getModel());
    }
    
}
