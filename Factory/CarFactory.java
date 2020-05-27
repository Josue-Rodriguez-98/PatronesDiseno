public class CarFactory {
    
    public Car buildCar(CarType.Model model){
        switch (model) {
            case SMALL:
                return new SmallCar();
            case SEDAN:
                return new SedanCar();
            case LUXURY:
                return new LuxuryCar();
            default:
                throw new AssertionError();
        }
    }
    
}
